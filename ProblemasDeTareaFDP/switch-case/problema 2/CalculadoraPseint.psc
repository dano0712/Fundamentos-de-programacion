Algoritmo OperacionesBasicas
	
	Definir num1, num2 Como Entero
	Definir operacion Como Caracter
	Definir resultado Como Real
	
	Escribir "Ingresa el primer número:"
	Leer num1
	
	Escribir "Ingresa el segundo número:"
	Leer num2
	
	Escribir "Ingresa la operación (+, -, *, /):"
	Leer operacion
	
	Segun operacion Hacer
		
		"+":
			resultado <- num1 + num2
			Escribir "El resultado de la suma es: ", resultado
			
		"-":
			resultado <- num1 - num2
			Escribir "El resultado de la resta es: ", resultado
			
		"*":
			resultado <- num1 * num2
			Escribir "El resultado de la multiplicación es: ", resultado
			
		"/":
			Si num2 <> 0 Entonces
				resultado <- num1 / num2
				Escribir "El resultado de la división es: ", resultado
			SiNo
				Escribir "Error: división por cero."
			FinSi
			
		De Otro Modo:
			Escribir "Error: operación no válida."
			
	FinSegun
	
FinAlgoritmo