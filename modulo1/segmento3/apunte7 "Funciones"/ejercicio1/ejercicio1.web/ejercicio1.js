function validar(){
	let num = parseInt(document.getElementById('num').value);
	let cantDividir=0;
	let text='';
	for (i=1;i<=num;i++){
		if(num%i==0){
			cantDividir+=1;
		}
	}

	text=`La cantidad de veces que se puede dividir es: ${cantDividir.toString()}`;
	
	document.getElementById('parrafo').innerHTML=text;






}
