package com.parabank.questions;

import com.parabank.pages.RegisterSuccessPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class RegisterQuestions {
    public static Question<String> mensajeExitoso(){
        return actor -> TextContent.of(RegisterSuccessPage.LBL_REGISTER_SUCCESS).viewedBy(actor).asString();
    }
}
