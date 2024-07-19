package com.parabank.pages;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterFormPage {
    public static Target TXT_FIRSTNAME = Target.the("Input Primer Nombre").locatedBy("//input[@id='customer.firstName']");
    public static Target TXT_LASTNAME = Target.the("Input Apellido").locatedBy("//input[@id='customer.lastName']");
    public static Target TXT_ADDRESS = Target.the("Input Direccion").locatedBy("//input[@id='customer.address.street']");
    public static Target TXT_CITY = Target.the("Input Ciudad").locatedBy("//input[@id='customer.address.city']");
    public static Target TXT_STATE = Target.the("Input Estado").locatedBy("//input[@id='customer.address.state']");
    public static Target TXT_ZIPCODE = Target.the("Input Codigo Zip").locatedBy("//input[@id='customer.address.zipCode']");
    public static Target TXT_PHONE = Target.the("Input Telefono").locatedBy("//input[@id='customer.phoneNumber']");
    public static Target TXT_SSN = Target.the("Input SSN").locatedBy("//input[@id='customer.ssn']");
    public static Target TXT_USERNAME = Target.the("Input Usuario").locatedBy("//input[@id='customer.username']");
    public static Target TXT_PASSWORD = Target.the("Input Password").locatedBy("//input[@id='customer.password']");
    public static Target TXT_CONFIRM = Target.the("Input Confirm").locatedBy("//input[@id='repeatedPassword']");
    public static Target BTN_REGISTER = Target.the("Boton Register").locatedBy("//input[@value='Register']");
}
