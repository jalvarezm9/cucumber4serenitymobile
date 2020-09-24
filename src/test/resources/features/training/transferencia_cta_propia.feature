# language: es
# Author: juan.alvarezm@outlook.com

@TransfPropia
Característica: Transferencia a cuenta propia

  Esquema del escenario: CP01 TRX propia con TD, Clave Web, Cuenta Mancomunada a Ahorro, sin restricciones

    Dado que el usuario inicio sesión con numTarjeta "<tarjeta>", tipoDoc "<tipoDocumento>", numDocumento "<NroDocumento>" y claveWeb "<password>".
    Y la aplicacion muestra la lista de mis productos
    Cuando selecciona la opcion 'Operaciones' del MenuPrincipal
    Y selecciona la opción 'Transferencias'
    Y selecciona la opción 'A cuenta propia'
    Y selecciona la cuenta <CuentaCargo>
    Y selecciona la cuenta <CuentaDestino>
    Y selecciona la moneda <Moneda>
    Y ingresa el monto <Monto>
    Y selecciona el boton 'Siguiente'
    Y se muestra la pantalla de confirmacion
    Y selecciona el boton 'Confirmar'
    Entonces la aplicacion muestra la Constancia de operacion

    Ejemplos:
      | tarjeta          | tipoDocumento | NroDocumento | password | CuentaCargo         | CuentaDestino     | Moneda | Monto |
      | 4547770000221739 | DNI           | 70080212     | A333333  | Ahorro Sueldo Soles | Cuenta Simple AFP | Soles  | 1.20  |