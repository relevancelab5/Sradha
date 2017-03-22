package com.rl.qa.views;

import com.rl.qa.browsers.BrowserDriver;
import com.rl.qa.utils.BaseView;

import com.rl.qa.utils.SeleniumUtilities;
import junit.framework.TestCase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.fail;

/**
 * Created by sse0051 on 1/3/17.
 */
public class AWSproviderViews {
    private static final SeleniumUtilities SeleniumUtil = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SeleniumUtilities.class);
    public static WebElement PagesFrame;
    public static void MoveOnMenu() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.mouseOver("xpath","//strong[text()='Menu']",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("moveCursorOnMenu");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }

    }

    public static void ClickOnProviderConfig() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath","//a[text()='Provider Configuration']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","//a[text()='Provider Configuration']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnProvider");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnProviders() {
        try {

            SeleniumUtil.click("xpath","//a[text()='Providers']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnProviders");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnNew() {
        try {

            SeleniumUtil.click("id","addnewitem",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnNew");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectProviderType() {
        try{
            SeleniumUtil.waitForElementVisibilityOf("xpath",".//*[@id='s2id_providertype']",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='s2id_providertype']",SeleniumUtilities.OBJWAITTIMEOUT);
    }
    catch (Exception ex){
            BaseView.takeScreenshot("SelectProviderType");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnCredentialKey() {
        try{
            Thread.sleep(5000);

            SeleniumUtil.waitForElementIsClickable("id","credentials-accessKeys",8,  SeleniumUtilities.OBJWAITTIMEOUT);

            SeleniumUtil.click("id","credentials-accessKeys",SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("ClickOnCredential");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            TestCase.fail(ex.getMessage());
        }
    }

    public static void ClickOnAcessKey(String Acesskey) {
        try{
            SeleniumUtil.waitForElementPresent("id","acessKey");
            SeleniumUtil.type("id","acessKey",Acesskey,SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex)
        {
            BaseView.takeScreenshot("ClickOnAcesskey");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            TestCase.fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectOrganisation() {
        try {
            SeleniumUtil.waitForElementVisibilityOf("xpath","(//*[text()='Select Organization'])[1]",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath","(//*[text()='Select Organization'])[1]",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectOrganisation");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void UploadFile() {
    }

    public static void ClickOnSave() {
        try {
            SeleniumUtil.waitForElementIsClickable("xpath",".//*[@class='btn cat-btn-update ng-scope']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@class='btn cat-btn-update ng-scope']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("ClickOnsave");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void SelectRegion(String Region) {
        try {
            SeleniumUtil.waitForElementVisibilityOf("xpath",".//*[@id='s2id_5276209077']",SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='s2id_5276209077']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectRegion");
            SeleniumUtilities.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }



    public static void Browsepemfile() {
    }

    public static void EnterSecretKey(String secretKey) {
        try {
            SeleniumUtil.waitForElementPresent("id","secretKey");
            SeleniumUtil.type("id","secretKey",secretKey,SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("EnterSecretKey");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void SelectOnPlannedCost(String PlannedCost) {
        try {
            SeleniumUtil.waitForElementPresent("id","plannedCost");
            SeleniumUtil.waitForElementVisibilityOf("id","plannedCost",2,SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectPlannedCost");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void EnterBucketName(String S3Bucketname) {
        try {
            SeleniumUtil.waitForElementPresent("id","s3BucketName");
            SeleniumUtil.type("id","s3BucketName",S3Bucketname,SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("EnterBucketName");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }



    public static void EnterProvidername(String ProviderName) {
        try {
            SeleniumUtil.waitForElementPresent("id","name");
            SeleniumUtil.type("id","name",ProviderName,SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("EnterProviderName");
            SeleniumUtil.Log.info("Error :" +ex.getMessage());
            fail(ex.getMessage());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


    public static void SelectKeyPair() {
        try {
            SeleniumUtil.waitForElementVisibilityOf("xpath",".//*[@id='s2id_9134090839']",8,SeleniumUtilities.OBJWAITTIMEOUT);
            SeleniumUtil.click("xpath",".//*[@id='s2id_9134090839']",SeleniumUtilities.OBJWAITTIMEOUT);
        }
        catch (Exception ex){
            BaseView.takeScreenshot("SelectKeypair");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());
        }
    }

    public static void ClickOnSetting() {
        try {
            Thread.sleep(2000);
            SeleniumUtil.click("xpath", ".//*[@id='settings']/a", SeleniumUtilities.OBJWAITTIMEOUT);
        } catch (Exception ex) {
            BaseView.takeScreenshot("clickOnSetting");
            SeleniumUtil.Log.info("Error :" + ex.getMessage());
            fail(ex.getMessage());

        } catch (Throwable throwable) {
            throwable.printStackTrace();

        }
    }
}
