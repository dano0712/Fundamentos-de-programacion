Algoritmo Becas
	
    Definir edad Como Entero
    Definir promedio Como Real
	
    Escribir "Ingresa la edad del estudiante:"
    Leer edad
	
    Escribir "Ingresa el promedio del estudiante:"
    Leer promedio
	
    Si edad > 18 Entonces
		
        Si promedio >= 9 Entonces
			
            Escribir "Beca asignada: $10000"
			
        SiNo
			
            Si promedio >= 7.5 Entonces
				
                Escribir "Beca asignada: $8000"
				
            SiNo
				
                Si promedio >= 6 Entonces
					
                    Escribir "Beca asignada: $5000"
					
                SiNo
					
                    Escribir "Se enviará una carta de invitación para estudiar más."
					
                FinSi
				
            FinSi
			
        FinSi
		
    SiNo
		
        Si promedio >= 9 Entonces
			
            Escribir "Beca asignada: $8000"
			
        SiNo
			
            Si promedio >= 8 Entonces
				
                Escribir "Beca asignada: $6000"
				
            SiNo
				
                Si promedio >= 6 Entonces
					
                    Escribir "Beca asignada: $4000"
					
                SiNo
					
                    Escribir "Se enviará una carta de invitación para estudiar más."
					
                FinSi
				
            FinSi
			
        FinSi
		
    FinSi
	
FinAlgoritmo