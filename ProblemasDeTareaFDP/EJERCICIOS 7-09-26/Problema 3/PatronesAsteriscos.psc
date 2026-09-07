Algoritmo PatronesAsteriscos
	
	Definir n, i, j, cantidad Como Entero
	
	Escribir "Ingresa el número de líneas:"
	Leer n
	
	// Primera figura
	Para i <- 1 Hasta n Hacer
		
		Para j <- 1 Hasta n Hacer
			Escribir Sin Saltar "* "
		FinPara
		
		Escribir ""
	FinPara
	
	Escribir ""
	
	// Segunda figura
	Para i <- 1 Hasta n Hacer
		
		cantidad <- 2 * (n - i) + 1
		
		Para j <- 1 Hasta cantidad Hacer
			Escribir Sin Saltar "*"
		FinPara
		
		Escribir ""
	FinPara
	
	Escribir ""
	
	// Tercera figura
	Para i <- 1 Hasta n Hacer
		
		cantidad <- 2 * i - 1
		
		Para j <- 1 Hasta cantidad Hacer
			Escribir Sin Saltar "*"
		FinPara
		
		Escribir ""
	FinPara
	
FinAlgoritmo