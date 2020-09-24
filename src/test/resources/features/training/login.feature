# language: es
# Author: juan.alvarezm@outlook.com

@Login
Característica: Login
  Como cliente de interbank
  Quiero poder iniciar sesion
  Para visualizar mis productos

  @Login @CP01
  Esquema del escenario: CP01 - Login - Cliente con TD, tipoDoc DNI, claveWeb correcta y NS = 2
    Dado  que el usuario ha abierto la aplicación
    Cuando el usuario digita su número de tarjeta <Tarjeta>
    Y selecciona como tipo de documento a <TipoDocumento>
    Y digita su número de documento <NroDocumento>
    Y digita su clave web <ClaveWeb>
    Y selecciona el botón 'Ingresar'
    Entonces la aplicacion muestra la lista de mis productos

    Ejemplos:
      | Tarjeta          | TipoDocumento | NroDocumento | ClaveWeb |
      | 4547770000221739 | DNI           | 70080212     | a333333  |