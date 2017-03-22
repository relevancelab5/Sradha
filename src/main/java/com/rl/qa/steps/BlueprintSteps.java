package com.rl.qa.steps;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.SeleniumUtilities;
import com.rl.qa.views.BlueprintViews;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by sse0051 on 24/2/17.
 */
public class BlueprintSteps {
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);


    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
        BlueprintViews.ClickOnButton();
    }


    @And("^I click on \"([^\"]*)\" template$")
    public void iClickOnTemplate(String arg0) throws Throwable {
        BlueprintViews.ClickOnTemplate();
    }

    @And("^I select \"([^\"]*)\" in select os select box$")
    public void iSelectInSelectOsSelectBox(String OS) throws Throwable {
        BlueprintViews.SelectOs(OS);
    }

    @And("^I select \"([^\"]*)\" in select region select box$")
    public void iSelectInSelectRegionSelectBox(String Region) throws Throwable {
        BlueprintViews.SelectRegion(Region);
    }

    @And("^I select \"([^\"]*)\" in  key pair select box$")
    public void iSelectInKeyPairSelectBox(String KeyPair) throws Throwable {
        BlueprintViews.SelectKeyPair(KeyPair);
    }


    @And("^I select \"([^\"]*)\" in provider select box$")
    public void iSelectInProviderSelectBox(String Provider) throws Throwable {
        BlueprintViews.SelectProvider(Provider);
    }

    @And("^I select \"([^\"]*)\" in vpc select box$")
    public void iSelectInVpcSelectBox(String vpc) throws Throwable {
        BlueprintViews.SelectVpc(vpc);
    }

    @And("^I select \"([^\"]*)\" in instane type  select box$")
    public void iSelectInInstaneTypeSelectBox(String Instance) throws Throwable {
        BlueprintViews.SelectInstance(Instance);
    }

    @And("^I check the domain name radio button$")
    public void iCheckTheDomainNameRadioButton() throws Throwable {
        BlueprintViews.CheckRadiobutton();

    }

    @And("^I select \"([^\"]*)\" in available image select box$")
    public void iSelectInAvailableImageSelectBox(String Image) throws Throwable {
        BlueprintViews.SelectImage(Image);
    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String Subnet) throws Throwable {
        BlueprintViews.SelectSubnet(Subnet);
    }

    @And("^I select \"([^\"]*)\" select box$")
    public void iSelectSelectBox(String InstanceLunch) throws Throwable {
        BlueprintViews.Selectinstance(InstanceLunch);
    }

    @And("^I enter \"([^\"]*)\" in \"([^\"]*)\" textbox$")
    public void iEnterInTextbox(String BluePrintname, String arg1) throws Throwable {
        BlueprintViews.SelectBlueprintName(BluePrintname);
    }

    @And("^I select \"([^\"]*)\" in Project select box$")
    public void iSelectInProjectSelectBox(String Project) throws Throwable {
        BlueprintViews.SelectProject(Project);
    }

    @And("^I select \"([^\"]*)\" in organisation select box$")
    public void iSelectInOrganisationSelectBox(String Organisation) throws Throwable {
        BlueprintViews.SelectOrganisation(Organisation);
    }

    @And("^I click on the \"([^\"]*)\" link$")
    public void iClickOnTheLink(String arg0) throws Throwable {
        BlueprintViews.ClickOnDesign();
    }

    @And("^I click \"([^\"]*)\" link$")
    public void iClickLink(String arg0) throws Throwable {
        BlueprintViews.ClickOnNew();
    }


    @And("^I select \"([^\"]*)\" in Business grp select box$")
    public void iSelectInBusinessGrpSelectBox(String Businessgroup) throws Throwable {
        BlueprintViews.SelectBusinessGroup(Businessgroup);
    }

    @And("^I select Security Group$")
    public void iSelectSecurityGroup() throws Throwable {
        BlueprintViews.SelectsecurityGroup();
    }

    @And("^I click on \"([^\"]*)\" link$")
    public void iClickOnLink(String arg0) throws Throwable {
        BlueprintViews.ClickOnLinks();
    }

    @Given("^I Login to catalyst using \"(.*?)\"$")
    public void i_Login_to_catalyst_using(String url) throws Throwable {

        String appURL = url.toString();

        assertNotNull(appURL);

        // Load browser and point it at configured IWMS web-ui.
        BrowserDriver.loadPage(appURL);
        //  OrgWorkViews.EnterUrl(url);
    }

    /*@Given("^I Login to catalyst using \"([^\"]*)\"$")
    public void iLoginToCatalystUsing(String url) throws Throwable {


        String appURL = url.toString();

        assertNotNull(appURL);

        // Load browser and point it at configured IWMS web-ui.
        BrowserDriver.loadPage(appURL);
        //  OrgWorkViews.EnterUrl(url);

    }*/

    @And("^I enter  \"([^\"]*)\" on User name text box$")
    public void iEnterOnUserNameTextBox(String username) throws Throwable {
        BlueprintViews.EnterUsername(username);
    }

    @And("^I enter \"([^\"]*)\"  on Password testbox$")
    public void iEnterOnPasswordTestbox(String password) throws Throwable {
        BlueprintViews.EnterPassword(password);
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) throws Throwable {
        BlueprintViews.ClickOnSave();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        BlueprintViews.ClickOnWorkzone();
    }


    @And("^I click on \"([^\"]*)\" option$")
    public void iClickOnOption(String arg0) throws Throwable {
        BlueprintViews.ClickOninfrastructure();
    }

    @And("^I click on the \"([^\"]*)\"$")
    public void iClickOnThe(String arg0) throws Throwable {
        BlueprintViews.ClickonBlueprints();
    }


    @And("^I click on \"([^\"]*)\" popup button$")
    public void iClickOnPopupButton(String arg0) throws Throwable {
        BlueprintViews.ClickOnpopup();
    }

    @And("^I select \"([^\"]*)\" option$")
    public void iSelectOption(String SecurityGroup) throws Throwable {
        BlueprintViews.SelectSecuritygroups(SecurityGroup);
    }

    @And("^I click on the \"([^\"]*)\" opt$")
    public void iClickOnTheOpt(String arg0) throws Throwable {
        BlueprintViews.ClickOnBlueprintOrg();
    }


    @Then("^I verify software stack blueprint is created <\"([^\"]*)\">$")
    public void iVerifySoftwareStackBlueprintIsCreated(String BluePrintname) throws Throwable {
        BlueprintViews.VerifyBlurprintCreate(BluePrintname);
    }
}