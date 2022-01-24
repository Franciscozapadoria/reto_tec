package reto.utest.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TheLastStep {

    public static final Target LBL_SUBTITULO = Target.the("subtitulo cuentanos acerca de ti").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}
