function mayor(){
		if (( $1>=$2 ))
		then
				mayor=$1
		else
				mayor=$2
		fi


		if (( $3>=$mayor ))
		then
				mayor=$3
		else
				mayor=$mayor
		fi
		echo $mayor

}

declare -i number1=0
declare -i number2=0
declare -i number3=0

read -p "Ingrese un numero para saber cual es el mayor: " number1
read -p "Ingrese otro numero para continuar: " number2
read -p "Ingrese otro numero para finalizar: " number3

respuesta=$(mayor $number1 $number2 $number3)

echo ${respuesta}

exit 0
