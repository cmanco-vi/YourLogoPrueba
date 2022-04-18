#Autor: Crihstian Manco
@HU3
Feature: yourlogo
  As a user, I want to add new items to the wish list

  @prueba
  Scenario Outline: Add new items

    Given than Crihstian Manco wants to visit the yourlogo page
    And he login to the page
      | email   | password   |
      | <email> | <password> |
    When he go to a shopping section in the page to find and add items to the wish list by clicking the Add to Wishlist button
    Then he validate the wish list section

    Examples:
      | email                      | password |
      | cmanco@choucairtesting.com | abc123   |

  @prueba2
  Scenario Outline: Create new list

    Given than Crihstian wants to visit the yourlogo page
    And he login to the yourlogo page
      | email   | password|
      | <email> | <password>|

    When Being in the MY WISH LISTS section enter a new name for the wish list
      |name |
      |<name>|
    Then he validates that the new wishlist has been created
    Examples:
      | email                      | password |name|
      | cmanco@choucairtesting.com | abc123   |Nuevalista|

