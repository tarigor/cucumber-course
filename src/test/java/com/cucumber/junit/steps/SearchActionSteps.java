package com.cucumber.junit.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchActionSteps {
    @Given("user opens Cucumber website")
    public void openCucumberWebsite() {
    }

    @Then("user clicks the search button")
    public void clickSearchButton() {
    }

    @And("input the word {string} in search field")
    public void inputArticleNameToSearch(String searchArticle) {
    }

    @Then("to filter the search results by parameter {string}")
    public void filterSearchResultsByParameter(String sortParameter) {
    }

    @Then("open the first appeared link by format «Open Source | {string}»")
    public void openFirstResultLinkContainsPredeterminedArticle(String articleName) {
    }

    @And("to verify that page was opened with name {string}")
    public void verifyPageTitleName(String articleName) {
    }
}
