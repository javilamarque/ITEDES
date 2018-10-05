#!/bin/bash/

declare name=""
declare name1=""
declare name2=""
declare name3=""

read -p "Barrio donde vive:" name
read -p "Domicilio de la comisaria mas cercana:" name1
read -p "Esta entre la calle:" name2
read -p "Y la calle:" name3

echo "Usted vive en el barrio: $name Y la comisaria mas cercana esta en la calle: $name1 Entre la calle: $name2 Y la calle: $name3"

exit 0
