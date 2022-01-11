package reto.utest.web.tasks;

import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import reto.utest.web.actionObjects.TakeScreenshot;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static reto.utest.web.ui.TheLastStep.*;

public class AsignarContrasena implements Task {

    public AsignarContrasena() {

    }

    public static AsignarContrasena correcta() {
        return Tasks.instrumented(AsignarContrasena.class);
    }

    @Override
    @Step("Asignar contrasena")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
}
