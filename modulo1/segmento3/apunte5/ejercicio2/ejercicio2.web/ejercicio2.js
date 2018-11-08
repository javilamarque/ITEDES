function validar(){

	let resultado;
	let text='';
	for(let i= 100; i>0; i--){
		resultado =	i%2;

		if(resultado==0){

		text += `${i.toString()}<br>`;
		}
	}
		document.getElementById('parrafo').innerHTML=text;
}

