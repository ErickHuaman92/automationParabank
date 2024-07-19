package com.parabank.pages;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target LBL_REGISTER = Target.the("Link de opcion Register").locatedBy("//a[text()='Register']");
    public static Target TXT_USERNAME = Target.the("Input Usuario").locatedBy("//input[@name='username']");
    public static Target TXT_PASSWORD = Target.the("Input Contraseña").locatedBy("//input[@name='password']");
    public static Target BTN_LOGIN = Target.the("Boton Login").locatedBy("//input[@type='submit']");
    public static Target LBL_LOGINSUCCESS = Target.the("Texto de login exitoso").locatedBy("//h1[contains(text(),'Accounts Overview')]");
}