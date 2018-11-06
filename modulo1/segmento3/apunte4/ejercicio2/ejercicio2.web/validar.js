function validar(){
	
		let respuesta='';
		let carac = document.getElementById("carac").value;
				
		switch (carac){
			case "1":
				respuesta="Numero";
				break;
			case "2":
				respuesta="Numero";
				break;
			case "3":
				respuesta="Numero";
				break;
			case "4":
				respuesta="Numero";
				break;
			case "5":
				respuesta="Numero";
				break;
			case "6":
				respuesta="Numero";
				break;
			case "7":
				respuesta="Numero";
				break;
			case "8":
				respuesta="Numero";
				break;
			case "9":
				respuesta="Numero";
				break;
			case "0":
				respuesta="Numero";
				break;
			case "A":
				respuesta="Vocal";
				break;
			case "E":
				respuesta="Vocal";
				break;
			case "I":
				respuesta="Vocal";
				break;
			case "O":
				respuesta="Vocal";
				break;
			case "U:
				respuesta="Vocal";
			break;
			default:
				respuesta="Error";
				break;
		}
			alert(`${respuesta}`);
			
}




