package reto.utest.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddYourAddress {

    public static final Target LBL_AGREGARDIRECCION = Target.the("subtitulo agrega la direccion").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[1]/div/div/h1/span[2]"));
    public static final Target TXT_CIUDAD = Target.the("campo de texto de la ciudad").located(By.xpath("//*[@id='city]'"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("campo de codigo postal").located(By.xpath("//*[@id='zip']"));
    public static final Target LST_PAIS = Target.the("lista desplegable del pais").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BTN_SEGUIR_PASO_3 = Target.the("boton para continuar al siguiente paso").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}
