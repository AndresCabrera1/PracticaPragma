package co.com.test.restservices.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ServiceUser implements Task {

    private String Url;
    private EnvironmentVariables environmentVariables;

    @Override
    @Step("Obtiene los datos del usuario")
    public <T extends Actor> void performAs(T actor) {
     Url = environmentVariables.getProperty("UrlBaseService");
     actor.whoCan(CallAnApi.at(Url)).attemptsTo(
             Get.resource("/user")
     );
        List<Map<String, Object>> DataService = SerenityRest.lastResponse().getBody().jsonPath().getJsonObject("data");
        Serenity.setSessionVariable("PATH_SERVICE").to(DataService);
    }

    public static Performable obtenerDatos(){
        return instrumented(ServiceUser.class);
    }

}
