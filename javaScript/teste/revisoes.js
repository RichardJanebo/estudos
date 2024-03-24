const texto = document.getElementById("texto")
const botao = document.querySelector("#botao")
const answer = document.querySelector("#res")
const h = document.querySelector("h1")

h.innerHTML="Digite um numero e veja a taboada de multiplicação de 0 a 10 dele"

function promessa(){
    let promise = new Promise((resolve,reject)=>{
        let temp = 3000
    
        setTimeout(()=>{
            valor = true
    
            if (numero > 0){
                resolve(  
                    numero
                )
            }else{
                reject("não puxou")
            }
    
        },temp)
    })
    return promise
}

let taboada = (n)=>{  
    answer.innerHTML=""
    let valores = []
    let indice = 1
    while(indice <= 10){
        let vezes = n * indice
        valores.push(vezes)
        indice ++
    }

    valores.map((ele,i)=>{
        
        const div = document.createElement("div")
        div.innerHTML=`${n} X ${i+1} = ${ele}`
        answer.appendChild(div)
    })
    
    
}

let numero = 0

botao.addEventListener("click",()=>{
    answer.innerHTML="processando"
    let conteudoTexto = texto.value 
    numero = Number(conteudoTexto)
    promessa()
    .then((retorno)=>{
        taboada(retorno)
        
    })
    .catch((retorno)=>{
        return answer.innerHTML=retorno
    })
    
    
})


