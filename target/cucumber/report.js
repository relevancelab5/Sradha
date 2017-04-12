$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com.rl.qa/PetclinicCreateDeploy.feature");
formatter.feature({
  "line": 2,
  "name": "As a user Create,launch and Deploy Petclinic",
  "description": "",
  "id": "as-a-user-create,launch-and-deploy-petclinic",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mouse"
    }
  ]
});
formatter.scenario({
  "line": 58,
  "name": ": First create ,launch and deploy petclinic",
  "description": "",
  "id": "as-a-user-create,launch-and-deploy-petclinic;:-first-create-,launch-and-deploy-petclinic;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@mouse"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I Login to catalyst using \"http:neocatalyst.rlcatalyst.com/\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter  \"superadmin\" on User name text box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter \"superadmin@123\"  on Password testbox",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on BOTS",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Build_Petclinic_Nexus\" in searchbox",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Execute",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#     And I enter \"\u003cvalue\u003e\" in edit parameter"
    }
  ],
  "line": 12,
  "name": "I Click on the ok button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on the close",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"WORKZONE\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I move the cursor on \"Menu\" optn",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on RL_Customer",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Applications",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on Infrastructure",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Blueprint option",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on lauch button of AppDeployDemo template",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select value in \"RL_Customer\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I select \"Sensu Prod\" value",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on the ok button at the end",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click On close",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Infrastructure",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on instances",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on edit of instance",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter \"Deploy_petclinic\" value",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I clicked Save",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on instance control panel",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click Actionhistory",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 32,
      "value": "#     Then verify status true or not"
    }
  ],
  "line": 33,
  "name": "I hit on close",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I move the cursor on \"Menu\" optn",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I click on RL_Customer",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on Applications",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I clicked Orchestration",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I click on edit button of Deploy petclinic",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I click on DeployPetclinic,click on button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I click on update",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on BOTS",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I enter \"Deploy Petclinic\" Deploy Petclinic",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I hit on execute opt",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "I select n put \"NexusServer\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I select on \"petclinic\" value",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I select on the \"org.catalyst\" value",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I select \"petclinic\" val",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "I select \"48\" opt",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 49,
      "value": "#      And I enter \"\u003cURI\u003e\" val"
    }
  ],
  "line": 50,
  "name": "I get the host ip",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I hit on the Ok",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click On close optn",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I enter the urlport",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http:neocatalyst.rlcatalyst.com/",
      "offset": 27
    }
  ],
  "location": "BlueprintSteps.i_Login_to_catalyst_using(String)"
});
formatter.result({
  "duration": 34756081964,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "superadmin",
      "offset": 10
    }
  ],
  "location": "BlueprintSteps.iEnterOnUserNameTextBox(String)"
});
formatter.result({
  "duration": 30281008092,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "superadmin@123",
      "offset": 9
    }
  ],
  "location": "BlueprintSteps.iEnterOnPasswordTestbox(String)"
});
formatter.result({
  "duration": 30186322598,
  "status": "passed"
});
formatter.match({
  "location": "BlueprintSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 3418235469,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnBOTS()"
});
formatter.result({
  "duration": 308787486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Build_Petclinic_Nexus",
      "offset": 9
    }
  ],
  "location": "PetclinicCreateDeploySteps.iEnterInSearchbox(String)"
});
formatter.result({
  "duration": 43152742360,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnExecute()"
});
formatter.result({
  "duration": 16445118645,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnTheOkButton()"
});
formatter.result({
  "duration": 14974449330,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnTheClose()"
});
formatter.result({
  "duration": 4414144583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "WORKZONE",
      "offset": 12
    }
  ],
  "location": "BlueprintSteps.iClickOn(String)"
});
formatter.result({
  "duration": 2430451293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Menu",
      "offset": 22
    }
  ],
  "location": "AppDeloySteps.iMoveTheCursorOnOptn(String)"
});
formatter.result({
  "duration": 8697542700,
  "status": "passed"
});
formatter.match({
  "location": "AppDeloySteps.i_click_on_RL_Customer()"
});
formatter.result({
  "duration": 13316653472,
  "status": "passed"
});
formatter.match({
  "location": "AppDeloySteps.i_click_on_Applications()"
});
formatter.result({
  "duration": 974561434,
  "status": "passed"
});
formatter.match({
  "location": "AppDeloySteps.i_click_on_Infrastructure()"
});
formatter.result({
  "duration": 503264512,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnBlueprintOption()"
});
formatter.result({
  "duration": 821888276,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnLauchButtonOfAppDeployDemoTemplate()"
});
formatter.result({
  "duration": 704882001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RL_Customer",
      "offset": 19
    }
  ],
  "location": "PetclinicCreateDeploySteps.iSelectValueIn(String)"
});
formatter.result({
  "duration": 31514868448,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sensu Prod",
      "offset": 10
    }
  ],
  "location": "PetclinicCreateDeploySteps.iSelectValue(String)"
});
formatter.result({
  "duration": 30228359557,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnTheOkButtonAtTheEnd()"
});
formatter.result({
  "duration": 291100148557,
  "status": "passed"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnClose()"
});
formatter.result({
  "duration": 2014819043,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027sse0051-GA-78LMT-S2\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00274.4.0-72-generic\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: BrowserDriver\nCapabilities [{applicationCacheEnabled\u003dtrue, rotatable\u003dfalse, handlesAlerts\u003dtrue, databaseEnabled\u003dtrue, version\u003d35.0, platform\u003dLINUX, nativeEvents\u003dfalse, acceptSslCerts\u003dtrue, webStorageEnabled\u003dtrue, locationContextEnabled\u003dtrue, browserName\u003dfirefox, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 31896d32-f225-4bfa-85cc-c240d74e75a0\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:665)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\n\tat org.openqa.selenium.firefox.FirefoxDriver.getScreenshotAs(FirefoxDriver.java:341)\n\tat com.rl.qa.browsers.BrowserDriver.takeScreenshot(BrowserDriver.java:65)\n\tat com.rl.qa.utils.BaseView.takeScreenshot(BaseView.java:154)\n\tat com.rl.qa.views.PetclinicCreateDeployViews.ClickOnClose(PetclinicCreateDeployViews.java:176)\n\tat com.rl.qa.steps.PetclinicCreateDeploySteps.iClickOnClose(PetclinicCreateDeploySteps.java:81)\n\tat ✽.And I click On close(src/test/resources/com.rl.qa/PetclinicCreateDeploy.feature:24)\nCaused by: org.apache.http.conn.HttpHostConnectException: Connect to 127.0.0.1:7055 [/127.0.0.1] failed: Connection refused (Connection refused)\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:158)\n\tat org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:353)\n\tat org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:380)\n\tat org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)\n\tat org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:184)\n\tat org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:88)\n\tat org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)\n\tat org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:184)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:71)\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:55)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.fallBackExecute(ApacheHttpClient.java:144)\n\tat org.openqa.selenium.remote.internal.ApacheHttpClient.execute(ApacheHttpClient.java:90)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\n\tat org.openqa.selenium.firefox.internal.NewProfileExtensionConnection.execute(NewProfileExtensionConnection.java:160)\n\tat org.openqa.selenium.firefox.FirefoxDriver$LazyCommandExecutor.execute(FirefoxDriver.java:380)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:644)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\n\tat org.openqa.selenium.firefox.FirefoxDriver.getScreenshotAs(FirefoxDriver.java:341)\n\tat com.rl.qa.browsers.BrowserDriver.takeScreenshot(BrowserDriver.java:65)\n\tat com.rl.qa.utils.BaseView.takeScreenshot(BaseView.java:154)\n\tat com.rl.qa.views.PetclinicCreateDeployViews.ClickOnClose(PetclinicCreateDeployViews.java:176)\n\tat com.rl.qa.steps.PetclinicCreateDeploySteps.iClickOnClose(PetclinicCreateDeploySteps.java:81)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:297)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat org.junit.runners.Suite.runChild(Suite.java:127)\n\tat org.junit.runners.Suite.runChild(Suite.java:26)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:89)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:40)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:94)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:51)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:237)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)\nCaused by: java.net.ConnectException: Connection refused (Connection refused)\n\tat java.net.PlainSocketImpl.socketConnect(Native Method)\n\tat java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)\n\tat java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)\n\tat java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)\n\tat java.net.Socket.connect(Socket.java:589)\n\tat org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:74)\n\tat org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)\n\t... 79 more\n",
  "status": "failed"
});
formatter.match({
  "location": "AppDeloySteps.i_click_on_Infrastructure()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppDeloySteps.i_click_on_instances()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnEditOfInstance()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Deploy_petclinic",
      "offset": 9
    }
  ],
  "location": "PetclinicCreateDeploySteps.iEnterValue(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickedSave()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnInstanceControlPanel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickActionhistory()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iHitOnClose()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Menu",
      "offset": 22
    }
  ],
  "location": "AppDeloySteps.iMoveTheCursorOnOptn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppDeloySteps.i_click_on_RL_Customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppDeloySteps.i_click_on_Applications()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickedOrchestration()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnEditButtonOfDeployPetclinic()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnDeployPetclinicClickOnButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnUpdate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnBOTS()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Deploy Petclinic",
      "offset": 9
    }
  ],
  "location": "PetclinicCreateDeploySteps.iEnterDeployPetclinic(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iHitOnExecuteOpt()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "NexusServer",
      "offset": 16
    }
  ],
  "location": "PetclinicCreateDeploySteps.iSelectNPut(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "petclinic",
      "offset": 13
    }
  ],
  "location": "PetclinicCreateDeploySteps.iSelectOnValue(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "org.catalyst",
      "offset": 17
    }
  ],
  "location": "PetclinicCreateDeploySteps.iSelectOnTheValue(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "petclinic",
      "offset": 10
    }
  ],
  "location": "PetclinicCreateDeploySteps.iSelectVal(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "48",
      "offset": 10
    }
  ],
  "location": "PetclinicCreateDeploySteps.iSelectOpt(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iGetTheHostIp()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iHitOnTheOk()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iClickOnCloseOptn()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PetclinicCreateDeploySteps.iEnterTheUrlport()"
});
formatter.result({
  "status": "skipped"
});
});