const painel = document.querySelector("#painel")
const carro = document.querySelector("#carro")
const btn_direita = document.querySelector("#btn_direita")
const btn_esquerda = document.querySelector("#btn_esquerda")
const parar = document.querySelector("#stop")

const po = () => {
    carro.style.position = "relative"
    carro.style.left = "0"

}
let inter = null


const intervalo = (p) => {
    clearInterval(inter) 
    inter = setInterval(p,10)

}


parar.addEventListener("click",()=>{
    clearInterval(inter)  
})

function direita (){
    if (parseInt(carro.style.left) < 0 || parseInt(carro.style.left) < 1000){
        carro.style.left = parseInt(carro.style.left) + 10 + "px"
    }else{
        clearInterval(inter)
        intervalo(esquerda)
    }

    
    
}

function esquerda (){
    if(parseInt(carro.style.left) > 0){
        carro.style.left = parseInt(carro.style.left) - 10 + "px"
    }else{
        clearInterval(inter)
        intervalo(direita)
    }
    

}

btn_direita.addEventListener("click", () => {
    intervalo(direita)
    
})

btn_esquerda.addEventListener("click", () => {
    intervalo(esquerda)
    

})

window.addEventListener("load", po)