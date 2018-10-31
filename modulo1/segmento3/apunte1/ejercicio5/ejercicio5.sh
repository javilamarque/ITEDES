#!/bin/bash/

declare -i age=0
read -p "Ingrese su edad: " age

declare  genero=""
read -p "Ingrese su genero: " genero

if ((age >= 18))
then
	echo "Su genero es:  $genero Usted es mayor de edad "

else
	echo "Su genero es: $genero Usted no es mayor de edad "
fi
exit


