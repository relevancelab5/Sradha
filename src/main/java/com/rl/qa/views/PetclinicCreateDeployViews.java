package com.rl.qa.views;
import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.steps.LoginSteps;
import com.rl.qa.utils.BaseView;
import com.rl.qa.utils.SeleniumUtilities;
import junit.framework.TestCase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by sse0051 on 30/3/17.
 */
public class PetclinicCreateDeployViews {

    public static String IP;
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    public static WebElement PagesFrame;

    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());

    public static void ClickOnBots() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='service']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@id='service']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnBots");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void EnterBotname(String Botname) {

        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='botLibraryPage']/div[5]/div[2]/form/span/label/input");
            SeleniumUtil.type("xpath", ".//*[@id='botLibraryPage']/div[5]/div[2]/form/span/label/input", Botname, SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
            SeleniumUtil.click("xpath", ".//*[@class='fa fa-search search-icon']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterBotname");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }


    public static void ClickOnExecute() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[contains(@style,'margin-top:5px;')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[contains(@style,'margin-top:5px;')]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnExecute");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void EnterValue(String value) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[3]/table/tbody/tr/td[3]/input");
            SeleniumUtil.clear("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[3]/table/tbody/tr/td[3]/input", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.type("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[3]/table/tbody/tr/td[3]/input", value, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterValue");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnOk() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-update']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-update']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(14000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterValue");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOntheclose() {
        try {
            Thread.sleep(4000);
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-cancel']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-cancel']", SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnTheClose");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnBlueprint() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='myTab3']/li[1]/ul/li[2]/a", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@id='myTab3']/li[1]/ul/li[2]/a", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnBlueprint");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnLaunchAppDeployTemp() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[text()='AppDelpoy-Demo']/following::div[2]/div[1]/span", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[text()='AppDelpoy-Demo']/following::div[2]/div[1]/span", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnLaunchAppDeployTemp");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectEnvironment(String Environment) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='envSelect']");
            SeleniumUtil.selectByVisibleText("xpath", ".//*[@id='envSelect']", Environment, SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectEnvironment");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


    public static void SelectMonitoring(String Monitoring) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@name='monitorId']");
            SeleniumUtil.selectByVisibleText("xpath", ".//*[@name='monitorId']", Monitoring, SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectMonitoring");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnOkButton() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[1]/button[2]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@id='blueprintLaunchParamsPage']/form/div[2]/div[1]/button[2]", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(290000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnOk");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnClose() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-close']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-close']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnClose");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnEditInstance() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='fa fa-pencil edit-instance-name cursor']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='fa fa-pencil edit-instance-name cursor']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnEditInstances");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void EnterEditValue(String Editname) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@name='editInstanceName']");
            SeleniumUtil.clear("xpath", ".//*[@name='editInstanceName']", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.type("xpath", ".//*[@name='editInstanceName']", Editname, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterEditValue");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnSave() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-save']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-save']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnSave");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnControlpanel() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[text()='Deploy_petclinic']/following::div[7]/div[9]/div/button", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[text()='Deploy_petclinic']/following::div[7]/div[9]/div/button", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='cardView']/div[1]/div/div[5]/div[9]/div/ul/li[1]",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@id='cardView']/div[1]/div/div[5]/div[9]/div/ul/li[1]", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnControlpanel");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickonActionhistory() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[contains(@title,'Action History')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[contains(@title,'Action History')]", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnActionhistory");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void HitOnClose() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-close']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-close']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("HitOnClose");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickedOnOrchestration() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@id='myTab3']/li[2]/a", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@id='myTab3']/li[2]/a", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnOrchestration");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnEditOfDeployPetclinic() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", "//*[contains(text(),'Deploy Petclinic')]/following::div[8]/span[1]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", "//*[contains(text(),'Deploy Petclinic')]/following::div[8]/span[1]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnEditOfDeployPetClinic");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnDeployPetclinic() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[contains(@value,'Deploy_petclinic')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[contains(@value,'Deploy_petclinic')]", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
            SeleniumUtil.click("xpath", "(.//*[@id='btnaddToRunlist'][@class='btn cat-btn-update anchorAdd'])[1]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnDeployPetClinic");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnUpdate() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-update ng-scope']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-update ng-scope']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(3000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnUpdate");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void EnterDeployPetclinic(String Bot) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='botLibraryPage']/div[5]/div[2]/form/span/label/input");
            SeleniumUtil.type("xpath", ".//*[@id='botLibraryPage']/div[5]/div[2]/form/span/label/input", Bot, SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
            SeleniumUtil.click("xpath", ".//*[@class='fa fa-search search-icon']", SeleniumUtil.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("EnterDeployPetclinic");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void HitOnExecute() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[contains(@style,'margin-top:5px;')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[contains(@style,'margin-top:5px;')]", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("HitOnExecute");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectReposerver(String RepoServer) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[1]/select");
            SeleniumUtil.selectByVisibleText("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[1]/select", RepoServer, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectRepoServer");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectRepoValue(String Repository) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[1]/div/select");
            SeleniumUtil.selectByVisibleText("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[1]/div/select", Repository, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectRepoValue");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectVersion(String Version) {
        try {

            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[4]/div/select");
          //  SeleniumUtil.click("xpath",".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[4]/div/select",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.selectByVisibleText( "xpath",".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[4]/div/select",Version,SeleniumUtilities.OBJWAITTIMEOUT);

        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectVersion");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectURI(String URI) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@class='width-100 form-control ng-pristine ng-valid ng-touched']");
            SeleniumUtil.selectByVisibleText("xpath", ".//*[@class='width-100 form-control ng-pristine ng-valid ng-touched']", URI, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectURI");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectGrpId(String GrpId) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[2]/div/select");
            SeleniumUtil.selectByVisibleText("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[2]/div/select", GrpId, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("Select GrpId");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectArtifact(String Artifact) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[3]/div/select");
            SeleniumUtil.selectByVisibleText("xpath", ".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[3]/div/select", Artifact, SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(3000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectArtifact");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void HitOnTheOk() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-update']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-update']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(60000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("HitOnTheOk");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnCloseOptn() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", ".//*[@class='btn cat-btn-cancel']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", ".//*[@class='btn cat-btn-cancel']", SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(3000);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnClose");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static String GetHostIp() {
        try{
            IP = SeleniumUtil.getAttributeValue("xpath",".//*[@id='editParamsPage']/form/div[2]/fieldset/div[2]/div/div[2]/div[6]/input","value",SeleniumUtilities.OBJWAITTIMEOUT);
         System.out.println(IP);

        }
        catch (Exception ex){
            BaseView.takeScreenshot("GetHostIp");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
        return IP;
    }
}