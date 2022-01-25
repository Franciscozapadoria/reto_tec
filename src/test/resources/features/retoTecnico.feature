# Autor:francisco zapa Javierzappa.1411@gmail.com
# language:es
# Tags:retoTecnico

@retoTecnicoUtest
Característica: Prueba portal utest
Como usuario no registrado
Quiero ingresar al portal y realizar registro
Para crear un nuevo usuario en el portal

  @CrearNuevoUsuarioExitoso
  Escenario: usuario ingresa a portal utest y realiza registro exitoso
    Dado que francisco ingresa en el portal Utest
        Cuando  diligencia formulario de registro
    Entonces se crea como usuario nuevo

