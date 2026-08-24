Algoritmo Consultorio
	
    Definir numeroCita Como Entero
    Definir pagoCita, totalTratamiento Como Real
	
    Escribir "Ingresa el número de cita:"
    Leer numeroCita
	
    Si numeroCita <= 3 Entonces
        pagoCita <- 900
        totalTratamiento <- numeroCita * 900
		
    SiNo
        Si numeroCita <= 5 Entonces
            pagoCita <- 800
            totalTratamiento <- (3 * 900) + ((numeroCita - 3) * 800)
			
        SiNo
            Si numeroCita <= 8 Entonces
                pagoCita <- 600
                totalTratamiento <- (3 * 900) + (2 * 800) + ((numeroCita - 5) * 600)
				
            SiNo
                pagoCita <- 500
                totalTratamiento <- (3 * 900) + (2 * 800) + (3 * 600) + ((numeroCita - 8) * 500)
            FinSi
        FinSi
    FinSi
	
    Escribir "El paciente pagará por esta cita: $", pagoCita
    Escribir "El total pagado por el tratamiento es: $", totalTratamiento
	
FinAlgoritmo