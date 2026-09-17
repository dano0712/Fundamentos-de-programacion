Algoritmo CotizacionSeguro
	
    Definir valorVehiculo, tarifaBase, recargoEdad Como Real
    Definir recargoAccidentes, subtotal, descuento, costoFinal Como Real
    Definir edad, accidentes Como Entero
    Definir tieneSeguridad Como Logico
	
    Repetir
        Escribir "Ingrese el valor del vehículo:"
        Leer valorVehiculo
		
        Si valorVehiculo <= 0 Entonces
            Escribir "El valor del vehículo debe ser mayor que cero."
        FinSi
    Hasta Que valorVehiculo > 0
	
    Repetir
        Escribir "Ingrese la edad del conductor:"
        Leer edad
		
        Si edad < 18 O edad > 100 Entonces
            Escribir "La edad debe estar entre 18 y 100 años."
        FinSi
    Hasta Que edad >= 18 Y edad <= 100
	
    Repetir
        Escribir "Ingrese la cantidad de accidentes:"
        Leer accidentes
		
        Si accidentes < 0 Entonces
            Escribir "El número de accidentes no puede ser negativo."
        FinSi
    Hasta Que accidentes >= 0
	
    Escribir "¿Cuenta con sistema de seguridad adicional?"
    Escribir "Escriba Verdadero o Falso:"
    Leer tieneSeguridad
	
    tarifaBase <- CalcularTarifaBase(valorVehiculo)
	
    recargoEdad <- CalcularRecargoPorEdad(tarifaBase, edad)
	
    recargoAccidentes <- CalcularRecargoPorAccidentes(tarifaBase, accidentes)
	
    subtotal <- tarifaBase + recargoEdad + recargoAccidentes
	
    descuento <- CalcularDescuentoSeguridad(subtotal, tieneSeguridad)
	
    costoFinal <- CalcularCostoFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento)
	
    Escribir ""
    Escribir "----- COTIZACIÓN DEL SEGURO -----"
    Escribir "Tarifa base: $", tarifaBase
    Escribir "Recargo por edad: $", recargoEdad
    Escribir "Recargo por accidentes: $", recargoAccidentes
    Escribir "Descuento por seguridad: $", descuento
    Escribir "Costo final: $", costoFinal
	
FinAlgoritmo


SubProceso resultado <- CalcularTarifaBase(valorVehiculo)
	
    Definir resultado Como Real
	
    resultado <- valorVehiculo * 0.04
	
FinSubProceso


SubProceso resultado <- CalcularRecargoPorEdad(tarifaBase, edad)
	
    Definir resultado Como Real
	
    Si edad < 25 Entonces
        resultado <- tarifaBase * 0.20
    Sino
        Si edad > 60 Entonces
            resultado <- tarifaBase * 0.10
        Sino
            resultado <- 0
        FinSi
    FinSi
	
FinSubProceso


SubProceso resultado <- CalcularRecargoPorAccidentes(tarifaBase, accidentes)
	
    Definir resultado Como Real
	
    resultado <- tarifaBase * 0.08 * accidentes
	
FinSubProceso


SubProceso resultado <- CalcularDescuentoSeguridad(subtotal, tieneSeguridad)
	
    Definir resultado Como Real
	
    Si tieneSeguridad Entonces
        resultado <- subtotal * 0.05
    Sino
        resultado <- 0
    FinSi
	
FinSubProceso


SubProceso resultado <- CalcularCostoFinal(tarifaBase, recargoEdad, recargoAccidentes, descuento)
	
    Definir resultado Como Real
	
    resultado <- tarifaBase + recargoEdad + recargoAccidentes - descuento
	
FinSubProceso