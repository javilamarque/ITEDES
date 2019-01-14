from random import randrange
tamanio=5
vector = []

for i in range(tamanio):
    vector.append(input("Ingrese un numero para ordenarlo de menor a mayor: "))

print()


for i in range(tamanio - 1):
    for j in range(i + 1, tamanio):
        if vector[i] > vector[j]:
            auxiliary = vector[j]
            vector[j] = vector[i]
            vector[i] = auxiliary
print("Los numeros ordenados quedan asi:")
for i in range(tamanio):
    print(vector[i])