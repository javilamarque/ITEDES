#!/bin/bash  
echo "* Introduce la tabla que quieres ver: " 
read tabla 
for i in 0 1 2 3 4 5 6 7 8 9 10 
do 
n=$(($tabla*$i)) 
echo "$tabla x $i= "$n 
done 
