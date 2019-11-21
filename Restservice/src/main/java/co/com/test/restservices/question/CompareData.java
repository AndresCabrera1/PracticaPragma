package co.com.test.restservices.question;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompareData implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

     return Serenity.sessionVariableCalled("ID").toString().equalsIgnoreCase("3") && Serenity.sessionVariableCalled("NAME").toString().equalsIgnoreCase("true red") &&
             Serenity.sessionVariableCalled("YEAR").toString().equalsIgnoreCase("2002") && Serenity.sessionVariableCalled("COLOR").toString().equalsIgnoreCase("#BF1932") &&
             Serenity.sessionVariableCalled("PANTONE_VALUE").toString().equalsIgnoreCase("19-1664");
    }
    public static CompareData verdadero(){
        return new CompareData();
    }
}
