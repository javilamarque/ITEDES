function listaCopiada(){
    let lista1=[];
    let lista2=[];

    for(i=0;i<=5;i++){
        lista1.push(parseInt(prompt("Ingrese 5 numeros para multiplcar por 2: ")));
    }
    alert(lista1);

    for(i=0;i<lista1.length;i++){
        lista2.push(parseInt(lista1[i])*2);
    }
    alert(`el resultado de los numeros ingresados multiplicado por 2 es: ` + lista2)
}