package com.parabank.tasks;

import com.github.javafaker.Faker;
import com.parabank.pages.HomePage;
import com.parabank.pages.RegisterFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Locale;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarCliente implements Task {

    public RegistrarCliente(){

    }

    public static Performable conDatos(){
        return instrumented(RegistrarCliente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(new Locale("es-PE"));
        String firstName = faker.name().firstName() + " " + faker.name().firstName();
        String lastName = faker.name().lastName() + " " + faker.name().lastName();
        String address = faker.address().streetAddress();
        String city = faker.address().cityName();
        String state = faker.address().state();
        String zipCode = faker.address().zipCode();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String SSN = faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999);
        String username = faker.name().username();
        String password = faker.internet().password();

        actor.attemptsTo(
                Click.on(HomePage.LBL_REGISTER),
                WaitUntil.the(RegisterFormPage.TXT_FIRSTNAME, isVisible()),
                Enter.theValue(firstName).into(RegisterFormPage.TXT_FIRSTNAME),
                Enter.theValue(lastName).into(RegisterFormPage.TXT_LASTNAME),
                Enter.theValue(address).into(RegisterFormPage.TXT_ADDRESS),
                Enter.theValue(city).into(RegisterFormPage.TXT_CITY),
                Enter.theValue(state).into(RegisterFormPage.TXT_STATE),
                Enter.theValue(zipCode).into(RegisterFormPage.TXT_ZIPCODE),
                Enter.theValue(phoneNumber).into(RegisterFormPage.TXT_PHONE),
                Enter.theValue(SSN).into(RegisterFormPage.TXT_SSN),
                Enter.theValue(username).into(RegisterFormPage.TXT_USERNAME),
                Enter.theValue(password).into(RegisterFormPage.TXT_PASSWORD),
                Enter.theValue(password).into(RegisterFormPage.TXT_CONFIRM),
                Click.on(RegisterFormPage.BTN_REGISTER)
        );

    }
}
