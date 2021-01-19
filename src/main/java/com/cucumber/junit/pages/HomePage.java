package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static java.lang.String.format;

public class HomePage extends BasePage {

    private static final String CUCUMBER_URL = "https://cucumber.io/";
    private static final String SEARCH_ICON = "//*[contains(@class,'search-ico')]//*[contains(@class,'fal fa-search')]";
    private static final String SEARCH_FIELD = "//*[contains(@placeholder,'Search...')]";
    private static final String FILTER_PARAMETER = "%s[contains(text(),'%s')]";
    private static final String FILTER_MENU = "//div[contains(@class,'filter-item')]";
    private static final String SEARCH_RESULTS_LIST = "//div[@class='item-content']";
    private static final String TITLE_NAME_OF_FIRST_LINK = "//div[@class='link-title']";
    private static final String PAGE_TITLE_NAME = "//div[@class='hero-header']";

    public void openCucumberWebSite() {
        openUrl(CUCUMBER_URL);
    }

    public WebElement clickSearchButton() {
        return findElement(By.xpath(SEARCH_ICON));
    }

    public void searchByArticle(String searchArticle) {
        findElement(By.xpath(SEARCH_FIELD)).sendKeys(searchArticle);
        findElement(By.xpath(SEARCH_FIELD)).sendKeys(Keys.ENTER);
        pause(1000);
    }

    public void filterSearchResultByParameter(String sortParameter) {
        findElement(By.xpath(format(FILTER_PARAMETER, FILTER_MENU, sortParameter))).click();
    }

    public String openFirstResultLinkContainsPredeterminedArticle() {
        String title = findElements(By.xpath(SEARCH_RESULTS_LIST)).get(0).findElement(By.xpath(TITLE_NAME_OF_FIRST_LINK)).getText();
        findElements(By.xpath(SEARCH_RESULTS_LIST)).get(0).click();
        return title;
    }

    public String getTitlePageName(){
        System.out.println("page title name: "+findElement(By.xpath(PAGE_TITLE_NAME)).getText());
        return findElement(By.xpath(PAGE_TITLE_NAME)).getText();
    }

    public void pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
