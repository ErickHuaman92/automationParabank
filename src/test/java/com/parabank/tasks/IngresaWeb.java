package com.parabank.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresaWeb implements Task {
    private EnvironmentVariables environmentVariables;

    private final String url;

    public IngresaWeb(String url){
        this.url=url;
    }

    public static Task parabankWeb(String url){
        return instrumented(IngresaWeb.class,url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(url)));
    }
}
