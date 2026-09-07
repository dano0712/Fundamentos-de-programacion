Algoritmo PresupuestoTarta
	
	Definir sabor, chocolate, nombre Como Caracter
	Definir snacks Como Entero
	Definir precio, total Como Real
	
	Escribir "===== PASTELERÍA ====="
	Escribir "Elige el sabor de la tarta:"
	Escribir "1. Manzana"
	Escribir "2. Fresa"
	Escribir "3. Chocolate"
	Leer sabor
	
	Segun sabor Hacer
		
		"1":
			precio <- 200
			
		"2":
			precio <- 250
			
		"3":
			Escribir "Elige el tipo de chocolate:"
			Escribir "1. Chocolate negro"
			Escribir "2. Chocolate blanco"
			Leer chocolate
			
			Segun chocolate Hacer
				"1":
					precio <- 280
					
				"2":
					precio <- 300
					
				De Otro Modo:
					Escribir "Tipo de chocolate no válido."
					precio <- 0
			FinSegun
			
		De Otro Modo:
			Escribir "Sabor no válido."
			precio <- 0
			
	FinSegun
	
	Si precio > 0 Entonces
		
		Escribir "¿Cuántos snacks deseas agregar?"
		Leer snacks
		
		Escribir "¿Deseas personalizar la tarta con un nombre? (S/N)"
		Leer nombre
		
		total <- precio + (snacks * 25)
		
		Si nombre = "S" O nombre = "s" Entonces
			total <- total + 30
		FinSi
		
		Escribir "El precio total de la tarta es: $", total
		
	FinSi
	
FinAlgoritmo