const div1 = document.getElementById("div1")
const span = document.createElement("span")
const eleFilho = div1.firstElementChild.firstChild
const eleIrmao = eleFilho.nextSibling

div1.appendChild(span)

const elePai = div1.parentNode

console.log(elePai)
console.log(div1.childNodes)
console.log(eleIrmao)

let cursos = ["Html","Css","JavaScript"] 
cursos.pop()
let num = [10,10,3,4,5,60,]
const valida = num.reduce((el,at)=>{
    let soma = el + at
    console.log(el)
    return soma
})

console.log(valida)
cursos.push("Pascal")
console.log(cursos)

num.unshift("ELemento")
console.log(num)