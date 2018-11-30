function validar(){ 

	let num1 = parseInt(document.getElementById('num1').value);
	

	if(num1%2==0){
		resultado = true;
	}else{
		resultado = false;
	}

	document.getElementById('parrafo').innerHTML= `${resultado}`;



}
