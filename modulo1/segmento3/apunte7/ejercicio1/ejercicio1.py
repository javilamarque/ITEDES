def divisor(numero):
	cant=0
	for i in range(1,numero+1):
		if numero%i==0:
			cant+=1
	return cant

numero=int(input("Ingrese una cantidad: "))
total=divisor(numero)

print(total)
