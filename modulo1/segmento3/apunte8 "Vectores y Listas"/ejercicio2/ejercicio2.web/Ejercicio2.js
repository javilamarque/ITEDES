function numImpar(){
    let listImpar=[];
    let auxiliar='';
    let text='';

    for (i=0;i<100;i++){
        if(i%2!=0){
            console.log(i);
            listImpar.push(i);
            text+= `${i.toString()}<br>`;
        }
    }

    for(i=0;i<listImpar.length-1;i++){
        for(k=i+1;k<=listImpar.length;k++){
            if(listImpar[i]>listImpar[k]){
                auxiliar=listImpar[k];
                listImpar[k]=listImpar[i];
                listImpar[i]=auxiliar;
            }
        }
    }
    document.getElementById('parrafo').innerHTML=`${listImpar}`;
}