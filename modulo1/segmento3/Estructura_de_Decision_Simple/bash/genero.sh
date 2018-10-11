#!/bin/bash
read -p "Ingrese su genero: " genero
if [[ "$genero" == "Masculino" || "$genero" == "Femenino" ]]
then
		echo "su sexo es $genero"
fi
exit 0
