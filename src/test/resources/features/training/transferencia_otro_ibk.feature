# language: es
# Author: juan.alvarezm@outlook.com

@TransferOtherIBK
Característica: Transferencia a otro IBK

  Esquema del escenario: CP01 Trasnf. a otra IBK, Clave Web, Cta Ahorro a Cta Ahorro, Sin Restriccion
    Dado que el usuario inicio sesión con numTarjeta "<tarjeta>", tipoDoc "<tipoDocumento>", numDocumento "<NroDocumento>" y claveWeb "<password>".
    Y la aplicacion muestra la lista de mis productos
    Cuando selecciona la opcion 'Operaciones' del MenuPrincipal
    Y selecciona la opción 'Transferencias'
    Y selecciona la opción 'A otra cuenta Interbank'
    Y selecciona la cuenta <CuentaCargo>
    Y ingresa el numero de cuenta destino <CuentaDestino>
    Y selecciona el tipo de cuenta destino IBK <TipoCuenta>
    Y selecciona el boton 'Siguiente'
    Y selecciona la moneda <Moneda>
    Y ingresa el monto <Monto>
    Y selecciona el boton 'Siguiente'
    Y se muestra la pantalla de confirmacion
    Y selecciona el boton 'Confirmar'
    Entonces la aplicacion muestra la Constancia de operacion

    Ejemplos:
      | tarjeta          | tipoDocumento | NroDocumento | password | CuentaCargo         | CuentaDestino | TipoCuenta           | Moneda | Monto |
      | 4547770000221739 | DNI           | 70080212     | A333333  | Ahorro Sueldo Soles | 1007000066250 | Cuenta Ahorros Soles | Soles  | 1.00  |



