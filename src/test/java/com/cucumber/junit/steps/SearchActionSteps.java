package com.cucumber.junit.steps;

import com.cucumber.junit.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchActionSteps {

    HomePage homePage = new HomePage();

    private static String title;

    @When("user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage.openCucumberWebSite();
    }

    @Then("user clicks the search button")
    public void clickSearchButton() {
        homePage.clickSearchButton().click();
    }

    @Then("input the word {string} in search field")
    public void inputArticleNameToSearch(String searchArticle) {
        homePage.searchByArticle(searchArticle);
    }

    @Then("to filter the search results by parameter {string}")
    public void filterSearchResultsByParameter(String sortParameter) {
        homePage.filterSearchResultByParameter(sortParameter);
    }

    @Then("open the first appeared link by format «Open Source | *Article Name* »")
    public void openFirstResultLinkContainsPredeterminedArticle() {
        title = homePage.openFirstResultLinkContainsPredeterminedArticle();
    }

    @And("to verify that page was opened with correct name")
    public void verifyPageTitleName() {
        Assert.assertTrue("TEST FAILED: page name is not correct",title.contentEquals(homePage.getTitlePageName()));
    }
}
