lista1 = []
lista2 = []

for i in range(5):
    numero = int(input("Ingrese 5 numeros para multiplicar por 2: "))
    lista1.append(numero)
print(lista1)

for i in range(len(lista1)):
    lista2.append(lista1[i]*2)
print("Los numeros ingresado multiplicado por 2, dan como resultado: ", lista2)
