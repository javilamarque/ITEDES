import random
def impares(t):
    vector = [0] *t 
    for i in range(t):
        vector[i] = random.randrange(1, 1000, 2)
    return vector
print("Ingrese hasta donde desea que llegue el vector: ")
t=list(input())

aleatorio = impares(t)
print(aleatorio)


