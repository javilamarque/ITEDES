name = input("Ingrese su nombre de usuario: ")

password = int(input("Ingrese su contraseña: "))

if name == "juan" and password == 1234:
	print("Hola  Juan")
elif name == "pedro" and password == 5678:
	print("Hola Pedro")
else:
	print("Usted no es Pedro y tampoco es Juan")
