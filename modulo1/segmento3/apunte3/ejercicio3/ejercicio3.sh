#!/bin/bash


read -p "Ingrese un caracter: " caracter 

if [[ "$caracter" == "a" || "$caracter"	== "b" || "$caracter" == "c" || "$caracter" == "o" || "$caracter" == "u" ]]
then
		opcion="vocal"
	
elif [[ "$caracter" == "1" || "$caracter" == "2" || "$caracter" == "3" || "$caracter" == "4" || "$caracter" == "5" || "$caracter" == "6" || "$caracter" == "7" || "$caracter" == "8" || "$caracter" == "9" || "$caracter" == "0"   ]]
then
		opcion="numero"

elif [[ "$caracter" == "b" || "$caracter" == "c" || "$caracter" == "d" || "$caracter" == "f" ||"$caracter" == "g" ||"$caracter" == "h" ||"$caracter" == "i" ||"$caracter" == "j" ||"$caracter" == "k" ||"$caracter" == "l" ||"$caracter" == "m" ||"$caracter" == "n" ||"$caracter" == "p" ||"$caracter" == "q" ||"$caracter" == "r" ||"$caracter" == "s" ||"$caracter" == "t" ||"$caracter" == "v" ||"$caracter" == "w" ||"$caracter" == "x" ||"$caracter" == "y" || "caracter" == "z" ]]
then
		opcion="consonante"

else
	opcion="error"

fi
echo $opcion

exit 0





















