caracter = input("Ingrese un caracter para saber si es una (vocal, consonante, numero): ")

if(caracter == "1" or "2" or "3" or "4" or "5" or "6" or "7" or "8" or "9"):
	print("Ud ingreso un numero")

elif(caracter == "a" or "e" or "i" or "o" or "u"):
	print("Ud ingreso un vocal")

elif(caracter == "b" or "c" or "d" or "f" or "g" or "h" or "j" or "k" or "l" or "m" or "n" or "p" or "q" or "r" or "s" or "t" or "v" or "w" or "x" or "y" or "z"):
	print("Ud selecciono una consonante")

else:
	print("Ud selecciono un simbolo")
