Feature: Search Products For Sale
  As a customer
  I want the ability to search for product for sale
  So that i can buy a product of my choice

Scenario Outline: customer can search for product of their choice
   Given i navigate to amazon homepage
   When i enter my "<Product>" name
   And click on searchbutton
   Then new "<product>" is displayed
   And i click on product detail

  Examples:
  |Product   |
  |samsung tv|
  | Test Book|
  | Bicycle  |

  Scenario Outline: customer cannot search for product of their choice with missing value
  Given i navigate to amazon homepage
  When i enter my "<Product>" name
  And click on searchbutton
  Then new "<product>" is displayed
  And i click on product detail

  Examples:
    |Product   |
    |          |






