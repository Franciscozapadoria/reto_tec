package reto.utest.web.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/retoTecnico.feature",
        tags="@CrearNuevoUsuarioExitoso",
        glue="reto.utest.web.stepsdefinitions",
        snippets= SnippetType.CAMELCASE)


public class RunnerRetoTecnicoUTest {
}


