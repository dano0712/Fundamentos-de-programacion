Algoritmo VelocidadMulta
	
    Definir velocidad Como Entero
    Definir cumple Como Logico
    Definir resultado Como Entero
	
    Escribir "Ingresa la velocidad:"
    Leer velocidad
	
    Escribir "¿Es tu cumpleaños? (Verdadero/Falso):"
    Leer cumple
	
    Si cumple = Verdadero Entonces
        velocidad <- velocidad - 5
    FinSi
	
    Si velocidad <= 60 Entonces
        resultado <- 0
    SiNo
        Si velocidad <= 80 Entonces
            resultado <- 1
        SiNo
            resultado <- 2
        FinSi
    FinSi
	
    Escribir "Resultado: ", resultado
	
    Si resultado = 0 Entonces
        Escribir "Sin multa"
    SiNo
        Si resultado = 1 Entonces
            Escribir "Multa pequeña"
        SiNo
            Escribir "Multa grande"
        FinSi
    FinSi
	
FinAlgoritmo