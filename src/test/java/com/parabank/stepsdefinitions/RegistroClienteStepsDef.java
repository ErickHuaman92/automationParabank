package com.parabank.stepsdefinitions;

import com.github.javafaker.Faker;
import com.parabank.pages.RegisterSuccessPage;
import com.parabank.questions.RegisterQuestions;
import com.parabank.tasks.IngresaWeb;
import com.parabank.tasks.RegistrarCliente;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Locale;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.*;

public class RegistroClienteStepsDef {
    Faker faker = new Faker(new Locale("es-PE"));

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("usuario navega a sitio {string}")
    public void usuarioNavegaSitio(String url) {
        OnStage.theActorCalled(faker.name().firstName()).attemptsTo(IngresaWeb.parabankWeb(url));
    }

    @When("usuario se registra en la web con datos aleatorios")
    public void usuarioRegistraDatosAleatorios() {
        theActorInTheSpotlight().attemptsTo(
                RegistrarCliente.conDatos()
        );
    }

    @Then("valida mensaje de registro exitoso")
    public void visualizaMensajeRegistroExitoso() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(RegisterSuccessPage.LBL_REGISTER_SUCCESS, isPresent()).forNoMoreThan(10).seconds()
        );
        theActorInTheSpotlight().should(
                seeThat("Se muestra mensaje de registro exitoso", RegisterQuestions.mensajeExitoso(), containsString("Your account was created successfully. You are now logged in."))
        );
    }

}
