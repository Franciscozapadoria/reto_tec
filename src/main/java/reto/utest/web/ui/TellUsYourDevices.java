package reto.utest.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TellUsYourDevices {

    public static final Target LBL_AGREGARDISPOSITIVO = Target.the("subtitulo agregar dispositivo").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[1]/div/div/h1/span[2]"));
    public static final Target LST_SISTEMA_OPERATIVO = Target.the("lista desplegable del sistema operativo").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target LST_VERSION_DE_SISTEMA = Target.the("lista desplegable de la version del sistema").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target LST_LENGUAJE_DE_SISTEMA = Target.the("lista desplegable del lenguaje del sistema").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target BTN_SEGUIR_PASO_4 = Target.the("boton siguiente").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));

}
