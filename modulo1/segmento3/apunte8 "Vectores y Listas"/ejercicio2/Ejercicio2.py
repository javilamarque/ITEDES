vector = []
for i in range(1,100,2):
    vector.append(i)

for i in range(len(vector)):
    for k in range(i, len(vector)):
        if vector[i] > vector[k]:
            aux = vector[k]
            vector[k] = vector[i]
            vector[i] = aux
print(vector)

