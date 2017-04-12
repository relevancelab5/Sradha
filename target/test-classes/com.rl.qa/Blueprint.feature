@Blueprint
Feature:As a user design a SoftwareTrack Blueprint
  Scenario Outline: : I will design a SoftwareTrack Blueprint
    Given I Login to catalyst using "<url>"
    And I enter  "<username>" on User name text box
    And I enter "<password>"  on Password testbox
    And I click on Login button
#    And I click on setting
    And I click on the "DESIGN" link
    And I click "New" link
    And I click on "JAVA" template
    And I click on "Provider parameters" link
    And I select "<OS>" in select os select box
    And I select "<Provider>" in provider select box
    And I select "<Image>" in available image select box
    And I select "<Region>" in select region select box
    And I select "<vpc>" in vpc select box
    And I select "<Subnet>"
    And I select "<KeyPair>" in  key pair select box
    And I select "<Instance>" in instane type  select box
    And I select "<InstanceLunch>" select box
    And I select "<SecurityGroup>" option
    And I check the domain name radio button
    And I click on the "Blueprint name And Organisation" opt
    And I enter "<BluePrintname>" in "Blueprint Name" textbox
    And I select "<Organisation>" in organisation select box
    And I select "<Businessgroup>" in Business grp select box
    And I select "<Project>" in Project select box
    And I click on "Save" button
    And I click on "SUBMIT" popup button
    ##I will verify blueprint is created or not
    And I click on "WORKZONE"
    And I click on "infrastructure" option
    And I click on the "Blueprints"
#    Then I verify software stack blueprint is created <"BluePrintname">

    Examples:
      |password           |username   |url                               |OS       |Provider   |Image          |Region                       |KeyPair     |vpc                                     |Subnet                                     |Instance     |InstanceLunch|Organisation|BluePrintname|Businessgroup|Project|SecurityGroup|
      |superadmin@123     |superadmin |http:neocatalyst.rlcatalyst.com/ |Ubuntu   | AWS_N.Cal |Ubuntu_N.C14.04 |US West (N. California)    |bootstrapncal| vpc-bd815ad8 (10.0.0.0/16) RL_DemoSetup|subnet-d7df258e (us-west-1b)                |t2.micro     |      1       |    RL      | RL_catt      | Product      |Catalyst |sg-eeff688b  |