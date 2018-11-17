#!/bin/bash/

declare -i num
declare -i maximo=0
while [[ $num != 0 ]]; do
	read -p "Ingrese numero para determinar cual es el mas grande, ingrese 0 para detener: " num
	if [[ $num > $maximo ]]
	then
		maximo=$num

		echo $maximo
	fi
done

echo "El numero mas grande ingresado es: "  $maximo
exit 0
