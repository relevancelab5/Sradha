package com.rl.qa.steps;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.SeleniumUtilities;
import com.rl.qa.views.PetclinicCreateDeployViews;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by sse0051 on 30/3/17.
 */
public class PetclinicCreateDeploySteps {
    public static String IP;
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    @And("^I click on BOTS$")
    public void iClickOnBOTS() throws Throwable {
        PetclinicCreateDeployViews.ClickOnBots();
    }

    @And("^I enter \"([^\"]*)\" in searchbox$")
    public void iEnterInSearchbox(String Botname) throws Throwable {
       PetclinicCreateDeployViews.EnterBotname(Botname);
    }

    @And("^I click on Execute$")
    public void iClickOnExecute() throws Throwable {
       PetclinicCreateDeployViews.ClickOnExecute();
    }

    @And("^I enter \"([^\"]*)\" in edit parameter$")
    public void iEnterInEditParameter(String value) throws Throwable {
        PetclinicCreateDeployViews.EnterValue(value);
    }

    @And("^I Click on the ok button$")
    public void iClickOnTheOkButton() throws Throwable {
      PetclinicCreateDeployViews.ClickOnOk();
    }
    @And("^I click on the close$")
    public void iClickOnTheClose() throws Throwable {
       PetclinicCreateDeployViews.ClickOntheclose();
    }

    @And("^I click on Blueprint option$")
    public void iClickOnBlueprintOption() throws Throwable {
        PetclinicCreateDeployViews.ClickOnBlueprint();
    }

    @And("^I click on lauch button of AppDeployDemo template$")
    public void iClickOnLauchButtonOfAppDeployDemoTemplate() throws Throwable {
        PetclinicCreateDeployViews.ClickOnLaunchAppDeployTemp();
    }

    @And("^I select value in \"([^\"]*)\"$")
    public void iSelectValueIn(String Environment) throws Throwable {
       PetclinicCreateDeployViews.SelectEnvironment(Environment);
    }

    @And("^I select \"([^\"]*)\" value$")
    public void iSelectValue(String Monitoring) throws Throwable {
      PetclinicCreateDeployViews.SelectMonitoring(Monitoring);
    }
    @And("^I click on the ok button at the end$")
    public void iClickOnTheOkButtonAtTheEnd() throws Throwable {
        PetclinicCreateDeployViews.ClickOnOkButton();
    }
    @And("^I click On close$")
    public void iClickOnClose() throws Throwable {
        PetclinicCreateDeployViews.ClickOnClose();
    }
    @And("^I click on edit of instance$")
    public void iClickOnEditOfInstance() throws Throwable {
      PetclinicCreateDeployViews.ClickOnEditInstance();
    }

    @And("^I enter \"([^\"]*)\" value$")
    public void iEnterValue(String Editname) throws Throwable {
        PetclinicCreateDeployViews.EnterEditValue(Editname);
    }

    @And("^I clicked Save$")
    public void iClickedSave() throws Throwable {
        PetclinicCreateDeployViews.ClickOnSave();
    }

    @And("^I click on instance control panel$")
    public void iClickOnInstanceControlPanel() throws Throwable {
       PetclinicCreateDeployViews.ClickOnControlpanel();
    }

    @And("^I click Actionhistory$")
    public void iClickActionhistory() throws Throwable {
        PetclinicCreateDeployViews.ClickonActionhistory();
    }

//    @Then("^verify status true or not$")
//    public void verifyStatusTrueOrNot() throws Throwable {
//       PetclinicCreateDeployViews.VerifyStatus();
//    }

    @And("^I hit on close$")
    public void iHitOnClose() throws Throwable {
        PetclinicCreateDeployViews.HitOnClose();
    }

    @And("^I clicked Orchestration$")
    public void iClickedOrchestration() throws Throwable {
       PetclinicCreateDeployViews.ClickedOnOrchestration();
    }

    @And("^I click on edit button of Deploy petclinic$")
    public void iClickOnEditButtonOfDeployPetclinic() throws Throwable {
       PetclinicCreateDeployViews.ClickOnEditOfDeployPetclinic();
    }

    @And("^I click on DeployPetclinic,click on button$")
    public void iClickOnDeployPetclinicClickOnButton() throws Throwable {
       PetclinicCreateDeployViews.ClickOnDeployPetclinic();
    }

    @And("^I click on update$")
    public void iClickOnUpdate() throws Throwable {
        PetclinicCreateDeployViews.ClickOnUpdate();
    }

    @And("^I enter \"([^\"]*)\" Deploy Petclinic$")
    public void iEnterDeployPetclinic(String Bot) throws Throwable {
       PetclinicCreateDeployViews.EnterDeployPetclinic(Bot);
    }

    @And("^I hit on execute opt$")
    public void iHitOnExecuteOpt() throws Throwable {
       PetclinicCreateDeployViews.HitOnExecute();
    }

    @And("^I select n put \"([^\"]*)\"$")
    public void iSelectNPut(String RepoServer) throws Throwable {
       PetclinicCreateDeployViews.SelectReposerver(RepoServer);
    }
    @And("^I select on \"([^\"]*)\" value$")
    public void iSelectOnValue(String Repository) throws Throwable {
       PetclinicCreateDeployViews.SelectRepoValue(Repository);
    }

    @And("^I enter \"([^\"]*)\" val$")
    public void iEnterVal(String URI) throws Throwable {
       PetclinicCreateDeployViews.SelectURI(URI);
    }


    @And("^I select on the \"([^\"]*)\" value$")
    public void iSelectOnTheValue(String GrpId) throws Throwable {
        PetclinicCreateDeployViews.SelectGrpId(GrpId);
    }

    @And("^I select \"([^\"]*)\" val$")
    public void iSelectVal(String Artifact) throws Throwable {
       PetclinicCreateDeployViews.SelectArtifact(Artifact);
    }


    @And("^I hit on the Ok$")
    public void iHitOnTheOk() throws Throwable {
        PetclinicCreateDeployViews.HitOnTheOk();

    }

    @And("^I click On close optn$")
    public void iClickOnCloseOptn() throws Throwable {
     PetclinicCreateDeployViews.ClickOnCloseOptn();
    }

    @And("^I enter the urlport$")
    public void iEnterTheUrlport() throws Throwable {

        System.out.println("IP value is :=====>"+IP);
        String appURL = IP + ":8080/petclinic";
        BrowserDriver.loadPage(appURL);

    }

    @And("^I get the host ip$")
    public void iGetTheHostIp() throws Throwable {
     IP= PetclinicCreateDeployViews.GetHostIp();
    }

    @And("^I select \"([^\"]*)\" opt$")
    public void iSelectOpt(String Version) throws Throwable {
        PetclinicCreateDeployViews.SelectVersion(Version);
    }
}
