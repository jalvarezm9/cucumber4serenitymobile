# language: es
# Author: juan.alvarezm@outlook.com

@Travel
Característica: Me voy de viaje
  Como usuario del App interbank,
  quiero ingresar a la opción Me voy de viaje
  para realizar el registro de mis tarjetas mientras me encuentro fuera del pais

  @Travel @CP01
  Esquema del escenario: CP01 - Me voy de Viaje - TD Opción Menu Más - 1 Pais
    Dado que el usuario inicio sesión con numTarjeta "<tarjeta>", tipoDoc "<tipoDocumento>", numDocumento "<NroDocumento>" y claveWeb "<password>".
    Y la aplicacion muestra la lista de mis productos
    Cuando selecciona la opcion 'Más' del MenuPrincipal
    Y selecciona la opcion 'MeVoyDeViaje'
    Y selecciona el Pais destino <pais>
    Y selecciona la fecha de salida y retorno
    Y [Travel] selecciona el boton 'Siguiente'
    Y selecciona la tarjeta <tarDebito>
    Y [Travel] selecciona el boton 'Siguiente'
    Y se muestra la pantalla de confirmacion
    Y ingresa un email <email> y celular <celular>
    Y selecciona el boton Confirmar
    Entonces la aplicacion muestra la Constancia de operacion

    Ejemplos:
      | tarjeta          | tipoDocumento | NroDocumento | password | pais    | tarDebito  | email                   | celular   |
      | 4547770000221739 | DNI           | 70080212     | a333333  | Ecuador | Débito Oro | juan.alvarez@mdp.com.pe | 942114188 |

  @Travel @CP02
  Esquema del escenario: CP02 - Me voy de Viaje - TD Opción Shorcut - 1 Pais
    Dado que el usuario inicio sesión con numTarjeta "<tarjeta>", tipoDoc "<tipoDocumento>", numDocumento "<NroDocumento>" y claveWeb "<password>".
    Y la aplicacion muestra la lista de mis productos
    Cuando selecciona el producto <producto>
    Y selecciona el 'ShortcutMenu'
    Y selecciona la opcion shortcut 'Me voy de viaje'
    Y selecciona el Pais destino <pais>
    Y selecciona la fecha de salida y retorno
    Y [Travel] selecciona el boton 'Siguiente'
    Y selecciona la tarjeta <tarDebito>
    Y [Travel] selecciona el boton 'Siguiente'
    Y se muestra la pantalla de confirmacion
    Y ingresa un email <email> y celular <celular>
    Y selecciona el boton 'Confirmar'
    Entonces la aplicacion muestra la Constancia de operacion

    Ejemplos:
      | tarjeta          | tipoDocumento | NroDocumento | producto   | password | pais    | tarDebito  | email                   | celular   |
      | 4547770000221739 | DNI           | 70080212     | Visa Soles | a333333  | Ecuador | Débito Oro | juan.alvarez@mdp.com.pe | 942114188 |