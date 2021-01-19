package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void openUrl(String url) {
        DriverManager.getDriver().get(url);
    }

    public boolean waitWebElementBecameVisible(WebElement webElement) {
        while (!webElement.isDisplayed()){
        }
        return true;
    }

    public WebElement findElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return DriverManager.getDriver().findElements(by);
    }

    public boolean isElementDisplayed(By by) {
        return !findElements(by).isEmpty();
    }
}
