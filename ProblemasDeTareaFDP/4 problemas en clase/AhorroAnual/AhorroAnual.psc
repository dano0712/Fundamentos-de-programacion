Algoritmo AhorroAnual
	
    Definir mes Como Entero
    Definir deposito, ahorro Como Real
	
    ahorro <- 0
	
    Para mes <- 1 Hasta 12 Con Paso 1 Hacer
		
        Escribir "Ingresa la cantidad depositada en el mes ", mes, ":"
        Leer deposito
		
        ahorro <- ahorro + deposito
		
        Escribir "Ahorro acumulado hasta el mes ", mes, ": $", ahorro
		
    FinPara
	
    Escribir "El ahorro total al finalizar el año es: $", ahorro
	
FinAlgoritmo