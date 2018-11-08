base = int(input("Ingrese la base: "))
altura = int(input("Ingrese la altura: "))

for i in range(0,altura,1):
	linea = ""
	for j in range(0,base,1):
		linea+= "x"

	print(linea)
