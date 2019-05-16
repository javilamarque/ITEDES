function validar(){
	let continuar = `SI`

	while(continuar==`SI`){

		let num1 = 	parseInt(prompt('Ingrese un numero para la suma: '));
		let num2 = parseInt(prompt('Ingrese otro numero para la suma: '));
		resultado = num1 + num2
		
		alert(`${resultado}`);

		continuar = prompt('Desea continuar, (si/no): ').toUpperCase();
	
	}

}

