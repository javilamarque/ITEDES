function validar(){

	let num1 = parseInt(document.getElementById('num1').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let num3 = parseInt(document.getElementById('num2').value);
	let resutado='';

	if(num1>num2){
			resultado=`${num1}`;
	
	}else{
			resultado=`${num2}`;
	
	}if(num3>=resultado){
			resultado=`${num3}`;
	
	}

	document.getElementById('parrafo').innerHTML=`El mayor de los 3 es: ${resultado}`;



}
