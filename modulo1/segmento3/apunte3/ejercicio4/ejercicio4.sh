#!/bin/bash/
read -p "Ingrese un numero romano: " number

declare respuesta=""

if ["$number" == "I"]
then
	echo"1"

elif ["$number" == "V"]
then
	respuesta="5"

elif ["$number" == "X"]
then
	respuesta="10"

elif ["$number" == "L"]
then
	respuesta="50"

elif ["$number" == "C"]
then
	respuesta="100"

else
	respuesta"Numero romano no valido"

fi 

exit 0

