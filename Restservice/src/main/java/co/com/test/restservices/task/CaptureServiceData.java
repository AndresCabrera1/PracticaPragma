package co.com.test.restservices.task;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CaptureServiceData implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, Object>> arrayPeoduct = Serenity.sessionVariableCalled("PATH_SERVICE");
        Serenity.setSessionVariable("ID").to(arrayPeoduct.get(2).get("id").toString());
        Serenity.setSessionVariable("NAME").to(arrayPeoduct.get(2).get("name").toString());
        Serenity.setSessionVariable("YEAR").to(arrayPeoduct.get(2).get("year").toString());
        Serenity.setSessionVariable("COLOR").to(arrayPeoduct.get(2).get("color").toString());
        Serenity.setSessionVariable("PANTONE_VALUE").to(arrayPeoduct.get(2).get("pantone_value").toString());

    }

    public static Performable phat(){
        return instrumented(CaptureServiceData.class);
    }

}
