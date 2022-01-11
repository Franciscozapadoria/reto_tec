package reto.utest.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TellUsAboutYourSelf {
    public static final Target LBL_SUBTITULO = Target.the("subtitulo cuentanos acerca de ti").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[1]/div/div/h1/span[2]"));
    public static final Target TXT_NOMBRE = Target.the("campo de texto para el nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("campo de texto para el apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO = Target.the("campo de texto del correo").located(By.id("email"));
    public static final Target LST_MES = Target.the("lista desplegable mes de cumpleano").located(By.xpath("//*[@id='birthMonth']/option[7]"));
    public static final Target LST_DIA = Target.the("lista desplegable dia de cumpleano").located(By.xpath("//*[@id='birthDay']/option[11]"));
    public static final Target LST_ANO = Target.the("lista desplegable ano de cumpleano").located(By.xpath("//*[@id='birthYear']/option[6]"));
    public static final Target BTN_SEGUIR_PASO_2 = Target.the("boton para continuar al siguiente paso").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a/i"));

}


