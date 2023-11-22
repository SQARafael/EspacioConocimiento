package com.youtube.UI;
/*
 * @(#) ListadeCancionesUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ListadeCancionesUI {
    public static Target LBL_NOMBRECANCION= Target.the("Lista canciones")
            .locatedBy("//yt-formatted-string[@class='style-scope ytd-video-renderer' and contains(@aria-label,'Despacito')]");
}
