caracter = int(input("Ingrese un caracter para saber si es una (vocal, consonante, numero): "))

if(caracter == "a" or "e" or "i" or "o" or "u"):
	opcion = "vocal"

elif(caracter.isdigit()):
	opcion = "numero"

else:
	opcion = "consonante"

print(opcion)
