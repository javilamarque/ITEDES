def agregarAlumno(alumnos):
	alumno = {}

	alumno['dni'] = int(input('Ingrese dni: '))
	alumno['apellido'] = input('Ingrese apellido: ')
	alumno['nombre'] = input('Ingrese su nombre: ')
	alumno['direccion'] = input('Ingrese su direccion: ')
	alumno['telefono'] = int(input('Ingrese su numero de telefono: '))
	alumno['mail'] =input('Ingrese su mail: ')
	alumno['fecha de nacimiento'] = input('Ingrese fecha de nacimiento: ')
	alumnos.append(alumno)

	return alumnos


def listarAlumnos(alumnos):
	for alumno in alumnos:
		print('DNI: ' + str(alumno['dni']))
		print('Apellido: ' + alumno['apellido'])
		print('Nombre: ' + alumno['nombre'])
		print('Direccion: ' + alumno['direccion'])
		print('Telefono: ' + str(alumno['telefono']))
		print('Mail: ' + alumno['mail'])
		print('Fecha de nacimiento: ' + str(alumno['fecha de nacimiento']))
		print()		


def buscadorPorDNI(alumnos, dni):
	for alumno in alumnos:
		if alumno['dni'] == dni:
			print('DNI: ' + str(alumno['dni']))
			print('Apellido: ' + alumno['apellido'])
			print('Nombre: ' + alumno['nombre'])
			print('Direccion: ' + alumno['direccion'])
			print('Telefono: ' + alumno['telefono'])
			print('Mail: ' + alumno['mail'])
			print('Fecha de nacimiento: ' + str(alumno['fecha de nacimiento']))
		print()
	



def eliminarPorDNI(alumnos, dni):
	for alumno in alumnos:
		if alumno['dni'] == dni:
			alumnos.remove(alumno)
	
	return alumnos


def eliminarPorApellido(alumnos, dni):
	for alumno in alumnos:
		if alumno['apellido'] == apellido:
			alumnos.remove(alumno)
	return alumnos


#Main
alumnos = []

opcion = -1

while opcion != 0:
	print()
	print('1) Agregar alumnos')
	print('2) Listar alumnos')
	print('3) Buscar alumno por DNI')
	print('4) Eliminar alumno por DNI')
	print('5) Eliminar por apellido ')
	print('6) Ingresar direccion ')
	print('7) Ingresar numero de telefono ')
	print('8) Ingresar mail ')
	print('9) Ingresar fecha de nacimiento')
	print()
	print('0) Salir')
	print()
	print()

	opcion = int(input('opcion? '))
	
	print()

	if opcion == 1:
		alumnos = agregarAlumno(alumnos)
	elif opcion == 2:
		listarAlumnos(alumnos)
	elif opcion == 3:
		dni = int(input('DNI? '))
		buscadorPorDNI(alumnos, dni)
	elif opcion == 4:
		dni = int(input('DNI? '))
		alumnos = eliminarPorDNI(alumnos, dni)
	elif opcion == 5:
		apellido = input('apellido ')
		alumnos = eliminarPorApellido(alumnos, apellido)
	elif opcion == 0:
			print('Gracias por cargar los datos de los alumnos, nos vemos pronto!')
