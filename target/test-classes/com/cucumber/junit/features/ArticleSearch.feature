Feature:As a user wants to check result of searching of predetermined articles

  @smoke
  Scenario:after searching should appeared page with a correct name
    Given user opens Cucumber website
    Then user clicks the search button
    And input the word "Announces" in search field
    Then to filter the search results by parameter "Blog"
    Then open the first appeared link by format «Open Source | *Article Name* »
    And to verify that page was opened with correct name

