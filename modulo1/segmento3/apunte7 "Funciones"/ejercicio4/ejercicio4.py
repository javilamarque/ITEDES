def tf(num1):

	if num1%2 == 0:
		respuesta = True
	else:
		respuesta = False
	
	return respuesta

num1 = int(input("Ingrese un numero: "))

respuesta= tf(num1)

if respuesta:
	print("Verdadero")

else:
	print("Falso")

