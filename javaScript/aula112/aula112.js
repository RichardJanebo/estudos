const q1 = document.getElementById("q1")
const q2 = document.getElementById("q2")
const posx = document.getElementById("posx")
const posy = document.getElementById("posy")
const largura = document.getElementById("largura")
const altura = document.getElementById("altura")

let DomRect =q1.getBoundingClientRect()

posx.innerHTML= Math.floor(DomRect.y)
posy.innerHTML=`Posy:${DomRect.x}`
largura.innerHTML=`Largura:${DomRect.width}`
altura.innerHTML=`Altura:${DomRect.height}`
posx.innerHTML=`posx:${DomRect.x}`


console.log(Math.floor(DomRect.y))


