package com.parabank.pages;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterSuccessPage {
    public static Target LBL_REGISTER_SUCCESS = Target.the("Mensaje Registro Exitoso").locatedBy("//p[text()='Your account was created successfully. You are now logged in.']");
}
