num=1
maximo=0
while num != 0:
	num = int(input("Ingrese varios numeros para saber cual es el mayor. Ingrese 0 para detener: ")) 
	if num >= maximo:
		maximo=num

print("El numero mas grande ingresado es: ", maximo)

