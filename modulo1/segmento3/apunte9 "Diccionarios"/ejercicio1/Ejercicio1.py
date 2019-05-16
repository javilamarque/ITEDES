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
	personas.append(persona)

	return personas

def mostrarPersonas(personas):
	for p in personas:
		for key, value in p.items():
			print(key + ': ' + str(value))

def buscarPersonasPorDni(personas, dni):
	contador=0
	for persona in personas:
		if persona ['dni'] ==dni:
			print("Nombre: " + persona['nombre'])
			print("Apellido: " + persona['apellido'])
			print("DNI: " + persona['dni'])
			print("Direccion: " + persona['direccion'])
			print("Telefono: " + persona['telefono'])
			print("Mail: " + persona['mail'])
			print("Fecha de nacimiento: " + persona['nacimiento'])
	if contador==0:
		print("No existe el alumno")

def eliminarPersonasPorApellido(personas, apellido):
	contador=0
	i=0
	for persona in personas:
		if persona['apellido']==apellido:
			del personas[i]
			contador+= contador
			print("Alumno eliminado")
		i+=i
	if contador==0:
		print("Ese apellido no existe")

def eliminarPersonasPorDni(personas, dni):
	contador=0
	i=0
	for persona in personas:
		if persona['dni']==dni:
			del personas[i]
			contador+=contador
			print("Alumno eliminado")
		i+=i
	if contador==0:
		print("Ese DNI no exixte")

def buscarPersonasPorApellido(personas, apellido):
	contador=0
	for persona in personas:
		if persona['apellido']==apellido:
			print("Nombre: " + persona['nombre'])
			print("Apellido: " + persona['apellido'])
			print("DNI: " + persona['dni'])
			print("Direccion: " + persona['direccion'])
			print("Telefono: " + persona['telefono'])
			print("MAil: " + persona['mail'])
			print("Fecha de nacimiento: " + persona['nacimiento'])
		if contador==0:
			print("El apellido no existe")

def escribirArchivo(listaPersonas):
	with open('listaPersonas.py', 'w') as filePersonas:
		filePersonas.writelines("%s\n" % lista for lista in listaPersonas)		


def limpiar():
	os.system('clear')

#Main 
import os 
personas=[]
opcionMenu=''

while opcionMenu !="0":

	print("1) Cargar personas")
	print("2) Mostrar persona")
	print("3) Buscar personas por DNI")
	print("4) Buscar personas por Apellido")
	print("5) Eliminar personas por DNI")
	print("6) Eliminar personas por Apellido")
	print('0) Salir')
	print()
	opcionMenu = input("Ingrese la opcion que desea: ")
	
	opcion='si'

	
	if opcionMenu == "1":
		while opcion!='no':
			personas = crearPersonas(personas)
			limpiar()
			opcion=input("Desea agregar otra persona? (si/no): ")
		escribirArchivo(personas)
	
	elif opcionMenu == "2":
		
		if not personas:
			limpiar()
			print("Debe cargar al menos una persona")
			input(".....pulsa una tecla para volver al menu principal")
			limpiar()


		else:
			limpiar()
			mostrarPersonas(personas)
			input(".......Pulsa una tecla para volver al menu principal")
			limpiar()

	elif opcionMenu == "3":
		limpiar()
		dni=input("Ingrese el dni de la persona que desea buscar: ")
		buscarPersonasPorDni(personas,dni)
		input("....Pulse una tecla para volver al menu principal")
		limpiar()
	
	elif opcionMenu == "4":
		limpiar()
		apellido=input("Ingrese el apellido de la persona que desea buscar: ")
		buscarPersonasPorApellido(personas,apellido)
		input("....Presione una tecla para volver al menu principal")
		limpiar()

	elif opcionMenu == "5":
		limpiar()
		dni=input("Ingrese el DNI de la persona que desea eliminar:")
		eliminarPersonasPorDni(personas,dni)
		input(".....Ingrese una tecla para volver al menu principal")
		limpiar()
	
	elif opcionMenu == "6":
		limpiar()
		apellido=input("Ingrese el apellido de la persona que desea eliminar")
		eliminarPersonasPorApellido(personas,apellido)
		input("....Presione una tecla para volver al menu principal")
		limpiar()

