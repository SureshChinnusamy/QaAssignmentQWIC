
package com.qwic.assessment.qaAssesment.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" },
        features="src/test/resources/Feature",
        glue="com.qwic.assessment.qaAssesment",
tags="@FormSubmit")

public class FormSubmitRunner {

}
