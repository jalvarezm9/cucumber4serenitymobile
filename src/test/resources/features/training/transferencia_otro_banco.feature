# language: es
# Author: juan.alvarezm@outlook.com

@TransferOtherBank
Característica: Transferencia a otro Banco

  @MenuOperaciones @Regresion @TransferOtherBank88
  Esquema del escenario: CP01 Transf a otro Banco con TD, Clave Web, Cta a cargo Ahorro , Sin Restriccion

    Dado que el usuario inicio sesión con numTarjeta "<tarjeta>", tipoDoc "<tipoDocumento>", numDocumento "<NroDocumento>" y claveWeb "<password>".
    Y la aplicacion muestra la lista de mis productos
    Cuando selecciona la opcion 'Operaciones' del MenuPrincipal
    Y selecciona la opción 'Transferencias'
    Y selecciona la opción 'A otro banco'
    Y selecciona la cuenta <CuentaCargo>
    Y ingresa el numero de CCI <CuentaDestino>
    Y selecciona la moneda <Moneda>
    Y ingresa el monto <Monto>
    Y selecciona el boton 'Siguiente'
    Y se muestra la pantalla de confirmacion
    Y selecciona el boton 'Confirmar'
    Entonces la aplicacion muestra la Constancia de operacion

    Ejemplos:
      | tarjeta          | tipoDocumento | NroDocumento | password | CuentaCargo      | CuentaDestino        | Moneda | Monto |
      | 4547770000221739 | DNI           | 70080212     | A333333  | Millonaria Soles | 02304521001169278582 | Soles  | 1.10  |