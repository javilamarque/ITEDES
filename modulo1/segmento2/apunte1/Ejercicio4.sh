#!/bin/bash/

declare num1=""
declare num2=""

read -p "ingrese un numero para la suma" num1
read -p "ingrese otro numero para la suma" num2

result=$[num1 + num2]
echo "la suma de los numeros es: $result"

exit 0
