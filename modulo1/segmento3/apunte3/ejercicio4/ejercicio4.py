letra = input("Ingrese un numero romano: ");

if (letra == "I"):
	numero = 1

elif (letra == "V"):
	numero = 5

elif (letra == "X"):
	numero = 10

elif (letra == "M"):
	numero = 50

elif (letra == "C"):
	numero = 100

elif (letra == "M"):
	numero = 1000

else:
	numero("Numero romano no valido")

print("El numero romano ingresado es: " + str(numero))
