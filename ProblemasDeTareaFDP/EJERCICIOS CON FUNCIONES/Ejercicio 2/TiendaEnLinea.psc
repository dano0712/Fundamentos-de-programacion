Algoritmo TiendaEnLinea
	
    Definir cantidadProductos, i Como Entero
    Definir precio, subtotalProducto, subtotalGeneral Como Real
    Definir descuento, subtotalConDescuento Como Real
    Definir impuesto, envio, total Como Real
    Definir tipoCliente Como Entero
    Definir codigoPostal Como Caracter
	
    // Cantidad de productos
    Repetir
        Escribir "¿Cuántos productos desea comprar?"
        Leer cantidadProductos
		
        Si cantidadProductos <= 0 Entonces
            Escribir "La cantidad debe ser mayor que cero."
        FinSi
    Hasta Que cantidadProductos > 0
	
	
    subtotalGeneral <- 0
	
    // Calcular subtotal de cada producto
    Para i <- 1 Hasta cantidadProductos Hacer
		
        Repetir
            Escribir "Ingrese el precio del producto ", i, ":"
            Leer precio
			
            Si precio <= 0 Entonces
                Escribir "El precio debe ser mayor que cero."
            FinSi
        Hasta Que precio > 0
		
		
        Repetir
            Escribir "Ingrese la cantidad del producto ", i, ":"
            Leer cantidad
			
            Si cantidad <= 0 Entonces
                Escribir "La cantidad debe ser mayor que cero."
            FinSi
        Hasta Que cantidad > 0
		
		
        subtotalProducto <- CalcularSubtotalProducto(precio, cantidad)
		
        subtotalGeneral <- subtotalGeneral + subtotalProducto
		
    FinPara
	
	
    // Tipo de cliente
    Repetir
        Escribir "Seleccione el tipo de cliente:"
        Escribir "1. Cliente regular"
        Escribir "2. Cliente frecuente"
        Leer tipoCliente
		
        Si tipoCliente <> 1 Y tipoCliente <> 2 Entonces
            Escribir "El tipo de cliente debe ser 1 o 2."
        FinSi
    Hasta Que tipoCliente = 1 O tipoCliente = 2
	
	
    descuento <- CalcularDescuento(subtotalGeneral, tipoCliente)
	
	
    // Código postal
    Repetir
        Escribir "Ingrese el código postal:"
        Leer codigoPostal
		
        Si Longitud(codigoPostal) <> 5 Entonces
            Escribir "El código postal debe contener exactamente 5 dígitos."
        FinSi
    Hasta Que Longitud(codigoPostal) = 5
	
	
    envio <- CalcularEnvio(subtotalGeneral, codigoPostal)
	
    subtotalConDescuento <- subtotalGeneral - descuento
	
    impuesto <- CalcularImpuesto(subtotalConDescuento)
	
    total <- CalcularTotal(subtotalGeneral, descuento, impuesto, envio)
	
	
    Escribir ""
    Escribir "----- RESUMEN DE COMPRA -----"
    Escribir "Subtotal general: $", subtotalGeneral
    Escribir "Descuento: $", descuento
    Escribir "Envío: $", envio
    Escribir "Impuesto: $", impuesto
    Escribir "Total a pagar: $", total
	
FinAlgoritmo


SubProceso resultado <- CalcularSubtotalProducto(precio, cantidad)
	
    Definir resultado Como Real
	
    resultado <- precio * cantidad
	
FinSubProceso


SubProceso resultado <- CalcularDescuento(subtotal, tipoCliente)
	
    Definir resultado Como Real
	
    Si tipoCliente = 1 Entonces
        resultado <- 0
    Sino
        resultado <- subtotal * 0.10
    FinSi
	
FinSubProceso


SubProceso resultado <- CalcularEnvio(subtotal, codigoPostal)
	
    Definir resultado Como Real
	
    Si subtotal < 1000 Entonces
        resultado <- 150
    Sino
        Si subtotal < 3000 Entonces
            resultado <- 80
        Sino
            resultado <- 0
        FinSi
    FinSi
	
FinSubProceso


SubProceso resultado <- CalcularImpuesto(subtotalConDescuento)
	
    Definir resultado Como Real
	
    resultado <- subtotalConDescuento * 0.16
	
FinSubProceso


SubProceso resultado <- CalcularTotal(subtotal, descuento, impuesto, envio)
	
    Definir resultado Como Real
	
    resultado <- subtotal - descuento + impuesto + envio
	
FinSubProceso