
Feature: Validate the Login feature

  #Scenario: Validate the Login feature with Valid username and Password
  #Given User is on Login Page
  #When  user enters valid username "Naresh@gmail.com"
  #And  user enters valid password "P2323e2"
  #Then clicks on submit
  #
 @smoke 
 Scenario Outline: Title of your scenario outline
   Given User is on Login Page
  When  user enters valid singlename"<name>"
  And  user enters valid password"<password>"
  Then clicks on submit
    Examples: 
      |name|password|
      |suryaganesh397@gmail.com|Padd2212312|
      | suryaganesh397@gmail.com|232GY&^^&*|