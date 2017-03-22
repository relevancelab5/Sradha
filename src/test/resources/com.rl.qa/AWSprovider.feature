@Bottle
Feature: As a super user I configure AWS provider Using Access keys
  Scenario Outline: As a super user I create a AWS Provider
    Given I Login to catalyst using "<url>"
    And I enter  "<username>" on User name text box
    And I enter "<password>"  on Password testbox
    And I click on Login button
    And I click on setting
    And I move the cursor on "Menu"
    And I click on "Provider Configuration" opt
    And I click on "Providers" optn
    And I click on the "New" optn
    And I select "<ProviderType>" in Provider type
    And I click on CredentialsKeys in User Access Key
    And I enter "<AccessKey>" in "accessKey" Edit box
    And I enter "<S3Bucketname>" in s3BucketName Edit box
    And I select "<Organization>" from the select box
    And I enter "<ProviderName>"
    And I enter "<Secret Key>" in secretKey Edit box
    And I select on the"<PlannedCost>"
    And I select on  "<Region>"
    And I select on  "<Keypair>" optn

    And I upload .pem file
    And I click on Save
    #Then I verify "<AWS service name>" in the provider table
    #Then I verify "<AWS service name>" with "<Provider Type>" in the provider table
    #Then I verify "<AWS service name>" with "<Organization>" in the provider table
    #Then I select the "<AWS service name>" and verify "Edit" Button is enabled
    #Then I select the "<AWS service name>" and verify "Sync Instances" Button is enabled
    #Then I select the "<AWS service name>" and verify "Delete" Button is enabled

    Examples:
     | PlannedCost|password           |username   |url                               |ProviderName | AccessKey           | Secret Key                                | S3Bucketname   | Organization | Region                           | Keypair          | ProviderType  |
     |400000     |superadmin@123     |superadmin |http:neocatalyst.rlcatalyst.com/  |Mouse        | AKIAIIK5APRNV54QAVQA| bz6Hl4wtjXi5Mg2EaZxLR1I/7y0bmYXEiYINDBSp  | RLBilling      | UAT_RL       | US West (N. California)          | bootstrapncal    | AWS           |

