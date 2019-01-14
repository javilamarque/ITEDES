from random import randrange
tamanio = 10
espacio = 100
vector = []

for i in range(tamanio):
    vector.append(randrange(10))

print()

for i in range(tamanio -1):
    for j in range(i +1, tamanio):
        if vector[i] > vector[j]:
            aux = vector[j]
            vector[j] = vector[i]
            vector[i] = aux

for i in range(tamanio):
    print(vector[i])

#Burbujeo de carga de vector de 100 posiciones
print()
for i in range(espacio):
    vector.append(randrange(100))

for i in range(espacio -1):
    for j in range(i + 1, espacio):
        if vector[i] > vector[j]:
            aux = vector[j]
            vector[j] = vector[i]
            vector[i] = aux

for i in range(espacio):
    print(vector[i])

print()

#Burbijeo de vector con 1000 posiciones

lugar = 1000
for i in range(lugar):
    vector.append(randrange(1000))

for i in range(lugar -1):
    for j in range(i + 1, lugar):
        if vector[i] > vector[j]:
            aux = vector[j]
            vector[j] = vector[i]
            vector[i] = aux

for i in range(lugar):
    print (vector[i])


