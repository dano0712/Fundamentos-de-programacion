Algoritmo LlamadaTelefonica
	
    Definir minutos Como Entero
    Definir domingo, turno Como Caracter
    Definir costo, impuesto, total, porcentaje Como Real
	
    Escribir "Ingresa la duración de la llamada en minutos:"
    Leer minutos
	
    Escribir "¿Es domingo? (S/N):"
    Leer domingo
	
    Si domingo = "S" O domingo = "s" Entonces
		
        porcentaje <- 0.03
		
    SiNo
		
        Escribir "¿El turno es matutino o vespertino? (M/V):"
        Leer turno
		
        Si turno = "M" O turno = "m" Entonces
			
            porcentaje <- 0.15
			
        SiNo
			
            porcentaje <- 0.10
			
        FinSi
		
    FinSi
	
    Si minutos <= 5 Entonces
		
        costo <- minutos * 1
		
    SiNo
		
        Si minutos <= 8 Entonces
			
            costo <- (5 * 1) + ((minutos - 5) * 0.80)
			
        SiNo
			
            Si minutos <= 10 Entonces
				
                costo <- (5 * 1) + (3 * 0.80) + ((minutos - 8) * 0.70)
				
            SiNo
				
                costo <- (5 * 1) + (3 * 0.80) + (2 * 0.70) + ((minutos - 10) * 0.50)
				
            FinSi
			
        FinSi
		
    FinSi
	
    impuesto <- costo * porcentaje
    total <- costo + impuesto
	
    Escribir "Costo de la llamada: $", costo
    Escribir "Impuesto: $", impuesto
    Escribir "Total a pagar: $", total
	
FinAlgoritmo