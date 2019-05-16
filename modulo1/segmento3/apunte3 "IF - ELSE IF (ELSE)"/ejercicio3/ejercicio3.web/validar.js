function validar(){
	
		car = document.getElementById("car").value;
			
		if(car=="a" ||car=="e" || car=="i" || car=="o" || car=="u" ){
			respuesta = "vocal";
		}else if (car=="1" || car=="2" || car=="3" || car=="4" || car=="5" || car=="6" || car=="7" || car=="8" || car=="9" || car=="0"){
			respuesta= "numero";
		
		}else if (car=="b" || car=="c" || car=="d" || car=="f" || car=="g" || car=="h" || car=="j" || car=="k" || car=="l" || car=="m" || car=="n" || car=="p" || car=="q" || car=="r" || car=="s" || car=="t" || car=="v" || car=="w" || car=="x" || car=="y" || car=="z"){
			respuesta="consonante";
		}else{
			respuesta="error/ solo se permite vocales,numeros o consonantes ";
		}

			alert(`${respuesta}`);
