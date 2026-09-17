Algoritmo ControlConsumoElectrico
	
    Definir lecturaAnterior, lecturaActual Como Real
    Definir consumo, costoConsumo Como Real
    Definir cargoFijo, costoAntesImpuesto Como Real
    Definir descuento, impuesto, total Como Real
    Definir tieneApoyo Como Logico
	
    cargoFijo <- 95
	
    // Validar lectura anterior
    Repetir
        Escribir "Ingrese la lectura anterior:"
        Leer lecturaAnterior
		
        Si lecturaAnterior < 0 Entonces
            Escribir "La lectura no puede ser negativa."
        FinSi
    Hasta Que lecturaAnterior >= 0
	
	
    // Validar lectura actual
    Repetir
        Escribir "Ingrese la lectura actual:"
        Leer lecturaActual
		
        Si lecturaActual < lecturaAnterior Entonces
            Escribir "La lectura actual debe ser mayor o igual a la anterior."
        FinSi
    Hasta Que lecturaActual >= lecturaAnterior
	
	
    // Calcular consumo
    consumo <- CalcularConsumo(lecturaAnterior, lecturaActual)
	
	
    // Validar consumo máximo
    Mientras consumo > 10000 Hacer
		
        Escribir "El consumo no puede superar los 10000 kWh."
        Escribir "Ingrese nuevamente las lecturas."
		
        // Validar nuevamente lectura anterior
        Repetir
            Escribir "Ingrese la lectura anterior:"
            Leer lecturaAnterior
			
            Si lecturaAnterior < 0 Entonces
                Escribir "La lectura no puede ser negativa."
            FinSi
        Hasta Que lecturaAnterior >= 0
		
		
        // Validar nuevamente lectura actual
        Repetir
            Escribir "Ingrese la lectura actual:"
            Leer lecturaActual
			
            Si lecturaActual < lecturaAnterior Entonces
                Escribir "La lectura actual debe ser mayor o igual a la anterior."
            FinSi
        Hasta Que lecturaActual >= lecturaAnterior
		
		
        // Recalcular consumo
        consumo <- CalcularConsumo(lecturaAnterior, lecturaActual)
		
    FinMientras
	
	
    // Calcular costo del consumo
    costoConsumo <- CalcularCostoConsumo(consumo)
	
	
    // Preguntar si pertenece al programa de apoyo
    Escribir "¿La vivienda pertenece al programa de apoyo?"
    Escribir "Escriba Verdadero o Falso:"
    Leer tieneApoyo
	
	
    // Calcular costo antes del impuesto
    costoAntesImpuesto <- costoConsumo + cargoFijo
	
	
    // Calcular descuento
    descuento <- CalcularDescuentoApoyo(consumo, costoAntesImpuesto, tieneApoyo)
	
	
    // Calcular impuesto
    impuesto <- CalcularImpuesto(costoAntesImpuesto - descuento)
	
	
    // Calcular total
    total <- CalcularTotal(costoConsumo, cargoFijo, descuento, impuesto)
	
	
    // Mostrar recibo
    MostrarRecibo(consumo, costoConsumo, descuento, impuesto, total)
	
FinAlgoritmo


// ---------------------------------------
// SUBPROCESO PARA CALCULAR EL CONSUMO
// ---------------------------------------

Funcion consumo <- CalcularConsumo(lecturaAnterior, lecturaActual)
	
    consumo <- lecturaActual - lecturaAnterior
	
FinFuncion


// ---------------------------------------
// SUBPROCESO PARA CALCULAR EL COSTO
// ---------------------------------------

Funcion costo <- CalcularCostoConsumo(consumo)
	
    Si consumo <= 150 Entonces
		
        costo <- consumo * 1.20
		
    SiNo
		
        Si consumo <= 400 Entonces
			
            costo <- (150 * 1.20) + ((consumo - 150) * 1.80)
			
        SiNo
			
            costo <- (150 * 1.20) + (250 * 1.80) + ((consumo - 400) * 2.75)
			
        FinSi
		
    FinSi
	
FinFuncion


// ---------------------------------------
// SUBPROCESO PARA CALCULAR DESCUENTO
// ---------------------------------------

Funcion descuento <- CalcularDescuentoApoyo(consumo, costoAntesImpuesto, tieneApoyo)
	
    Si tieneApoyo Y consumo <= 250 Entonces
		
        descuento <- costoAntesImpuesto * 0.30
		
    SiNo
		
        descuento <- 0
		
    FinSi
	
FinFuncion


// ---------------------------------------
// SUBPROCESO PARA CALCULAR IMPUESTO
// ---------------------------------------

Funcion impuesto <- CalcularImpuesto(baseImponible)
	
    impuesto <- baseImponible * 0.16
	
FinFuncion


// ---------------------------------------
// SUBPROCESO PARA CALCULAR TOTAL
// ---------------------------------------

Funcion total <- CalcularTotal(costoConsumo, cargoFijo, descuento, impuesto)
	
    total <- costoConsumo + cargoFijo - descuento + impuesto
	
FinFuncion


// ---------------------------------------
// SUBPROCESO PARA MOSTRAR RECIBO
// ---------------------------------------

SubProceso MostrarRecibo(consumo, costoConsumo, descuento, impuesto, total)
	
    Escribir ""
    Escribir "===== RECIBO DE ELECTRICIDAD ====="
    Escribir "Consumo: ", consumo, " kWh"
    Escribir "Costo por consumo: $", costoConsumo
    Escribir "Cargo fijo: $95.00"
    Escribir "Descuento: $", descuento
    Escribir "Impuesto: $", impuesto
    Escribir "Total a pagar: $", total
	
FinSubProceso