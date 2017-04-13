package com.rl.qa.views;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.steps.LoginSteps;
import com.rl.qa.utils.BaseView;
import com.rl.qa.utils.SeleniumUtilities;
import junit.framework.TestCase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import javax.print.attribute.standard.JobName;
import java.util.logging.Logger;

import static com.rl.qa.utils.SeleniumUtilities.*;
import static org.junit.Assert.fail;

/**
 * Created by sse0051 on 6/3/17.
 */
public class AppDeployViews {
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    public static WebElement PagesFrame;

    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    public static void ClickOnLunchBlueprints() {
        try {

            SeleniumUtil.waitForElementIsClickable("xpath", "//b[text()='RL_catt']/../../../following::div[2]/div[1]", 8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", "//b[text()='RL_catt']/../../../following::div[2]/div[1]",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterEnvironment");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterEnvironment(String Environment) {
        try {
            SeleniumUtil.selectByVisibleText("id", "envSelect",Environment,SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(1000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterEnvironment");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


    public static void ClickOnMonitoring(String Monitoring) {
        try {
            SeleniumUtil.waitForElementPresent("name","monitorId");
            SeleniumUtil.selectByVisibleText("name", "monitorId",Monitoring,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnMonitoring");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnOk() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpat","(.//*[@class='btn cat-btn-update'])[1]",8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","(.//*[@class='btn cat-btn-update'])[1]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnTemplate");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnClose() {
        try{
            Thread.sleep(290000);
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='btn cat-btn-close']",8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='btn cat-btn-close']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnClose");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnRl_Customer() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpat",".//*[@id='aa20c605-b493-4993-8167-756efa7ccfa7']",10, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='aa20c605-b493-4993-8167-756efa7ccfa7']",SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(10000);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnRL_Customer");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
        }
    }

    public static void ClickOnInfrastructure() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='dropdown-toggle']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='dropdown-toggle']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnInfrastructure");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }


    public static void ClickOnInstances() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='fa fa-reorder']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='fa fa-reorder']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnInstances");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }


    public static void ClickOnApplication() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='myTab3']/li[3]/a",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='myTab3']/li[3]/a",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnApplication");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnNew() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath","//*[contains(@title,'Deploy new app')]",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//*[contains(@title,'Deploy new app')]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnNew");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }


    public static void SelectRepoServer(String RepoServer) {
        try{
            Thread.sleep(2000);
        SeleniumUtil.waitForElementPresent("xpath",".//*[@id='deployNewAppPage']/form/div[2]/div/fieldset[1]/div[1]/div/select");
        System.out.println("=====================");

        SeleniumUtil.selectByVisibleText("xpath", ".//*[@id='deployNewAppPage']/form/div[2]/div/fieldset[1]/div[1]/div/select",RepoServer,SeleniumUtilities.OBJWAITTIMEOUT);
         Thread.sleep(3000);
    } catch (Exception ex) {
        BaseView.takeScreenshot("SelectRepoServer");
        SeleniumUtil.Log.info("Error :" +ex.getMessage());
        fail(ex.getMessage());
    } catch (Throwable throwable) {
        throwable.printStackTrace();
    }
    }

    public static void SelectOnRepo(String Repo) {
        try{
            Thread.sleep(2000);
            SeleniumUtil.waitForElementPresent("name","repositoryInd");
            System.out.println("=====================");
            SeleniumUtil.selectByVisibleText("name", "repositoryInd",Repo,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectRepo");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickCreateNewjob() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath","(.//*[@class='btn cat-btn-update'])[1]",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","(.//*[@class='btn cat-btn-update'])[1]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickCreateNewjob");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickRL_cattLink() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='optionSelector']/option[1][text()='RL_catt']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='optionSelector']/option[1][text()='RL_catt']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickRL_cattLink");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickonAssignButton() {
        try{
            SeleniumUtil.click("xpath","(.//*[@id='btnaddToRunlist'])[1]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickonAssignButton");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnAddrunlist() {
        try{
            SeleniumUtil.click("xpath",".//*[contains(@title,'Edit Runlist')]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnAddrunlist");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnbutton() {
        try{
            SeleniumUtil.click("xpath","(.//*[@id='btnaddToRunlist'])[3]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickonButton");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickonUpdateRunlist() {
        try{
            SeleniumUtil.click("xpath","(.//*[@class='btn cat-btn-update'])[3]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickonUpdateRunlist");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void SelectCookbook(String Cookbook) {
        try{
            SeleniumUtil.waitForElementPresent("xpath","(.//*[contains(@id,'searchBox')])[3]");
            Thread.sleep(2000);
            SeleniumUtil.type("xpath", "(.//*[contains(@id,'searchBox')])[3]",Cookbook,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[text()='deploy_upgrade_catalyst']",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectCookbook");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterJobname(String Jobname) {
        try{
            SeleniumUtil.waitForElementPresent("name","taskName");
            SeleniumUtil.type("name", "taskName",Jobname,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterJobname");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectJobtype(String Jobtype) {
        try{
            SeleniumUtil.waitForElementPresent("name","taskType");
            SeleniumUtil.selectByVisibleText("name", "taskType",Jobtype,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterJobtype");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectVersions(String Versions) {
        try{
            SeleniumUtil.waitForElementPresent("name","version");
            SeleniumUtil.selectByVisibleText("name", "version",Versions,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectVersions");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectArtifacts(String Artifacts) {
        try{
            SeleniumUtil.waitForElementPresent("name","artifactInd");
            SeleniumUtil.selectByVisibleText("name", "artifactInd",Artifacts,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectArtifacts");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectGroupId(String GrpId) {
        try{
            SeleniumUtil.waitForElementPresent("name","groupId");
            SeleniumUtil.selectByVisibleText("name", "groupId",GrpId,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectGrpId");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnmenu() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='cursor']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='cursor']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnMenu");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }


    public static void ClickOnInfrastruct() {
        try{
            Thread.sleep(3000);
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='dropdown-toggle']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='dropdown-toggle']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnInfrastruct");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnBlueprint() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath","//i[@class='fa fa-crosshairs']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//i[@class='fa fa-crosshairs']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnBlueprint");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnRL_EVL() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[text()='RL_EVL']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[text()='RL_EVL']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnRL_EVL");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnRL() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='ca8a9158-0426-4a14-9401-a5539a9dda87']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='ca8a9158-0426-4a14-9401-a5539a9dda87']",SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(1000);
            SeleniumUtil.click("xpath",".//*[@id='ca8a9158-0426-4a14-9401-a5539a9dda87']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnRL");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnProduct() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='f8075f04-d224-4940-afea-967b1b8dc951']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='f8075f04-d224-4940-afea-967b1b8dc951']",SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(1000);
            SeleniumUtil.click("xpath",".//*[@id='f8075f04-d224-4940-afea-967b1b8dc951']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnProduct");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOncatalyst() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='895990bc-2dc8-43bf-ab65-d75d8e5f5f07']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='895990bc-2dc8-43bf-ab65-d75d8e5f5f07']",SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(1000);
            SeleniumUtil.click("xpath",".//*[@id='895990bc-2dc8-43bf-ab65-d75d8e5f5f07']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnCatalyst");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void SelectOnChooseJob(String Jobname) {
        try{
            SeleniumUtil.waitForElementPresent("id","chooseJobType");
            SeleniumUtil.selectByVisibleText("id", "chooseJobType", Jobname,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectOnChooseJob");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnDeploy() {
       try {

            SeleniumUtil.waitForElementIsClickable("xpath","(.//*[@class='btn cat-btn-update'])[2]",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","(.//*[@class='btn cat-btn-update'])[2]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnDeploy");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnFilter() {

            try {

                SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='instancePage']//*[contains(@title,'Filter')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
                SeleniumUtil.click("xpath", ".//*[@id='instancePage']//*[contains(@title,'Filter')]", SeleniumUtilities.OBJWAITTIMEOUT);
                Thread.sleep(1000);
                SeleniumUtil.click("xpath", ".//*[@id='instancePage']//*[contains(@title,'Filter')]", SeleniumUtilities.OBJWAITTIMEOUT);
            } catch (Exception ex) {
                BaseView.takeScreenshot("ClickOnFilter");
                SeleniumUtil.Log.info("Error :" + ex.getMessage());
                TestCase.fail(ex.getMessage());
            }

        }
    }


