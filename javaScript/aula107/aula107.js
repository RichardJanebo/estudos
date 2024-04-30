const painel = document.querySelector("#painel")
const carro = document.querySelector("#carro")
const btn_direita = document.querySelector("#btn_direita")
const btn_esquerda = document.querySelector("#btn_esquerda")

const init = ()=>{
    carro.style="position:relative;left:0px;top:0px;"
}

const mover = ()=>{
    setInterval(style,550)
}

const style = ()=>{
    carro.style.left=parseInt(carro.style.left) + 10 +"px"
    carro.style.top = parseInt(carro.style.top) + 10 +"px"
}



window.addEventListener("load",init())
btn_direita.addEventListener("click",()=>{
    mover()
    
    
    console.log(pos)


})

btn_esquerda.addEventListener("click",()=>{
    carro.style.left=parseInt(carro.style.left) - 10 + "px"
    carro.style.top = parseInt(carro.style.top) - 10 + "px"
})