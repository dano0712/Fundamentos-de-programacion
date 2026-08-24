Algoritmo Banquete
	
    Definir personas Como Entero
    Definir costoPersona, presupuesto Como Real
	
    Escribir "Ingresa el número de personas:"
    Leer personas
	
    Si personas <= 200 Entonces
		
        costoPersona <- 95
		
    SiNo
		
        Si personas <= 300 Entonces
			
            costoPersona <- 85
			
        SiNo
			
            costoPersona <- 75
			
        FinSi
		
    FinSi
	
    presupuesto <- personas * costoPersona
	
    Escribir "Costo por persona: $", costoPersona
    Escribir "Presupuesto total: $", presupuesto
	
FinAlgoritmo