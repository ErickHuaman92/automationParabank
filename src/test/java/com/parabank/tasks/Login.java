package com.parabank.tasks;

import com.parabank.pages.HomePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

    public Login(){

    }

    public static Performable conDatos(){
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String username = Serenity.sessionVariableCalled("username");
        String password = Serenity.sessionVariableCalled("password");

        actor.attemptsTo(
                WaitUntil.the(HomePage.TXT_USERNAME, isVisible()),
                Enter.theValue(username).into(HomePage.TXT_USERNAME),
                Enter.theValue(password).into(HomePage.TXT_PASSWORD),
                Click.on(HomePage.BTN_LOGIN)
        );

    }
}
