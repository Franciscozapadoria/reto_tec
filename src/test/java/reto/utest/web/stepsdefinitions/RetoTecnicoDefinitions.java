package reto.utest.web.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import reto.utest.web.tasks.*;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class RetoTecnicoDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que francisco ingresa en el portal Utest$")
    public void ingresaEnElPortalUtest() {

        OnStage.theActorCalled("francisco").wasAbleTo(AbrirUrl.utest());
    }

    @Cuando("diligencia formulario de registro$")
    public void diligenciaFormularioRegistro(){
        theActorInTheSpotlight().attemptsTo(RegistrarDatosDelNuevoUsuario.exitoso());
        theActorInTheSpotlight().attemptsTo(RegistrarDireccionNuevoUsuario.exitoso());
        theActorInTheSpotlight().attemptsTo(RegistrarDispositivo.exitoso());
        theActorInTheSpotlight().attemptsTo(AsignarContrasena.correcta());
    }

    @Entonces("^se crea como usuario nuevo$")
    public void creaUsuarioNuevo(){
       //theActorInTheSpotlight().attemptsTo(UsuarioCreado.Correcto);

    }
}
