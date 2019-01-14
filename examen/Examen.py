def cargarAutomovil(automoviles):
    automovil = {}
    
    seguir = "si"
    patente = input("Ingrese patente del Auto: ")
    patenteDuplicada = verificarPatente(patente)
    while patenteDuplicada=="si":
        print("Esta patente ya existe ingrese nuevamente")
        patente = input("Ingrese patente del Auto: ")
        patenteDuplicada=verificarPatente(patente)
        
    automovil['patente'] = patente
    automovil['marca'] = input("Ingrese la marca del vehiculo: ")
    automovil['modelo'] = input("Ingrese el modelo: ")
    automovil['color'] = input("Ingrese el colore del vehiculo: ")
    
    automoviles.append(automovil)
    return automoviles

def verificarPatente(patenteAuto):
    for automovil in automoviles:
        if automovil['patente']==patenteAuto:
            return "si"
        return "no"

def mostrarVehiculo(automoviles):
    for p in automoviles:
        for key, value in p.items():
            print(key + ': ' + str(value))

def limpiar():
    os.system('clear')

def modificarAutoxPatente(autos,patenteAuto):
	i=0
	contador=0
	for auto in autos:
		if auto['patente']==patenteAuto:
			opcionMenuModificar=''
			while opcionMenuModificar !="0":
				print("1-Modificar Pantente")
				print("2-Modificar Marca")
				print("3-Modificar modelo")
				print("4-Modificar Color")
				print("0-Salir")
				print("")
				opcionMenuModificar=input("Ingrese la opcion deseada: ")
			
				if opcionMenuModificar== "1":
					patente = input("Ingrese patente del auto: ")
					patenteDuplicada = verificarPatente(patente)
					while patenteDuplicada=="si":
						print("Patente Existente ingrese nuevamente")
						patente = input("Ingrese patente del Auto: ")
						patenteDuplicada=verificarPatente(patente)
					autos[i]['patente'] = patente	

				elif opcionMenuModificar== "2":
					autos[i]['marca'] = input("Ingrese marca del auto: ")
				elif opcionMenuModificar=="3":	
					autos[i]['modelo'] = input("Ingrese modelo del auto: ")
				elif opcionMenuModificar=="4":	
					autos[i]['color'] = input("Ingrese color del auto: ")
				contador= contador +1
		i=i+1
	if contador == 0:
		print("No existe el auto")
        

def eliminarAuto(automoviles, patenteAuto):
	contador=0
	i=0
	for automovil in automoviles:
		if automovil['patente']==patenteAuto:
			del automoviles[i]
			contador= contador +1
		i=i+1
	if contador == 0:
		print("No existe el auto")


    #MAIN

import os
automoviles = []
opcionMenu = ''

while opcionMenu !="0":
    print('1) Alta de vehiculo')
    print('2) Mostrar de automovil')
    print('3) Baja de automovil')
    print('4) Modificar automovil')
    print('0) Salir')
    print()
    opcionMenu = input('Opcion? ')

    opcion='si'

    if opcionMenu == "1":
        while opcion !='no':
            automoviles = cargarAutomovil(automoviles)
            limpiar()
            opcion=input("Desea agregar otro vehiculo? (si/no): ")
           

    elif opcionMenu == "2":
        if not automoviles:
            limpiar()
            print("Debe cargar otro vehiculo")
            input("....Pulse una tecla para regresar al menu principal")
            limpiar()

        else:
            limpiar()
            mostrarVehiculo(automoviles)
            input(".....Pulse una tecla para volver al menu principal")
            limpiar()

    elif opcionMenu == "3":
        patenteAuto=input("Ingresela patente del auto a eliminar: ")
        eliminarAuto(automoviles,patenteAuto)

    elif opcionMenu == "4":
        patenteAuto=input("Ingresela patente del auto a modificar: ")
        modificarAutoxPatente(automoviles,patenteAuto)


        


        








    