#!/bin/bash/

declare -i base
declare -i altura

read -p "Ingrese la base: " base
read -p "Ingrese la altura: " altura

for(( i=0; i<$altura;i++ )){
	linea=""
	for(( j=0; j<$base;j++ )){
		linea+="x"
	}
		echo "$linea"
}

