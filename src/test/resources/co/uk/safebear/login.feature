
  Feature: Login
    In order to access the website
    As user
    I want to know if my login is succesful

    Rules
    *The User must be informed if the login information is incorrect
    *The User must be informed if the login information is succesful

    Glossary:
    *User: Someone who wants to create a Tools List using our application
    *Supporter: This is what a customer calls "Admin" users

    Background: logout
      Given I am logged out

    @High-Impact
      Scenario Outline: a Valid user logs into the application
        #Given I am logged out
        When I enter username "<username>" and password "<password>"
        Then Then the user is informed that the login is succesful
        Examples:
        |username|password|
        |tester  |letmein |
        |tester1 |letmein |
        |tester  |letmein |

        @to-do
        Scenario: an inalid user attempts to login
          #Given I am logged out
          When I enter username "attacker" and password "donletmein"
          Then the user is informed that the login is unsuccesful