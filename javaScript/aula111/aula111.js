const painel = document.querySelector("#painel")
const carro = document.querySelector("#carro")
const btn_direita = document.querySelector("#btn_direita")
const btn_esquerda = document.querySelector("#btn_esquerda")
const parar = document.querySelector("#parar")

const init = ()=>{
    carro.style="position:relative;left:0px;top:0px;width:100px;height:50px;"
    tamMax = window.innerWidth - parseInt(carro.style.width)
}

let inter = null

let tamMax = null

const mover = (p)=>{
    clearTimeout(inter)
   inter = setTimeout(p,30)
}

const direita = ()=>{
    if (carro.style.left=parseInt(carro.style.left) < tamMax){
        carro.style.left=parseInt(carro.style.left) + 10 + "px"
        mover(direita)

    }else{
        clearTimeout(inter)
        esquerda()
       
    }
    
    
}
const esquerda = ()=>{
    if (carro.style.left = parseInt(carro.style.left) > 0){
        carro.style.left = parseInt(carro.style.left) - 10 +"px"
        mover(esquerda)
    }else{
        clearTimeout(inter)
        direita()
      
    }
    
}

window.addEventListener("keydown",(evt)=>{
    if(evt.code === "ArrowUp"){
        carro.style.height = parseInt(carro.style.height) +10 +"px"
        carro.style.width = parseInt(carro.style.width) + 10 +"px"
        tamMax = window.innerWidth - parseInt(carro.style.width)
    }
    if(evt.code === "ArrowDown"){
        carro.style.height = parseInt(carro.style.height) -10 +"px"
        carro.style.width = parseInt(carro.style.width) -10 +"px"
        tamMax = window.innerWidth - parseInt(carro.style.width)
    }
    
})












btn_direita.addEventListener("click",()=>{
    mover(direita)
})


btn_esquerda.addEventListener("click",()=>{
    mover(esquerda)
})

parar.addEventListener("click",()=>{
    clearTimeout(inter)
})


window.addEventListener("resize",()=>{
    tamMax = window.innerWidth - parseInt(carro.style.width)
})
window.addEventListener("load",init())






