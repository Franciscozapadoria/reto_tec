package reto.utest.web.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto.utest.web.ui.PortalUtest;

public class AbrirUrl implements Task {

   private PortalUtest portalutest;

    public AbrirUrl () {}

    public static AbrirUrl utest() {
        return Tasks.instrumented(AbrirUrl.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(portalutest));
    }
}
