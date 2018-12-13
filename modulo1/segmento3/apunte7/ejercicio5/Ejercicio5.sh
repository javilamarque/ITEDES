#!/bin/bash

function elevarCubo() {
	declare -i base=$1
	declare -i resultado=$base

	for((i = 1; i < 3; i++))
	do
		resultado=$((resultado * base))
	done

	echo $resultado
}

declare -i base

read -p "ingrese base: " base

declare -i resultado=$( elevarCubo $base )

echo "El resultado es: $resultado"


exit 0
