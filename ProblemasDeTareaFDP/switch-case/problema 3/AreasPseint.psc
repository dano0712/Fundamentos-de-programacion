Algoritmo CalculoDeAreas
	
	Definir opcion Como Entero
	Definir lado, base, altura, largo, ancho, radio, area Como Real
	
	Escribir "===== MENÚ DE ÁREAS ====="
	Escribir "1. Área del cuadrado"
	Escribir "2. Área del rectángulo"
	Escribir "3. Área del triángulo"
	Escribir "4. Área del círculo"
	Escribir "Elige una opción:"
	Leer opcion
	
	Segun opcion Hacer
		
		1:
			Escribir "Ingresa el lado del cuadrado:"
			Leer lado
			area <- lado * lado
			Escribir "El área del cuadrado es: ", area
			
		2:
			Escribir "Ingresa el largo del rectángulo:"
			Leer largo
			Escribir "Ingresa el ancho del rectángulo:"
			Leer ancho
			area <- largo * ancho
			Escribir "El área del rectángulo es: ", area
			
		3:
			Escribir "Ingresa la base del triángulo:"
			Leer base
			Escribir "Ingresa la altura del triángulo:"
			Leer altura
			area <- (base * altura) / 2
			Escribir "El área del triángulo es: ", area
			
		4:
			Escribir "Ingresa el radio del círculo:"
			Leer radio
			area <- PI * radio * radio
			Escribir "El área del círculo es: ", area
			
		De Otro Modo:
			Escribir "Error: opción no válida."
			
	FinSegun
	
FinAlgoritmo