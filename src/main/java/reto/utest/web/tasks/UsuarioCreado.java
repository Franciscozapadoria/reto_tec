package reto.utest.web.tasks;

import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import reto.utest.web.actionObjects.TakeScreenshot;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static reto.utest.web.ui.TellUsAboutYourSelf.LBL_SUBTITULO;
import static reto.utest.web.ui.TellUsAboutYourSelf.TXT_NOMBRE;
import static reto.utest.web.ui.TheLastStep.*;

public class UsuarioCreado implements Task {

        public UsuarioCreado () {

        }

        public static reto.utest.web.tasks.UsuarioCreado correcta() {
            return Tasks.instrumented(UsuarioCreado.class);
        }

        @Override
        @Step("Usuario creado")
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                   // WaitUntil.the(LBL_SUBTITULO,isVisible()).forNoMoreThan(15).seconds(),
                  // Enter.theValue(" ").into(TXT_CONTRASENA),
            );
        }
    }

