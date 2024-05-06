const q1 = document.getElementById("q1")
const q2 = document.getElementById("q2")
const posx = document.getElementById("posx")
const posy = document.getElementById("posy")
const largura = document.getElementById("largura")
const altura = document.getElementById("altura")


q1.accessKey="p"
q2.accessKey="m"


q1.addEventListener("click",({target})=>{
    getDimencoes(target.getBoundingClientRect())

})
q2.addEventListener("click",({target})=>{
    getDimencoes(target.getBoundingClientRect())

})


const getDimencoes = (p)=>{

    posy.innerHTML=`Posy:${p.x}`
    largura.innerHTML=`Largura:${p.width}`
    altura.innerHTML=`Altura:${p.height}`
    posx.innerHTML=`posx:${parseInt(p.y)}`
    
}








