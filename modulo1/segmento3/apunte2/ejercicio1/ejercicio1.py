numero = int(input("Ingrese un numero entero para ver si es multiplo de 2: "))
resto = numero % 2

if resto != 0:
	print (str(numero) + " No es multiplo de 2 ")

else: 
	print (str(numero) + " es multiplo de 2 ")
