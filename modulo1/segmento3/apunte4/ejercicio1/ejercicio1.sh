#!/bin/bash

declare dia=""
declare respuesta=""

read -p "Ingrese un dia (1-Lunes,2-Martes,3-Miercoles,4-Jueves,5-Viernes,6-Sabado,7-Domingo): " dia

case $dia in
	1)
		respuesta="Lunes"
		;;
	2)
		respuesta="Martes"
		;;
	3)
		respuesta="Miercoles"
		;;
	4)	
		respuesta="Jueves"
		;;
	5)
		respuesta="Viernes"
		;;
	6)
		respuesta="Sabado"
		;;
	7)
		respuesta="Domingo"
		;;
	*)
		respuesta="Dia no valido"
		;;

esac

echo $respuesta


exit 0
