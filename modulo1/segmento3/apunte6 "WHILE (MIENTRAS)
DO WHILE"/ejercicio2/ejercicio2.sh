#!/bin/bash/

while [ seguir=="si" ]; do
	read -i "Ingrese un numero para iniciar la suma: " num1
	read -i "Ingrese otro numero para la suma: " num2

	resultado=num1+num2
	echo $resultado
	read -p "S/N Desea continuar: " seguir

done

exit 0
