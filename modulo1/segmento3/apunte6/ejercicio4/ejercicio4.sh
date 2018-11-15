#!/bin/bash/

declare -i num=1
declare -i total=0

while [[ $num != 0 ]]; do
	read -p "Ingrese un numero, si ingresa 0 se detiene el proceso: " num
	total+=$num
	echo "$total"
done
exit 0
