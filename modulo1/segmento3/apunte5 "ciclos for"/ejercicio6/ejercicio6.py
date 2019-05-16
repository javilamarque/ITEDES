linea=""

reversa = int(input("Ingrese el numero maximo de X: "))

for i in range(reversa):

	linea = linea + "x"
	print(linea)

for i in reversed(range(reversa -1)):
	linea=""
	for j in range(i):
		linea = linea + "x"

		print(linea)
