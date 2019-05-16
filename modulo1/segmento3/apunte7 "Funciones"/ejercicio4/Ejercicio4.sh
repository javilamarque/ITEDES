#!/bin/bash/

function tf(){
	if (( $1 % 2 ==0 ))
	then
		respuesta="1"
	else
		respuesta="0"
	fi
	echo $respuesta
}

declare -i number=0

read -p "Ingrese un numero: " number

respuesta=$(tf $number)

if (( $respuesta=="1"))
then
	echo "true"

else
	echo "false"

fi

exit 0
