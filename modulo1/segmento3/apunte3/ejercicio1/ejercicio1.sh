#!/bin/bash

read -p "Ingrese un numero: " num1
read -p "Ingrese otro numero: " num2
read -p "Ingrese otro numero: " num3


if [[ "$num1" -ge "$num2" && "$num2" -ge "$num3" ]]
then
	echo "Numeros Ordenados de mayor a menor: " $num1,$num2,$num3
elif [[ "$num2" -ge "$num3" && "$num3" -ge "$num1" ]]
then
    echo "Numeros Ordenados de mayor a menor: " $num2,$num3,$num1
elif [[ "$num3" -ge "$num1" && "$num1" -ge "$num2" ]]
then
	echo "Numeros Ordenados de mayor a menor: " $num3,$num1,$num2
elif [[ "$num1" -ge "$num3" && "$num3" -ge "$num2" ]]
then
    echo "Numeros Ordenados de mayor a menor: " $num1,$num3,$num2
elif [[ "$num2" -ge "$num1" && "$num1" -ge "$num3" ]]
then
    echo "Numeros Ordenados de mayor a menor: " $num2,$num1,$num3
else
    echo "Numeros Ordenados de mayor a menor: " $num3,$num2,$num1

fi

