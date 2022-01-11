package reto.utest.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class BecomeUtester {
    public static final Target BTN_JOINTODAY = Target.the("boton join today").located(By.className("unauthenticated-nav-bar__sign-up"));
}
