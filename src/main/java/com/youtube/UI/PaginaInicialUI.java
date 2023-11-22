package com.youtube.UI;
/*
 * @(#) PaginaInicialUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PaginaInicialUI {

    public static Target TXT_BUSQUEDA= Target.the("Campo de busqueda de canciones")
            .locatedBy("//input[@id='search']");
}
