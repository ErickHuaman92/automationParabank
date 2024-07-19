package com.parabank;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import net.serenitybdd.annotations.Managed;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

//import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

//@RunWith(Cucumber.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(//plugin = {"pretty"},
        features = {"src/test/resources/features"},
        tags = "@registrarClienteParabank",
        glue = {"com.parabank.stepsdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CucumberTestSuite {

//    @Managed(uniqueSession = true, clearCookies = BeforeEachTest)
//    WebDriver driver;
//
//    @RunBefore
//    public static void previo() {
//        ExcelUtil.getInstancia().escribirFeatures();
//    }
}
