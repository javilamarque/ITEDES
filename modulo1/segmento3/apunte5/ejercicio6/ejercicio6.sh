#!/bin/bash/

read -p "Ingrese el maximo de x para iniciar: " max
for (( i=0; i<$max;i++)){
	linea+="x"
	echo "$linea"
}

for(( i=$max-1;i>0;i-- )){
	linea=""
	for(( j=0;j<$i;j++ )){
		linea+="x"
	}
		echo "$linea"
}

