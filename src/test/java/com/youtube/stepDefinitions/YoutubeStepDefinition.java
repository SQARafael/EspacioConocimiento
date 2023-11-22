package com.youtube.stepDefinitions;
/*
 * @(#) YoutubeStepDefinition.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.youtube.questions.ValidarCancion;
import com.youtube.tasks.BuscarCancionTask;
import com.youtube.tasks.SeleccionCancionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class YoutubeStepDefinition {

    @Before
    public void setStage(){

        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre el navegador en la pagina de youtube")
    public void queElUsuarioAbreElNavegadorEnLaPaginaDeYoutube() {
        theActorCalled("user").wasAbleTo(
                Open.url("https://www.youtube.com/")
        );

    }
    @Cuando("el usuario ingresa el nombre de la cancion y presione enter")
    public void elUsuarioIngresaElNombreDeLaCancion() {
        theActorInTheSpotlight().attemptsTo(
                BuscarCancionTask.on()
        );

    }

    @Entonces("el usuario podra reproducir una cancion.")
    public void elUsuarioPodraReproducirUnaCancion() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionCancionTask.on()
        );

        theActorInTheSpotlight().should(
                seeThat(
                        ValidarCancion.from(), Matchers.equalTo(true)
                )
        );

    }
}
