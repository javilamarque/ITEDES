function validar(){
	let num1 = parseInt(document.getElementById('num1').value);
	let num2 = parseInt(document.getElementById('num2').value);
	let resultado='';

	if(num1%num2==0){
		respuesta=`${num1} es multiplo de ${num2}`;
	}else if(num2%num1==0){
		resultado=`${num2} es multiplo de ${num1}`;
	}else{
		resultado=`no son multiplos`
	}

	
	
	document.getElementById('parrafo').innerHTML=respuesta;
}

