#!/bin/bash/

declare num1=""
declare num2=""
declare result=$[ num1 - num2 ] 

read -p "ingrese un numero para la resta" num1
read -p "ingrese otro numero para la resta" num2

result=$[num1 - num2]

echo "el resultado es $result"

exit 0
