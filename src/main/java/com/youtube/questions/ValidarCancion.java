package com.youtube.questions;
/*
 * @(#) ValidarCancion.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.UI.DetalleDeLaCancion.LBL_TITLE;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ValidarCancion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade cancion = LBL_TITLE.resolveFor(actor);
        return cancion.isDisplayed();
    }

    public static Question<Boolean> from(){
        return new ValidarCancion();
    }
}
