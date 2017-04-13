@mouse
Feature: As a user Create,launch and Deploy Petclinic
    Scenario Outline: : First create ,launch and deploy petclinic
        Given I Login to catalyst using "<url>"
        And I enter  "<username>" on User name text box
        And I enter "<password>"  on Password testbox
        And I click on Login button
#        And I click on BOTS
#        And I enter "<Botname>" in searchbox
#        And I click on Execute
#    # And I enter "<value>" in edit parameter
#        And I Click on the ok button
#        And I click on the close
        And I click on "WORKZONE"
        And I move the cursor on "Menu" optn
        And I click on RL_Customer
        And I click on Applications
#        And I click on Infrastructure
#        And I click on Blueprint option
#        And I click on lauch button of AppDeployDemo template
#        And I select value in "<Environment>"
#        And I select "<Monitoring>" value
#        And I click on the ok button at the end
#        And I click On close
        And I click on Infrastructure
        And I click on instances
        And I click on edit of instance
        And I enter "<Editname>" value
        And I clicked Save
        And I click on instance control panel
        And I click Actionhistory
    # Then verify status true or not
        And I hit on close
        And I move the cursor on "Menu" optn
        And I click on RL_Customer
        And I click on Applications
        And I clicked Orchestration
        And I click on edit button of Deploy petclinic
        And I click on DeployPetclinic,click on button
        And I click on update
        And I click on BOTS
        And I enter "<Bot>" Deploy Petclinic
        And I hit on execute opt
        And I select n put "<RepoServer>"
        And I select on "<Repository>" value
        And I select on the "<GrpId>" value
        And I select "<Artifact>" val
        And I select "<Version>" opt
    # And I enter "<URI>" val
        And I get the host ip
        And I hit on the Ok
        And I click On close optn
        And I enter the urlport

Examples:
  |password           |username   |url                               |Botname              |value   |Environment|Monitoring|Editname      |RepoServer |Repository|GrpId       |Artifact|Version|Bot             |
  |superadmin@123     |superadmin |http://neocatalyst.rlcatalyst.com/  |Build_Petclinic_Nexus |03.01.21|RL_Customer|Sensu Prod|Deploy_petclinic|NexusServer|petclinic |org.catalyst|petclinic|48  |Deploy Petclinic|