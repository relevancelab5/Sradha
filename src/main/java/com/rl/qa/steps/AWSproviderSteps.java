package com.rl.qa.steps;

import com.rl.qa.views.AWSproviderViews;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * Created by sse0051 on 2/3/17.
 */
public class AWSproviderSteps {
    @Given("^I Login to catalyst using Login access credentials$")
    public void i_Login_to_catalyst_using_Login_access_credentials() throws Throwable {

    }

    @Given("^I move the cursor on \"(.*?)\"$")
    public void i_move_the_cursor_on(String arg1) throws Throwable {
        AWSproviderViews.MoveOnMenu();
    }

    @Given("^I click on \"(.*?)\" opt$")
    public void i_click_on_opt(String arg1) throws Throwable {
        AWSproviderViews.ClickOnProviderConfig();
    }

    @Given("^I click on \"(.*?)\" optn$")
    public void i_click_on_optn(String arg1) throws Throwable {
        AWSproviderViews.ClickOnProviders();
    }
    @And("^I click on the \"([^\"]*)\" optn$")
    public void iClickOnTheOptn(String arg0) throws Throwable {
      AWSproviderViews.ClickOnNew();
    }
    @Given("^I select \"(.*?)\" in Provider type$")
    public void i_select_in_Provider_type(String arg1) throws Throwable {
      AWSproviderViews.SelectProviderType();
    }

    @Given("^I click on \"(.*?)\" in User Access Key$")
    public void i_click_on_in_User_Access_Key(String arg1) throws Throwable {
      AWSproviderViews.ClickOnCredentialKey();
    }

    @Given("^I enter \"(.*?)\" in \"(.*?)\" Edit box$")
    public void i_enter_in_Edit_box(String AcessKey, String arg2) throws Throwable {
      AWSproviderViews.ClickOnAcessKey(AcessKey);
    }

    @Given("^I select \"(.*?)\" from the select box$")
    public void i_select_from_the_select_box(String arg1) throws Throwable {
     AWSproviderViews.SelectOrganisation();
    }

    @Given("^I upload \\.pem file$")
    public void i_upload_pem_file() throws Throwable {
        AWSproviderViews.UploadFile();
    }

    @Given("^I click on Save$")
    public void i_click_on_Save() throws Throwable {
        AWSproviderViews.ClickOnSave();
    }


    @Given("^I browse pem file for provider$")
    public void i_browse_pem_file_for_provider() throws Throwable {
        AWSproviderViews.Browsepemfile();
    }



    @And("^I enter \"([^\"]*)\" in secretKey Edit box$")
    public void iEnterInSecretKeyEditBox(String SecretKey) throws Throwable {
       AWSproviderViews.EnterSecretKey(SecretKey);
    }

    @And("^I select on the\"([^\"]*)\"$")
    public void iSelectOnThe(String PlannedCost) throws Throwable {
       AWSproviderViews.SelectOnPlannedCost(PlannedCost);
    }

    @And("^I enter \"([^\"]*)\" in s(\\d+)BucketName Edit box$")
    public void iEnterInSBucketNameEditBox(String S3Bucketname, int arg1) throws Throwable {
        AWSproviderViews.EnterBucketName(S3Bucketname);
    }

    @And("^I select on  \"([^\"]*)\"$")
    public void iSelectOn(String Region) throws Throwable {
      AWSproviderViews.SelectRegion(Region);
    }


    @And("^I select on  \"([^\"]*)\" optn$")
    public void iSelectOnOptn(String arg0) throws Throwable {
      AWSproviderViews.SelectKeyPair();
 }



    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String ProviderName) throws Throwable {
        AWSproviderViews.EnterProvidername(ProviderName);
    }

    @And("^I click on setting$")
    public void iClickOnSetting() throws Throwable {
        AWSproviderViews.ClickOnSetting();
    }

    @And("^I click on CredentialsKeys in User Access Key$")
    public void iClickOnCredentialsKeysInUserAccessKey() throws Throwable {
       AWSproviderViews.ClickOnCredentialKey();
    }
}
