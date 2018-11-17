#!/bin/bash/

function dividir(){
	declare -i cantDividir=0
	for ((i=1; i<=$1; i++)){
		if (( $1%i==0 )) 
		then 
			cantDividir+=1
		fi
	}
	echo $cantDividir
}

declare -i number=0
declare -i cant=0

read -p "Ingrese un numero para saber por cuantos numero es divisible: " number
cant=$(dividir $number)

echo "La cantidad de veces que se puede dividir el numero ingresado es: " ${cant}

exit 0
