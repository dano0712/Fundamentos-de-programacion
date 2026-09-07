Algoritmo EntradasCine
	
	Definir personas, dia Como Entero
	Definir membresia Como Caracter
	Definir precio, total Como Real
	
	Escribir "Ingresa el número de personas:"
	Leer personas
	
	Escribir "Ingresa el día de la semana:"
	Escribir "1. Lunes"
	Escribir "2. Martes"
	Escribir "3. Miércoles"
	Escribir "4. Jueves"
	Escribir "5. Viernes"
	Escribir "6. Sábado"
	Escribir "7. Domingo"
	Leer dia
	
	Escribir "¿Cuentas con membresía? (S/N):"
	Leer membresia
	
	Segun dia Hacer
		
		1:
			precio <- personas * 50
			
		2:
			precio <- personas * 50
			
		3:
			precio <- personas * 30
			
		4:
			Si personas = 1 Entonces
				precio <- 50
			SiNo
				Si personas = 2 Entonces
					precio <- 75
				SiNo
					Si personas = 3 Entonces
						precio <- 75 + 50
					SiNo
						Si personas = 4 Entonces
							precio <- 75 * 2
						SiNo
							Si personas = 5 Entonces
								precio <- 75 * 2 + 50
							SiNo
								Si personas = 6 Entonces
									precio <- 75 * 3
								SiNo
									precio <- personas * 50
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
			
		5:
			precio <- personas * 50
			
		6:
			precio <- personas * 50
			
		7:
			precio <- personas * 50
			
		De Otro Modo:
			Escribir "Día no válido."
			
	FinSegun
	
	Si dia >= 1 Y dia <= 7 Entonces
		
		Si membresia = "S" O membresia = "s" Entonces
			total <- precio * 0.90
		SiNo
			total <- precio
		FinSi
		
		Escribir "El precio total de las entradas es: $", total
		
	FinSi
	
FinAlgoritmo