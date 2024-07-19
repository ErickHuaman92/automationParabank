package com.parabank;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(//plugin = {"pretty"},
        features = {"src/test/resources/features"},
        tags = "@registrarClienteParabank",
        glue = {"com.parabank.stepsdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CucumberTestSuite {
}
