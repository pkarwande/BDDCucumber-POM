Feature: Feature to test end to end Purchase a Laptop flow

Scenario Outline: Check whether user is able to purchase a new laptop from the application

		Given user opens browser
    And user logs into application
    And user click on Laptop category
    And user click on MacBook Pro
    Then user click on Add To Cart
    Then user click on Cart
    Then user click on Place Order
    Then user enters personal details
    |name|country|city|card|month|year|
    |James Smith|India|Pune|756453627|July|2020|
    Then user clicks on OK
    
 
