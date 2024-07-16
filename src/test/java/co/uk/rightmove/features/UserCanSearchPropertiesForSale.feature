Feature: Search Properties For Sale
  Scenario: User can successfully search for properties for sale
    Given I navigate to the homepage
    And I click accept cookies
    When I enter 'OL8' in the search bar
    And I click on 'For Sale'
    Then the search criteria page is displayed
    And select the search radius as 'Within 5 miles'
    And I select the minimum price range as '200,000'
    And I select the maximum price range as '350,000'
    And I select the min number of bedrooms as '3'
    And I select the max number of bedrooms as '5'
    And I select the property type as 'Houses'
    And I select added to site 'Last 3 days'
    And I click find properties
    Then the property details page is displayed
    And I click on the first property