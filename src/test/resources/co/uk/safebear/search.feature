Feature: In Order to search for a tool
  As user onece logged and tapped on user search i can saearh thee tool

  Rules
  *User should be able to search for a tool
  *User should be able to get all matching tools response

  Background: Search tools list
    Given User has typed tool name Zabby
    And Zabby tool list is returned

    @High-Impact
    Scenario: Tool Search
  When I search tool name "toolname" in the search field
    Then the correct tool will appear in the list


