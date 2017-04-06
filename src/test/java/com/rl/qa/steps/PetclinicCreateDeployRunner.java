package com.rl.qa.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by sse0051 on 5/4/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {

                "src/test/resources/com.rl.qa/PetclinicCreateDeploy.feature"
        },
        tags={"@mouse"},
        glue={"com.rl.qa"},
        format = {"pretty", "html:target/cucumber", "json:target/reports/json/PetclinicCreateDeploy.json"}
)
public class PetclinicCreateDeployRunner {
}
