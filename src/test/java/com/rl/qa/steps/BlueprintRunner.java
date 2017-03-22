package com.rl.qa.steps; /**
 * Created by sse0051 on 27/2/17.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
        "src/test/resources/com.rl.qa/Blueprint.feature",
        },
        tags={"@Blueprint"},
        glue={"com.rl.qa"},
        format = {"pretty", "html:target/cucumber", "json:target/reports/json/Blueprint.json"}
)
public class BlueprintRunner {
}
