def  generarBaseDatos ():
	seguir="si"
	listas=[]

	while seguir=="si":
		lista=input("Ingrese las palabras para jugar: ")
		listas.append(lista)

		seguir=input("Desea agregar otra palabra(si/no)")
	return listas

def sortear(lista):
	from random import randrange
	random = randrange(len(lista))
	return listaJuego[random]

#main "PUERTA DE INGRESO"
print("*************AQUI COMIENZA********")
print("***********EL GRAN JUEGO DEL******")
print("**************AHORCADO************")
listaJuego=generarBaseDatos()

palabra=sortear(listaJuego)
#AQUI SE CONVIERTE LAS PALABRAS EN LISTA
Palabra=list(palabra)
#AQUI SE INICIALIZAN LAS VARIABLES
vidas=6
faltan=len(Palabra)
PalabraMostrar=[]

#AQUI SE CREAN LAS LISTA VACIA
for i in range(len(Palabra)):
		PalabraMostrar.append('*')

while vidas>0 and faltan>0:
		print(PalabraMostrar) #AQUI SE MUESTRAN LAS LISTAS VACIAS
		letra=input("Ingrese una letra: ")

		if letra in Palabra:
				faltan=faltan - Palabra.count(letra) # AQUI SE RESTAN LAS VECES QUE APARECEN LAS LETRAS
				print("Letras Restantes:",faltan)

				for i in range(len(Palabra)):
						if Palabra[i] == letra:
								PalabraMostrar[i] = letra
		else:
				vidas= vidas-1
				print("Vidas: " , vidas)
if faltan==0:
		print("FELICITACIONES GANASTE EL GRAN JUEGO DEL AHORCADO!!!!!!")
		print("La palabra es :", palabra)
elif vidas==0:
		print("Perdiste, podes intentarlo nuevamente, no te desanimes!!!")


