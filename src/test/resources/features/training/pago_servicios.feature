# language: es
# Author: juan.alvarezm@outlook.com

@PagoServicio
Característica: Pago Servicios
  Como usuario del App interbank,
  quiero acceder a la sección Pago de servicios
  realizar el pago parcial o total de su servicio

  @PagoServicio @CP01
  Esquema del escenario: CP01 Pago Servicio sin Data
    Dado que el usuario inicio sesión con numTarjeta "<tarjeta>", tipoDoc "<tipoDocumento>", numDocumento "<NroDocumento>" y claveWeb "<password>".
    Y la aplicacion muestra la lista de mis productos
    Cuando selecciona la opcion 'Operaciones' del MenuPrincipal
    Y selecciona la opción 'Pagos y recargas'
    Y selecciona la opción 'Pago de servicios'
    Y busca y selecciona una empresa o institucion <empresa>
    Y selecciona un servicio <servicio>
    Y ingresa un codigo de deuda <codigoDeudor>
    Y selecciona el boton 'BuscarRecibos'
    Y ingresa el monto <Monto>
    Y selecciona el boton 'Siguiente'
    Y selecciona la cuenta <CuentaCargo>
    Y se muestra la pantalla de confirmacion
    Y ingresa el codigo SMS
    Y selecciona el boton 'Confirmar'
    Entonces la aplicacion muestra la Constancia de operacion

    Ejemplos:
    | tarjeta          | tipoDocumento | NroDocumento | password | empresa      | servicio   | codigoDeudor | CuentaCargo | Monto |
    | 4547770000221739 | DNI           | 70080212     | A333333  | fe y alegria | Donaciones | dni          | Visa Soles  | 2.00  |

  @PagoServicio @CP02
  Esquema del escenario: Cp04 Pago Servicio Maestra
    Dado que el usuario inicio sesión con numTarjeta "<tarjeta>", tipoDoc "<tipoDocumento>", numDocumento "<NroDocumento>" y claveWeb "<password>".
    Y la aplicacion muestra la lista de mis productos
    Cuando selecciona la opcion 'Operaciones' del MenuPrincipal
    Y selecciona la opción 'Pagos y recargas'
    Y selecciona la opción 'Pago de servicios'
    Y busca y selecciona una empresa o institucion <empresa>
    Y selecciona un servicio <servicio>
    Y ingresa un codigo de deuda <codigoDeudor>
    Y selecciona el boton 'BuscarRecibos'
    Y selecciona la moneda <Moneda>
    Y ingresa el monto <Monto>
    Y selecciona el boton 'Siguiente'
    Y selecciona la cuenta <CuentaCargo>
    Y se muestra la pantalla de confirmacion
    Y ingresa el codigo SMS
    Y selecciona el boton 'Confirmar'
    Entonces la aplicacion muestra la Constancia de operacion

    Ejemplos:
      | tarjeta          | tipoDocumento | NroDocumento | password | empresa | servicio     | codigoDeudor | CuentaCargo         | Moneda | Monto |
      | 4547770000221739 | DNI           | 70080212     | A333333  | LA VIGA | Pagos Varios | 20493909984  | Ahorro Sueldo Soles | Dólares  | 1.00  |