@Deploy
  Feature: App Deploy
    Scenario Outline: As a user I deploy the app
      Given I Login to catalyst using "<url>"
      And I enter  "<username>" on User name text box
      And I enter "<password>"  on Password testbox
      And I click on Login button
      And I click on "WORKZONE"
      And I move the cursor on "Menu" optn
      And I click on RL
      And I click on product
      And I click on catalyst
      And I click the "RL_EVL" option
      And I click on filter
      And I click on the "infrastructure" option
      And I click on  "Blueprints" option
      And I click on lunchBlueprint
      And I enter the "<Environment>"
      And I enter "<Monitoring>" optn
      And I click on ok
      And I click on close
      And I move the cursor on "Menu" optn
      And I click on RL_Customer
      And I click on Applications
      And I click on Infrastructure
      And I click on instances
      And I click on Applications
      And I click on New
      And I select the "<RepoServer>"
      And I select on "<Repo>"
      And I select the "<GrpId>" selectbox
      And I select the "<Artifacts>" list
      And I select "<Versions>" from list
      And I click on CreateNewjoB
      And I select the "<Jobtype>" optn
      And I enter  "<Jobname>"
      And I click on the RL-catt link
      And I click on the assign button
      And I click on addRunList
      And I select "<cookbook>" optn
      And I click on the  button
      And I click on UpdateRunList
      And I enter  "<Jobname>"
      And I click on Save
      And I select "<Jobname>" for choosejob
      And I click on Deploy



      Examples:
        |password           |username   |url                              |Environment|Monitoring|RepoServer |Repo    |GrpId       |Artifacts|Versions |Jobtype  |Jobname   |cookbook               |
        |superadmin@123     |superadmin |http:neocatalyst.rlcatalyst.com/ |RL_Customer|None      |NexusServer|catalyst|org.catalyst|D4D      | 3.04.157|Chef     |AppDeploy |deploy_upgrade_catalyst|

