package reto.utest.web.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import reto.utest.web.actionObjects.TakeScreenshot;
import static reto.utest.web.ui.AddYourAddress.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
//import static reto.utest.web.ui.AddYourAddress.BTN_SEGUIR_PASO_3;

public class RegistrarDireccionNuevoUsuario implements Task {

    public RegistrarDireccionNuevoUsuario(){
    }

    public static RegistrarDireccionNuevoUsuario exitoso(){
        return Tasks.instrumented(RegistrarDireccionNuevoUsuario.class);
    }

    @Override
    @Step("Registrar la direccion del nuevo usuario")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_AGREGARDIRECCION,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("CARTAGENA").into(TXT_CIUDAD),
                Enter.theValue("130001").into(TXT_CODIGO_POSTAL),
                Click.on(LST_PAIS),
                Scroll.to(BTN_SEGUIR_PASO_3),
                WaitUntil.the(BTN_SEGUIR_PASO_3,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_SEGUIR_PASO_3),
                TakeScreenshot.asEvidence());
    }
}