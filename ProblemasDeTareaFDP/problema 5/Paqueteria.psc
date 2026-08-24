Algoritmo Paqueteria
	
    Definir peso, zona Como Entero
    Definir costoGramo, total Como Real
	
    Escribir "Ingresa el peso del paquete en gramos:"
    Leer peso
	
    Escribir "Selecciona la zona de destino:"
    Escribir "1 - América del Norte"
    Escribir "2 - América Central"
    Escribir "3 - América del Sur"
    Escribir "4 - Europa"
    Escribir "5 - Asia"
    Leer zona
	
    Si peso > 5000 Entonces
		
        Escribir "El paquete no puede ser transportado."
        Escribir "Peso superior a 5 kg."
		
    SiNo
		
        Si zona = 1 Entonces
            costoGramo <- 11
            Escribir "Zona: América del Norte"
			
        SiNo
            Si zona = 2 Entonces
                costoGramo <- 10
                Escribir "Zona: América Central"
				
            SiNo
                Si zona = 3 Entonces
                    costoGramo <- 12
                    Escribir "Zona: América del Sur"
					
                SiNo
                    Si zona = 4 Entonces
                        costoGramo <- 25
                        Escribir "Zona: Europa"
						
                    SiNo
                        Si zona = 5 Entonces
                            costoGramo <- 30
                            Escribir "Zona: Asia"
							
                        SiNo
                            costoGramo <- 0
                            Escribir "Zona no válida."
                        FinSi
                    FinSi
                FinSi
            FinSi
        FinSi
		
        Si costoGramo > 0 Entonces
			
            total <- peso * costoGramo
			
            Escribir "Costo por gramo: $", costoGramo
            Escribir "El costo de la entrega es: $", total
			
        FinSi
		
    FinSi
	
FinAlgoritmo