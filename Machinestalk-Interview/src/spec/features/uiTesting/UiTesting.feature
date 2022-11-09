Feature: I fill out the form
  As a user I want to fill the form in the demoqa site

  @fillForm
  Scenario: I fill out the form
    Given I access the demoqa application
    When I enter First Name  "Mahmoud"
    And I enter name "Eloier"
    And I enter Email "Eloier.mahmoud@gmail.com"
    And I enter the genre "male"
    And I enter Phone number "58811112"
    And I enter date of birth "Thursday, July 28th, 1994"
    And I enter the subject "inscreption "
    And I enter hobbies "Sport"
    And I select an image "src\test\resources\image\2550.jpg"
    And I enter Address "Res El AMen Bloc D Appart D 3-2"
    And I enter the status "NCR"
    And I enter the city "Delhi"
    And I click on the submit button
    Then I am redirecting to the register "Thanks for submitting the form"
