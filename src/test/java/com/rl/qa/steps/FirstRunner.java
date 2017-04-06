package com.rl.qa.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sse0051 on 6/4/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {

                "src/test/resources/com.rl.qa/PetclinicCreateDeploy.feature",
                "src/test/resources/com.rl.qa/AzureBlueprint.feature",
                "src/test/resources/com.rl.qa/AppDeploy.feature",
                "src/test/resources/com.rl.qa/Blueprint.feature"
        },

        glue={"com.rl.qa"},
        format = {"pretty", "html:target/cucumber", "json:target/reports/json/cucumber.json"}
)
public class FirstRunner {
}
