package com.rl.qa.views;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.steps.LoginSteps;
import com.rl.qa.utils.BaseView;
import com.rl.qa.utils.SeleniumUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

/**
 * Created by sse0051 on 24/2/17.
 */
public class BlueprintViews {
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    public static WebElement PagesFrame;

    private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
    public static void ClickOnButton() {
        try {
            Thread.sleep(1000);
            SeleniumUtil.click("id","loginBtn",SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickLoginButton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
    public static void ClickOnTemplate() throws Exception {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath","//b[text()='JAVA']",8, SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(2000);
            SeleniumUtil.click("xpath","//b[text()='JAVA']",SeleniumUtilities.OBJWAITTIMEOUT);
    }
    catch (Exception ex){
            BaseView.takeScreenshot("ClickOnTemplate");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectOs(String OS) throws Throwable {
        try{
            SeleniumUtil.waitForElementPresent("id", "AacessKey");
           SeleniumUtil.selectByVisibleText("name", "osListing",OS,SeleniumUtilities.OBJWAITTIMEOUT);
        }catch (Exception ex)
        {
            BaseView.takeScreenshot("SelectOs");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectRegion(String Region) {
        try {
            SeleniumUtil.waitForElementIsClickable("name", "region", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("name", "region", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.waitForElementIsClickable("xpath", "//*[contains(text(),'" + Region + "')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            WebElement wb = SeleniumUtil.getElement("xpath", "//*[contains(text(),'" + Region + "')]", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.sendEnterKeyToElement(wb);
        } catch (Exception ex) {
            BaseView.takeScreenshot("selectRegion");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectKeyPair(String KeyPair) {
        try {
            SeleniumUtil.waitForElementPresent("id", "AacessKey");
            SeleniumUtil.selectByVisibleText("name","keypairId",KeyPair, SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch (Exception ex)
        {
            BaseView.takeScreenshot("SelectKeypair");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


    public static void SelectProvider(String Provider) {
        try{
            SeleniumUtil.waitForElementPresent("id", "AacessKey");
              SeleniumUtil.selectByVisibleText("name","providerId",Provider,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectProvider");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectVpc(String vpc) {
        try{
            SeleniumUtil.waitForElementPresent("id", "AacessKey");
            SeleniumUtil.selectByVisibleText("name","vpcId",vpc,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectVpc");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectInstance(String Instance) {
        try{
            SeleniumUtil.waitForElementPresent("id", "AacessKey");
            SeleniumUtil.selectByVisibleText("name","instancesize",Instance,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectInstance");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void CheckRadiobutton() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath","(//*[@name='domainCheck'])[2]",8,  SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","(//*[@name='domainCheck'])[2]",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("CheckRadiobutton");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectImage(String Image) {
        try{
            SeleniumUtil.waitForElementPresent("id", "AacessKey");
            SeleniumUtil.selectByVisibleText("name","imageId",Image,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectImage");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectSubnet(String Subnet) {
        try {
            SeleniumUtil.waitForElementIsClickable("name", "subnetId", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("name", "subnetId", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.waitForElementIsClickable("xpath", "//*[contains(text(),'" + Subnet + "')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            WebElement wb = SeleniumUtil.getElement("xpath", "//*[contains(text(),'" + Subnet + "')]", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.sendEnterKeyToElement(wb);
        } catch (Exception ex) {
            BaseView.takeScreenshot("selectSubnet");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void Selectinstance(String InstanceLunch) {
        try{
            SeleniumUtil.selectByVisibleText("name","instanceCount",InstanceLunch,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectInstance");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectBlueprintName(String BluePrintname) {
        try{
            SeleniumUtil.waitForElementPresent("name", "blueprintNameInput");
            SeleniumUtil.type("name","blueprintNameInput",BluePrintname,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectBluePrintName");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectProject(String Project) {
        try{
            SeleniumUtil.waitForElementPresent("name", "projectListInput");
            SeleniumUtil.selectByVisibleText("name","projectListInput",Project,SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectProject");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectOrganisation(String Organisation) {
        try{
            SeleniumUtil.waitForElementPresent("name", "orgnameSelect");
            SeleniumUtil.selectByVisibleText("name","orgnameSelect", Organisation, SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("SelectOrganisation");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnDesign() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@id='design']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath" ,".//*[@id='design']", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("clickDesign");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void ClickOnNew() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath","(.//*[@id='rightPanel']//*[@style='font-weight:600'])[2]",8,SeleniumUtilities.OBJWAITTIMEOUT);
             Thread.sleep(1000);
            SeleniumUtil.click("xpath","(.//*[@id='rightPanel']//*[@style='font-weight:600'])[2]", SeleniumUtilities.OBJWAITTIMEOUT);
              Thread.sleep(1000);
            SeleniumUtil.click("xpath","(.//*[@id='rightPanel']//*[@style='font-weight:600'])[2]", SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickNew");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void SelectBusinessGroup(String Businessgroup) {
        try{
            SeleniumUtil.waitForElementPresent("id", "AacessKey");
            SeleniumUtil.selectByVisibleText("name","bgListInput",Businessgroup,SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectBusinessGrp");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectsecurityGroup() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath", "//*[text()='sg-eeff688b | default']", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath", "//*[text()='sg-eeff688b | default']", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("selectSecurityGrp");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnLinks() {
        try{
            SeleniumUtil.click("xpath","(.//*[@id='content']//*[@class='panel-heading'])[1]", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnLinks");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    } public static void EnterUsername(String username) {
        try {
            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='login-form']/fieldset/section[1]/label[2]/input");
            SeleniumUtil.type("xpath",".//*[@id='login-form']/fieldset/section[1]/label[2]/input", username, SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterUsername");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterPassword(String password) {
        try {

            SeleniumUtil.waitForElementPresent("xpath", ".//*[@id='login-form']/fieldset/section[2]/label[2]/input");
            SeleniumUtil.type("xpath", ".//*[@id='login-form']/fieldset/section[2]/label[2]/input",password,SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch(Exception ex){
            BaseView.takeScreenshot("enterPassword");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void ClickOnSave() {
        try{
            SeleniumUtil.click("xpath","(.//*[text()='Save'])[1]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnSave");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnWorkzone() {
        try{
            Thread.sleep(2000);
            SeleniumUtil.waitForElementIsClickable("id","workzone",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("id","workzone",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnWorkzone");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void ClickOninfrastructure() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath","//*[@class='dropdown-toggle']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//*[@class='dropdown-toggle']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnInfrastructure");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickonBlueprints() {
        try{

            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='fa fa-crosshairs']",8,SeleniumUtilities.OBJWAITTIMEOUT);
             Thread.sleep(1000);
             SeleniumUtil.click("xpath",".//*[@class='fa fa-crosshairs']",SeleniumUtilities.OBJWAITTIMEOUT);

        }
        catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnBlueprints");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }


    public static void ClickOnpopup() {
        try {
            SeleniumUtil.waitForElementVisibilityOf("xpath", "//*[@class='btn ng-class:modalOptions.actionButtonStyle ng-binding cat-btn-update']",8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//*[@class='btn ng-class:modalOptions.actionButtonStyle ng-binding cat-btn-update']",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("clickOnpopup");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectSecuritygroups(String SecurityGroup) {
        try {
            SeleniumUtil.waitForElementIsClickable("name", "subnetId", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("name", "subnetId", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.waitForElementIsClickable("xpath", "//*[contains(text(),'" + SecurityGroup + "')]", 8, SeleniumUtilities.OBJWAITTIMEOUT);
            WebElement wb = SeleniumUtil.getElement("xpath", "//*[contains(text(),'" + SecurityGroup + "')]", SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.sendEnterKeyToElement(wb);
        } catch (Exception ex) {
            BaseView.takeScreenshot("selectSecurityGroup");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void ClickOnBlueprintOrg() {
        try{
            SeleniumUtil.waitForElementIsClickable("xpath", "(.//*[@class='accordion-toggle'])[2]",8,SeleniumUtilities.OBJWAITTIMEOUT);
            Thread.sleep(1000);
            SeleniumUtil.click("xpath","(.//*[@class='accordion-toggle'])[2]", SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnBlueprintOrg");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void VerifyBlurprintCreate(String BluePrintname) {
        try{

            assertTrue(SeleniumUtil.verifyTextValue("xpath", "//*[@class='productdiv1 cardimage role-Selected1'][text()='BluePrint']", BluePrintname, SeleniumUtilities.OBJWAITTIMEOUT));
            System.out.println("SoftwareStack BP is Created");
        }
        catch (Exception ex){
            BaseView.takeScreenshot("VerifyBluePrint");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }
    }



