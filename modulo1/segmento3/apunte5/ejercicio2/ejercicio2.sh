#!/bin/bash

declare -i result
declare -i i
for (( i=100; i>0; i-- )){
	result=$i%2
		if [[ $result == 0 ]]
	then
		echo " $i"
	fi
}

exit 0
