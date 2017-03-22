package com.rl.qa.steps;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.SeleniumUtilities;
import com.rl.qa.views.AppDeployViews;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.omg.CORBA.Environment;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

/**
 * Created by sse0051 on 6/3/17.
 */
public class AppDeloySteps {
    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);

    @Given("^I click on lunchBlueprint$")
    public void i_click_on_lunchBlueprint() throws Throwable {
        AppDeployViews.ClickOnLunchBlueprints();
    }

    @Given("^I enter the \"(.*?)\"$")
    public void i_enter_the(String Environment) throws Throwable {
       AppDeployViews.EnterEnvironment(Environment);
    }

    @Given("^I enter \"(.*?)\" optn$")
    public void i_enter_optn(String Monitoring) throws Throwable {
      AppDeployViews.ClickOnMonitoring(Monitoring);
    }

    @Given("^I click on ok$")
    public void i_click_on_ok() throws Throwable {
      AppDeployViews.ClickOnOk();
    }

    @Given("^I click on close$")
    public void i_click_on_close() throws Throwable {
     AppDeployViews.ClickOnClose();
    }



    @Given("^I click on RL_Customer$")
    public void i_click_on_RL_Customer() throws Throwable {
      AppDeployViews.ClickOnRl_Customer();
    }

    @Given("^I click on Infrastructure$")
    public void i_click_on_Infrastructure() throws Throwable {
      AppDeployViews.ClickOnInfrastructure();
    }

    @Given("^I click on instances$")
    public void i_click_on_instances() throws Throwable {
      AppDeployViews.ClickOnInstances();
    }

    @Given("^I click on Applications$")
    public void i_click_on_Applications() throws Throwable {
      AppDeployViews.ClickOnApplication();
    }

    @Given("^I click on New$")
    public void i_click_on_New() throws Throwable {
     AppDeployViews.ClickOnNew();
    }

    @Given("^I select the \"(.*?)\"$")
    public void i_select_the(String RepoServer) throws Throwable {
      AppDeployViews.SelectRepoServer(RepoServer);
    }

    @Given("^I select on \"(.*?)\"$")
    public void i_select_on(String Repo) throws Throwable {
      AppDeployViews.SelectOnRepo(Repo);
    }

    @Given("^I click on CreateNewjoB$")
    public void i_click_on_CreateNewjoB() throws Throwable {
     AppDeployViews.ClickCreateNewjob();
    }

    @Given("^I click on the RL-catt link$")
    public void i_click_on_the_RL_catt_link() throws Throwable {
      AppDeployViews.ClickRL_cattLink();
    }

    @Given("^I click on the assign button$")
    public void i_click_on_the_assign_button() throws Throwable {
     AppDeployViews.ClickonAssignButton();
    }

    @Given("^I click on addRunList$")
    public void i_click_on_addRunList() throws Throwable {
       AppDeployViews.ClickOnAddrunlist();
    }

    @Given("^I click on the  button$")
    public void i_click_on_the_button() throws Throwable {
      AppDeployViews.ClickOnbutton();
    }

    @Given("^I click on UpdateRunList$")
    public void i_click_on_UpdateRunList() throws Throwable {
    AppDeployViews.ClickonUpdateRunlist();
    }

    @And("^I select \"([^\"]*)\" optn$")
    public void iSelectOptn(String Cookbook) throws Throwable {
        AppDeployViews.SelectCookbook(Cookbook);
    }

    @And("^I enter  \"([^\"]*)\"$")
    public void iEnter(String Jobname) throws Throwable {
      AppDeployViews.EnterJobname(Jobname);
    }

    @And("^I select the \"([^\"]*)\" optn$")
    public void iSelectTheOptn(String Jobtype) throws Throwable {
        AppDeployViews.SelectJobtype(Jobtype);
    }

    @And("^I select \"([^\"]*)\" from list$")
    public void iSelectFromList(String Versions) throws Throwable {
        AppDeployViews.SelectVersions(Versions);
    }

    @And("^I select the \"([^\"]*)\" list$")
    public void iSelectTheList(String Artifacts) throws Throwable {
       AppDeployViews.SelectArtifacts(Artifacts);
    }

    @And("^I select the \"([^\"]*)\" selectbox$")
    public void iSelectTheSelectbox(String GrpId) throws Throwable {
        AppDeployViews.SelectGroupId(GrpId);
    }

    @And("^I move the cursor on \"([^\"]*)\" optn$")
    public void iMoveTheCursorOnOptn(String arg0) throws Throwable {
   AppDeployViews.ClickOnmenu();
    }

    @And("^I click on the \"([^\"]*)\" option$")
    public void iClickOnTheOption(String arg0) throws Throwable {
       AppDeployViews.ClickOnInfrastruct();
    }

    @And("^I click on  \"([^\"]*)\" option$")
    public void iClickOnOption(String arg0) throws Throwable {
        AppDeployViews.ClickOnBlueprint();
    }

    @And("^I click the \"([^\"]*)\" option$")
    public void iClickTheOption(String arg0) throws Throwable {
        AppDeployViews.ClickOnRL_EVL();
    }

    @And("^I click on RL$")
    public void iClickOnRL() throws Throwable {
       AppDeployViews.ClickOnRL();
    }

    @And("^I click on product$")
    public void iClickOnProduct() throws Throwable {
       AppDeployViews.ClickOnProduct();
    }

    @And("^I click on catalyst$")
    public void iClickOnCatalyst() throws Throwable {
        AppDeployViews.ClickOncatalyst();
    }

    @And("^I select \"([^\"]*)\" for choosejob$")
    public void iSelectForChoosejob(String Jobname) throws Throwable {
       AppDeployViews.SelectOnChooseJob(Jobname);
    }

    @And("^I click on Deploy$")
    public void iClickOnDeploy() throws Throwable {
       AppDeployViews.ClickOnDeploy();
    }

    @And("^I click on filter$")
    public void iClickOnFilter() throws Throwable {
       AppDeployViews.ClickOnFilter();
    }

}
