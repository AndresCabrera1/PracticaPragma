package co.com.test.restservices.stepdefinition;

import co.com.test.restservices.question.CompareData;
import co.com.test.restservices.task.CaptureServiceData;
import co.com.test.restservices.task.ServiceUser;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;

public class UsuariosEjemploStepDefinitions {

    @Before
    public void  prerareStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^el actor desea saber el nombre del usuraio tres$")
    public void el_actor_desea_saber_el_nombre_del_usuraio_tres() {
        theActorCalled("C0pernic0").attemptsTo(
                ServiceUser.obtenerDatos()
        );
    }

    @Cuando("^consume el servicio Usarios$")
    public void consume_el_servicio_Usarios() {
        theActorInTheSpotlight().attemptsTo(
                CaptureServiceData.phat()
        );
    }

    @Entonces("^verifica los datos correspondientes al servicio$")
    public void verifica_los_datos_correspondientes_al_servicio() {
        theActorInTheSpotlight().should(
                seeThat(CompareData.verdadero(),is(true )).because("%s deberia ser %s")
        );
    }
}

