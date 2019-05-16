function validar(){
    let num = parseInt(document.getElementById('num').value);
    let resultado = num*num*num;
    
    
    document.getElementById('parrafo').innerHTML=`El resultado es: ${resultado}`;

}