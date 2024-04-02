

// class Object{
//     constructor(lados,tamanho){
//         this.lados = lados
//         this.tamanho = tamanho

//     }
//     setarLados(l){
//         this.lados = l
//         return this.lados

//     }
// }

// let n = new Object(4,6)




// const pessoa = {
//     nome :"",
//     fatorial : 0,

   

// }

function setNumber(fatorial){
    
    let fat = 1
    let fator = fatorial

    while(fator >= 1 ){
        
        
        fat = fat * fator
        fator--


    }
    return fat
    
    
    
}

console.log(setNumber(10))


