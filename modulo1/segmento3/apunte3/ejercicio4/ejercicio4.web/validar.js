function validar(){
	
		let number = prompt("Ingrese un numero romano: ");
		let respuesta

		if(number.toUpperCase()=='I'){
				respuesta = '1';
		}else if (number.toUpperCase()=='V'){
				respuesta= '5';
		}else if (number.toUpperCase()=='X'){
				respuesta= '10';
		}else if (number.toUpperCase()=='L'){
				respuesta= '50';
		}else if (number.toUpperCase()=='C'){
				respuesta= '100';
		}else if (number.toUpperCase()=='D'){
				respuesta= '500';
		}else if (number.toUpperCase()=='M'){
				respuesta= '1000';
		}else{
				respuesta= 'Numero romano invalido';
		}

		alert(`${respuesta}`);

}



































