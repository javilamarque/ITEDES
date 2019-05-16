#!/bin/bash/

read -p "Ingrese un numero superior a 100, para detener el proceso: " number

while [ $number -le 100 ]; do
	read -p "Ingrese un numero superior a 100, para detener el proceso: " number

done

exit 0
