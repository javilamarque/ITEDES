#!/bin/bash/
declare -i numero=0
read -p "Ingrese un numero del 1 al 7 para ver el correspondiente dia:  " numero

if ((numero == 1))
then 
	echo "Lunes"

elif ((numero == 2))
then
	echo "Martes"

elif ((numero == 3))
then
	echo "Miercoles"

elif ((numero == 4))
then
	echo "Jueves"

elif ((numero == 5))
then
	echo "Viernes"

elif ((numero == 6))
then
	echo "Sabado"

elif ((numero == 7))
then
	echo "Domingo"

else 
	echo "Usted no selecciono un numero del 1 al 7"
fi
exit
