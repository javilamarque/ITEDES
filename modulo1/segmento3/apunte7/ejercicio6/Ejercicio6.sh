#!/bin/bash/

function sumar(){
    declare -i total
    declare -i num1=$1
    declare -i num2=$2
    total=$1+$2
    echo $total
}
function restar(){
    declare -i total
    declare -i num1=$1
    declare -i num2=$2
    total=$1-$2
    echo $total
}
function dividir(){
    declare -i total
    declare -i num1=$1
    declare -i num2=$2
    total=$1/$2
    echo $total
}
function multiplicar(){
    declare -i total
    declare -i num1=$1
    declare -i num2=$2
    total=$1*$2
    echo $total
}
function potencia(){
    declare -i powBase=$1
    declare -i powExponente=$2
    declare -i resultado=powBase
    for((i=1;i<powExponente;i++ )){
        resultado=$((resultado*powBase))
    }
    echo $resultado
}
#Main
declare -i num1
declare -i num2

while [[ $Menu != "0" ]];do
        
        echo "1- Sumar"
        echo "2- Restar"
        echo "3- Dividir"
        echo "4- Multiplciar"
        echo "5- Potenciar"
        echo "0- salir"
        read -p "Ingrese la opcion deseada " Menu

        case $Menu in
        1)
        clear
        read -p "Ingrese un numero para la suma: " num1
        read -p "Ingrese otro numero para la suma: " num2
        resultado=$(sumar $num1 $num2)
        echo "El resultado de la suma es: $resultado"
        ;;

        2)
            clear
            read -p "Ingrese un numero para la resta: " num1
            read -p "Ingrese otro numero para la resta: " num2
            resultado=$(restar $num1 $num2)
            echo "El resultado de la resta  es: $resultado"
            ;;

         3)
            clear
            read -p "Ingrese un numero para la division: " num1
            read -p "Ingrese otro numero para la division: " num2
            resultado=$(dividir $num1 $num2)
            echo "El resultado de la suma es: $resultado"
            ;;

        4)
            clear
            read -p "Ingrese un numero para la multiplicacion: " num1
            read -p "Ingrese otro numero para la multiplicacion: " num2
            resultado=$(multiplicar $num1 $num2)
            echo "El resultado de la multiplicacion es: $resultado"
            ;;

        5)
            clear
            read -p "Ingrese la base para la potencia: " num1
            read -p "Ingrese el exponente para la potencia: " num2
            resultado=$(potencia $num1 $num2)
            echo "El resultado de la suma es: $resultado"
            ;;

        0)
            clear
            ;;
        esac
    done

exit 0
