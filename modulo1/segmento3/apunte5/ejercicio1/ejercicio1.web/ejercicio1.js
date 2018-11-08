function validar(){
	
		let text='';
			
		num = parseInt(document.getElementById('num').value);
					
			for(let i= 1; i<=10; i++){
				resultado =	i*num;
				text +=  `${num.toString()} x ${i.toString()} = ${resultado} <br>`;
				
		}

			document.getElementById('parrafo').innerHTML=text;
}
