package com.parabank.questions;

import com.parabank.pages.HomePage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class LoginQuestions {
    public static Question<String> mensajeLoginExitoso(){
        return actor -> TextContent.of(HomePage.LBL_LOGINSUCCESS).viewedBy(actor).asString();
    }
}
