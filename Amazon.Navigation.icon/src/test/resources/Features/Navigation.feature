#Author: ecebhuvaneswari1995@gmail.com
Feature: Verifying Navigation Icon possible scenarios

  @tag1
  Scenario: Check Whether the Navigation menu is available and clickable or not
    Given I am at the Amazon site
    When I Check the left side, the Navigation icon is visible
    And I Verify that the Navigation icon is clickable

  @tag2
  Scenario: Check no.of main sections and all has subsections
    Given I am at the Amazon site
    When I Check the left side, the Navigation icon is visible
    When I Verify that the Navigation icon is clickable
    Then I check the Main menus count

  Scenario: Check whether the "see all" options is available and its expandable
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Scroll to the shopcategory
    And click on the see all option
    Then Check whether its showing more menus

  Scenario: Check whether the "see all" options is available and its expandable
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Scroll to the shopcategory
    And click on the see all option
    Then Check whether its showing more menus

  Scenario: Check whether the "see less" option is visible or not once expanded
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Scroll to the shopcategory
    And Click on the see less option
    Then Check whether its closing the more menus

  Scenario: Check whether the main menu is redirecting to sub menu
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Scroll to the shopcategory
    And click on the mobiles and computers
    Then Check whether its showing sub menus


  Scenario: Check whether the sub menu is redirecting to the main menu
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Scroll to the shopcategory
    And click on the mobiles and computers
    Then Check whether its showing sub menus
    Then Click on the sub menu back arrow
    Then Check whether its redirecting to Main menus or not

  Scenario: Check whether the product page is redicting from menu or not
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Click on the best seller
    And it should be redicting to product listing page

  Scenario: Check whether the navigation menu is available while changing language or not
    Given I am at the Amazon site
    When Change the language
    And I Check the left side, the Navigation icon is visible
    When I Verify that the Navigation icon is clickable
    Then I check the Main menus count

  Scenario: Check whether the sign in option is available in the navigation menu or not
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Check whether the sign in menu is available or not
    Then Click on the sign in and check whether its redirecting to the sign in page
    
     Scenario: Check whther the navigation menu is displaying once signed in or not
    Given I am at the Amazon site
    When Click on the sign in button
    And Enter user name and password and sign in
    Then Click on the sign in and check whether its redirecting to the sign in page
    
    
     Scenario: Check whether the sign out option is available in navigation menu once signed in
    Given I am at the Amazon site
    When Click on the sign in button
    And Enter user name and password and sign in
    And I Verify that the Navigation icon is clickable
    And Check whether the sign out option displaying
    And Click on the sign out button
    Then Check whether it is signing out or not 
    
     Scenario: Check whether the amazon mini tv free entertainment is available or not
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Check whether the "Amazon minitv - free entertainment" menu is available or not
    Then Check whether its redirecting to the the entertainment page
    
    
     Scenario: Check whether the navigation icon is available or not
    Given I am at the Amazon site
    When I Verify that the Navigation icon is clickable
    And Check whether the "Amazon minitv - free entertainment" menu is available or not
    And Check whether its redirecting to the the entertainment page
    Then Check whether the navigation icon is available or not
    

