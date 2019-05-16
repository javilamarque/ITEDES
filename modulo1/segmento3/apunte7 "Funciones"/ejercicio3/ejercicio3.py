def mayor(num1,num2,num3):
	
	if num1 >= num2:
		mayor= num1
	
	else:
		mayor=num2
	
	if num3>=mayor:
		mayor=num3
	
	else:
		mayor=mayor
	
	return mayor

num1=int(input("Ingrese un numero para que al finalizar se mostrara el numero mayor: "))
num2=int(input("Ingrese el segundo numero: "))
num3=int(input("Ingrese el tercer numero: "))

respuesta=mayor(num1,num2,num3)

print("El numero mayor es: "+ str(respuesta))


