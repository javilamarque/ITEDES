def agregarAlumno(alumnos):
	alumno = {}

	alumno['dni'] = int(input('Ingrese dni: '))
	alumno['apellido'] = input('Ingrese apellido: ')
	alumno['nombre'] = input('Ingrese su nombre: ')

	alumnos.append(alumno)

	return alumnos


def listarAlumnos(alumnos):
	for alumno in alumnos:
		print('DNI: ' + str(alumno['dni']))
		print('Apellido: ' + alumno['apellido'])
		print('Nombre: ' + alumno['nombre'])
		print()


def buscadorPorDNI(alumnos, dni):
	for alumno in alumnos:
		if alumno['dni'] == dni:
			print('DNI: ' + str(alumno['dni']))
			print('Apellido: ' + alumno['apellido'])
			print('nombre: ' + alumno['nombre'])
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
			print('Adios!')
