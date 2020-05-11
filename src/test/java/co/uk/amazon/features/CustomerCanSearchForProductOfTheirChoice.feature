Feature: Search For Products For Sale
  As a customer
  I want the ability to search for product for sale
  So that i can buy a product of my choice

 Scenario Outline: Customer Can Search For Product Of Their Choice
   Given I navigate to amazon homepage
   When I enter my "<Product>" on search textbox
   And Click on searchbutton
   Then New "<Product>" detail is displayed
   And I click on any of the result to view more detail

  Examples:

            |Product   |
            |Samsung TV|
           # | Test Book|

            #| Bicycle  |



  Scenario Outline: customer cannot search for product of their choice with missing value
  Given I navigate to amazon homepage
  When I left my "<Product>" detail emty
  And click on sendbutton
  Then same page remain


  Examples:
    |Product   |
    |          |






