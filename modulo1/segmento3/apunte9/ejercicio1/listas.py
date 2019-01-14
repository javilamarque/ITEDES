def crearPersonas(personas):
	comidas=[]
	persona = {}
	seguir="si"

	persona['nombre'] = input('Ingrese su nombre: ')
	persona['apellido'] = input('Ingrese su apellido: ')
	persona['dni'] = input('Ingrese su numero de dni: ')
	persona['direccion'] = input('Ingrese su direccion: ')
	persona['telefono'] = input('Ingrese su numero telefonico: ')
	persona['mail'] = input('Ingrese su mail: ')
	persona['nacimiento'] = input('Ingrese su fecha de nacimiento: ')
	while seguir=="si":
		persona['comida']= agregarComida(comidas)
		seguir=input("Desea agregar otra comida (si/no) ")
	
	personas.append(persona)

	return personas


def agregarComida(comidas):
	comida=input("Ingrese su comida favorita: ")
	comidas.append(comida)
	
	return comidas


def mostrarPersonas(personas):
	for p in personas:
		for key, value in p.items():
			print(key + ': ' + str(value))


def limpiar():
	os.system('clear')

#Main 
import os 
personas=[]
opcionMenu=''

while opcionMenu !="0":

	print('1) Cargar persona')
	print('2) Mostrar persona')
	print('0) Salir')
	print()
	opcionMenu = input('Opcion? ')
	
	opcion='si'

	
	if opcionMenu == "1":
		while opcion=='si':
			personas = crearPersonas(personas)
			limpiar()
			opcion=input("Desea agregar otra persona: ")
	
	
	elif opcionMenu == "2":
		
		if not personas:
			limpiar()
			print("Debe cargar a otra persona")
			input(".....pulsa una tecla para volver al menu principal")
			limpiar()


		else:
			limpiar()
			mostrarPersonas(personas)
			input(".......Pulsa una tecla para volver al menu principal")
			limpiar()
