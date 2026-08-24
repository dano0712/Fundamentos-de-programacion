Algoritmo PrecioUva
	
    Definir precioInicial, kilos, precioFinal, ganancia Como Real
    Definir tipo Como Caracter
    Definir tamano Como Entero
	
    Escribir "Ingresa el precio inicial por kilo:"
    Leer precioInicial
	
    Escribir "Ingresa la cantidad de kilos:"
    Leer kilos
	
    Escribir "Ingresa el tipo de uva (A o B):"
    Leer tipo
	
    Escribir "Ingresa el tamaño de la uva (1 o 2):"
    Leer tamano
	
    Si tipo = "A" Entonces
        Si tamano = 1 Entonces
            precioFinal <- precioInicial + 0.20
        SiNo
            precioFinal <- precioInicial + 0.30
        FinSi
    SiNo
        Si tamano = 1 Entonces
            precioFinal <- precioInicial - 0.30
        SiNo
            precioFinal <- precioInicial - 0.50
        FinSi
    FinSi
	
    ganancia <- precioFinal * kilos
	
    Escribir "El productor recibirá: $", ganancia
	
FinAlgoritmo	
