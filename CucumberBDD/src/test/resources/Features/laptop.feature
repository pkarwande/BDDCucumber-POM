#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Feature to test end to end Purchase a Laptop flow

Scenario Outline: Check whether user is able to purchase a new laptop from the application

		Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on login button
    And user is navigated to home page
    And user click on Laptop category
    And user click on MacBook Pro
    Then user click on Add To Cart
    Then user click on Cart
    Then user click on Place Order
    Then user enters personal details
    Then user clicks on OK
    
    Examples:
    | username | | password |
    | prachiti.karwande | | Test@123 |

 
