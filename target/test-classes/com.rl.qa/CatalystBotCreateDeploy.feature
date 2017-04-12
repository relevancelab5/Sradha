Feature: As a user Create,launch and Deploy catalyst bot
  Scenario Outline: : First create ,launch and deploy catalyst bot
    Given I Login to catalyst using "<url>"
    And I enter  "<username>" on User name text box
    And I enter "<password>"  on Password testbox
    And I click on Login button
    And I click on BOTS
    And I enter "<Botname>" in searchbox
    And I click on Execute