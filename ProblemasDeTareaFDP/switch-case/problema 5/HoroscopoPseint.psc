Algoritmo Horoscopo
	
	Definir dia, mes Como Entero
	
	Escribir "Ingresa el dia de nacimiento: "
	Leer dia
	
	Escribir "Ingresa el mes de nacimiento (1-12): "
	Leer mes
	
	Segun mes Hacer
		
		1:
			Si dia >= 1 Y dia <= 19 Entonces
				Escribir "Capricornio"
			SiNo
				Si dia >= 20 Y dia <= 31 Entonces
					Escribir "Acuario"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		2:
			Si dia >= 1 Y dia <= 18 Entonces
				Escribir "Acuario"
			SiNo
				Si dia >= 19 Y dia <= 29 Entonces
					Escribir "Piscis"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		3:
			Si dia >= 1 Y dia <= 20 Entonces
				Escribir "Piscis"
			SiNo
				Si dia >= 21 Y dia <= 31 Entonces
					Escribir "Aries"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		4:
			Si dia >= 1 Y dia <= 19 Entonces
				Escribir "Aries"
			SiNo
				Si dia >= 20 Y dia <= 30 Entonces
					Escribir "Tauro"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		5:
			Si dia >= 1 Y dia <= 20 Entonces
				Escribir "Tauro"
			SiNo
				Si dia >= 21 Y dia <= 31 Entonces
					Escribir "Geminis"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		6:
			Si dia >= 1 Y dia <= 20 Entonces
				Escribir "Geminis"
			SiNo
				Si dia >= 21 Y dia <= 30 Entonces
					Escribir "Cancer"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		7:
			Si dia >= 1 Y dia <= 22 Entonces
				Escribir "Cancer"
			SiNo
				Si dia >= 23 Y dia <= 31 Entonces
					Escribir "Leo"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		8:
			Si dia >= 1 Y dia <= 22 Entonces
				Escribir "Leo"
			SiNo
				Si dia >= 23 Y dia <= 31 Entonces
					Escribir "Virgo"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		9:
			Si dia >= 1 Y dia <= 22 Entonces
				Escribir "Virgo"
			SiNo
				Si dia >= 23 Y dia <= 30 Entonces
					Escribir "Libra"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		10:
			Si dia >= 1 Y dia <= 22 Entonces
				Escribir "Libra"
			SiNo
				Si dia >= 23 Y dia <= 31 Entonces
					Escribir "Escorpio"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		11:
			Si dia >= 1 Y dia <= 21 Entonces
				Escribir "Escorpio"
			SiNo
				Si dia >= 22 Y dia <= 30 Entonces
					Escribir "Sagitario"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		12:
			Si dia >= 1 Y dia <= 21 Entonces
				Escribir "Sagitario"
			SiNo
				Si dia >= 22 Y dia <= 31 Entonces
					Escribir "Capricornio"
				SiNo
					Escribir "Dia no valido."
				FinSi
			FinSi
			
		De Otro Modo:
			Escribir "Mes no valido."
			
	FinSegun
	
FinAlgoritmo