@manipulation
Feature: Add and Delete a user to the users list

@add
  Scenario: Add a user to the users list
    Given a list of users are available
    When I add a user to my list "name 11" , "32", 11
    Then get the list of users after add
  
    
@delete
 Scenario: Delete the created user
    Given a list of users are available 
    When delete th user with id 3
    Then  get the list of users after deleting without id 3
    
    