#!/bin/bash/

declare -i base=0
declare -i altura=0
declare -i area=0

while [[ $base -le 0 || $altura -le 0 ]]; do
	read -p "Ingrese la base: " base
	read -p "Ingrese la altura: " altura

done
	
	area=$base*$altura
	echo "El area del rectangulo es: " $area

exit 0
