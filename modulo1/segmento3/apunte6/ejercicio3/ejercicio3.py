base=0
altura=0
area=0

while base<=0 or altura<=0:
	base=int(input("Ingrese la base mayor a 0 : "))
	altura=int(input("Ingrese la altura mayor a 0 :"))

area=base*altura
print(area)
