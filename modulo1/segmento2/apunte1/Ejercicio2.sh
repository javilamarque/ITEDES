#!/bin/bash/

declare name=""
read -p "ingrese su nombre:" name

declare LastName=""
read -p "ingrese su apellido:" LastName

declare dni=""
read -p "ingrese su dni:" dni

declare street=""
read -p "ingrese su domicilio:" street

declare tel=""
read -p "ingrese su telefono:" tel

echo "Su nombre es: $name $LastName su numero de documento es: $dni Y vive en la calle: $street Su numero de telefono es: $tel"

exit 0

