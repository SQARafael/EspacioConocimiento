package com.youtube.UI;
/*
 * @(#) DetalleDeLaCancion.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class DetalleDeLaCancion {
    public static Target LBL_TITLE = Target
            .the("songs collections").
            locatedBy("//h1[@class='style-scope ytd-watch-metadata']");
}
