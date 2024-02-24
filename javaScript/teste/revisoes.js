//Algoritimo de media 

const div   = document.querySelector("#div1")
const input = document.createElement("input")
const p     = document.createElement("p") 
const calcular = document.createElement("button")
const inserir = document.createElement("button")
const p2 = document.createElement("p")




input.setAttribute("type","number")
p.innerHTML="Resultado"
calcular.innerHTML="Calcular"
inserir.innerHTML="inserir"

div.appendChild(input)
div.appendChild(inserir)
div.appendChild(p2)
div.appendChild(calcular)
div.appendChild(p)

let numeroDigitado = []
Number(numeroDigitado)
inserir.addEventListener("click",()=>{

    numeroDigitado.push(input.value)
    p2.innerHTML=numeroDigitado
})

calcular.addEventListener("click",()=>{
    let soma = 0
    let indice = 1
    numeroDigitado.map((el,i)=>{
        
        soma = soma + Number(el) 
        indice = i
        
    })
    indice = indice + 1
    console.log(soma)
    console.log(indice)

    let calc = soma / indice

    p.innerHTML=`A media dos numeros é ${calc.toFixed(2)}`
})



