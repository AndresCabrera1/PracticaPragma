package co.com.test.restservices.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/usuarios_ejemplo.feature",
        glue = "co.com.test.restservices.stepdefinition"
)

public class UsuariosEjemplo {
}
