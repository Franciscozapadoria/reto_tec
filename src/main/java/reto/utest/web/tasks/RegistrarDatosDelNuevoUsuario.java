package reto.utest.web.tasks;

import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import reto.utest.web.actionObjects.TakeScreenshot;
import static reto.utest.web.ui.BecomeUtester.*;
import static reto.utest.web.ui.TellUsAboutYourSelf.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarDatosDelNuevoUsuario implements Task {

    public RegistrarDatosDelNuevoUsuario(){
    }

    public static RegistrarDatosDelNuevoUsuario exitoso(){
        return Tasks.instrumented(RegistrarDatosDelNuevoUsuario.class);
    }

    @Override
    @Step("Registrar los datos del nuevo usuario")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_JOINTODAY),
                WaitUntil.the(LBL_SUBTITULO,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("JUAN").into(TXT_NOMBRE),
                Enter.theValue("MARTINEZ").into(TXT_APELLIDO),
                Enter.theValue("zapita10@hotmail.com").into(TXT_CORREO),
                Click.on(LST_MES),
                Click.on(LST_DIA),
                Click.on(LST_ANO),
                Scroll.to(BTN_SEGUIR_PASO_2),
                WaitUntil.the(BTN_SEGUIR_PASO_2,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_SEGUIR_PASO_2),
                TakeScreenshot.asEvidence()
        );
    }
}