package reto.utest.web.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import reto.utest.web.actionObjects.TakeScreenshot;
import static reto.utest.web.ui.TellUsYourDevices.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarDispositivo implements Task {

    public RegistrarDispositivo(){

    }

    public static RegistrarDispositivo exitoso() {
        return Tasks.instrumented(RegistrarDispositivo.class);
    }

    @Override
    @Step("Registrar dispositivo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_AGREGARDISPOSITIVO,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LST_SISTEMA_OPERATIVO),
                Click.on(LST_VERSION_DE_SISTEMA),
                Click.on(LST_LENGUAJE_DE_SISTEMA),
                Click.on(BTN_SEGUIR_PASO_4),
                TakeScreenshot.asEvidence());
}
}

