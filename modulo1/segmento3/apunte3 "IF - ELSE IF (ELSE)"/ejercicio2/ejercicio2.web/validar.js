function validar(){
	
	dia = parseInt(document.getElementById("dia").value);
	switch (dia){
		case 1:
		respuesta="Lunes";
		break;
														
		case 2:
		respuesta="Martes";
		break;
																								
		case 3:
		respuesta="Miercoles";
		break;
																																		
		case 4:
		respuesta="Jueves";
		break;
		
		case 5:
		respuesta="Viernes";
		break;
		
		case 6:
		respuesta="Sabado";
		break;
		
		case 7:
		respuesta="Domingo";
		break;
		
		default:
		respuesta="Error";
		break;
		}
		if(respuesta=="Error"){
		alert(`Opcion incorrecta: ${respuesta}`);
		}else{
		alert(`El dia es ${respuesta}`);
		}
}

