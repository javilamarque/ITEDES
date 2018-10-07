#!/bin/bash/

declare num1=""
declare num2=""

read -p "Ingrese un numero para la division" num1
read -p "Ingrese otro numero para la division" num2

result=$[num1 / num2]

echo "El resultado de la division es: $result"

exit 0

