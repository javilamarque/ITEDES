#!/bin/bash/

declare num1=""
declare num2=""

read -p "ingrese el primer numero para la multiplicacion" num1
read -p "ingrese el segundo numero para la multiplicacion" num2

result=$[num1 * num2]

echo "el resultado es: $result" 

exit 0

