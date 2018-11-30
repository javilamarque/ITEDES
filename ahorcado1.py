import json
def  generarBaseDatos ():
	seguir="si"
	listas=[]

	while seguir=="si":
		lista=input("Ingrese las palabras para jugar: ")
		listas.append(lista)

		seguir=input("Desea agregar otra palabra(si/no): ")

	
	with open('lista.json', 'r')as filein:
		lista=json.load(filein)

	
	with open('lista.json', 'w')as fileout:
		json.dump(listas, fileout)
	
	return listas


def buscar(lista):
	from random import randrange
	random = randrange(len(lista))
	return listaDelJuego[random]

#main "PUERTA DE INGRESO"
print("*************AQUI COMIENZA********")
print("***********EL GRAN JUEGO DEL******")
print("**************AHORCADO************")
print("*************COMENZEMOS***********")
listaDelJuego=generarBaseDatos()
palabra=buscar(listaDelJuego)

#AQUI SE CONVIERTE LAS PALABRAS EN LISTA
Palabra=list(palabra)

#AQUI SE INICIALIZAN LAS VARIABLES
vidas=6
faltan=len(Palabra)
MostrarPalabra=[]

#AQUI SE CREAN LAS LISTA VACIA
for i in range(len(Palabra)):
		MostrarPalabra.append('-')

while vidas>0 and faltan>0:
		print(MostrarPalabra) #AQUI ESTAN LAS LISTAS VACIAS
		letra=input("Ingrese una letra: ")

		if letra in Palabra:
				faltan=faltan - Palabra.count(letra) # AQUI SE RESTAN LAS LETRAS
				print("Letras Restantes:",faltan)

				for i in range(len(Palabra)):
						if Palabra[i] == letra:
								MostrarPalabra[i] = letra
		else:
				vidas= vidas-1
				print("Vidas: " , vidas)
if faltan==0:
		print("FELICITACIONES GANASTE EL GRAN JUEGO DEL AHORCADO!!!!!!")
		print("La palabra es :", palabra)
elif vidas==0:
		print("Perdiste, podes intentarlo nuevamente, no te desanimes!!!")


