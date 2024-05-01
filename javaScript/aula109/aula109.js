const painel = document.querySelector("#painel")
const carro = document.querySelector("#carro")
const btn_direita = document.querySelector("#btn_direita")
const btn_esquerda = document.querySelector("#btn_esquerda")
const parar = document.querySelector("#parar")

const init = ()=>{
    carro.style="position:relative;left:0px;top:0px;"
}

let inter = null

const mover = (p)=>{
    clearTimeout(inter)
   inter = setTimeout(p,10)
}

const direita = ()=>{
    carro.style.left=parseInt(carro.style.left) + 10 + "px"
    mover(direita)
}
const esquerda = ()=>{
    carro.style.left = parseInt(carro.style.left) - 10 +"px"
    mover(esquerda)
}

window.addEventListener("load",init())
btn_direita.addEventListener("click",()=>{
    mover(direita)
})

btn_esquerda.addEventListener("click",()=>{
    mover(esquerda)
})
parar.addEventListener("click",()=>{
    clearTimeout(inter)
})