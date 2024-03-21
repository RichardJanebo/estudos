let tempo = 3000
let resultado = false

let promessa = new Promise((ok,nao_ok)=>{


    setTimeout(()=>{
        resultado = true
        if(resultado){
            ok("Resualtado Verdadeiro")
        }else{
            nao_ok("Resultado Falso")
        }

    },tempo)

})

promessa.then((retorno)=>{
    console.log(retorno)
})

promessa.catch((retorno)=>{
    console.log(retorno)
})

console.log(10)
