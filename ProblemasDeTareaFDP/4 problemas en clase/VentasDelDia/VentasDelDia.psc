Algoritmo VentasDelDia
	
    Definir N, i Como Entero
    Definir venta Como Real
	
    Definir cantidadMayor1000, cantidadMayor500, cantidadMenor500 Como Entero
    Definir montoMayor1000, montoMayor500, montoMenor500 Como Real
    Definir montoTotal Como Real
	
    cantidadMayor1000 <- 0
    cantidadMayor500 <- 0
    cantidadMenor500 <- 0
	
    montoMayor1000 <- 0
    montoMayor500 <- 0
    montoMenor500 <- 0
	
    montoTotal <- 0
	
    Escribir "Ingresa el número de ventas realizadas:"
    Leer N
	
    Para i <- 1 Hasta N Con Paso 1 Hacer
		
        Escribir "Ingresa el monto de la venta ", i, ":"
        Leer venta
		
        Si venta > 1000 Entonces
			
            cantidadMayor1000 <- cantidadMayor1000 + 1
            montoMayor1000 <- montoMayor1000 + venta
			
        SiNo
			
            Si venta > 500 Entonces
				
                cantidadMayor500 <- cantidadMayor500 + 1
                montoMayor500 <- montoMayor500 + venta
				
            SiNo
				
                cantidadMenor500 <- cantidadMenor500 + 1
                montoMenor500 <- montoMenor500 + venta
				
            FinSi
			
        FinSi
		
        montoTotal <- montoTotal + venta
		
    FinPara
	
    Escribir ""
    Escribir "===== RESULTADOS DE LAS VENTAS ====="
	
    Escribir "Cantidad de ventas mayores a $1000: ", cantidadMayor1000
    Escribir "Monto total de las ventas mayores a $1000: $", montoMayor1000
	
    Escribir ""
	
    Escribir "Cantidad de ventas mayores a $500 y menores o iguales a $1000: ", cantidadMayor500
    Escribir "Monto total de las ventas mayores a $500 y menores o iguales a $1000: $", montoMayor500
	
    Escribir ""
	
    Escribir "Cantidad de ventas menores o iguales a $500: ", cantidadMenor500
    Escribir "Monto total de las ventas menores o iguales a $500: $", montoMenor500
	
    Escribir ""
	
    Escribir "Monto total de todas las ventas del día: $", montoTotal
	
FinAlgoritmo