const multipicacao = document.querySelector("#multiplicacao")
const adicao = document.querySelector("#adicao")
const subtracao = document.querySelector("#subtracao")
const divisao = document.querySelector("#divisao")
const resultado = document.querySelector("#resultado")




const calcular = [
    ()=>{
        const numeros =[document.querySelector("#valor1").value,document.querySelector("#valor2").value]
        resultado.value = Number(numeros[0]) +  Number(numeros[1])
       
    },
    ()=>{
        const numeros =[document.querySelector("#valor1").value,document.querySelector("#valor2").value]
        resultado.value = Number(numeros[0]) - Number(numeros[1])
    },
    ()=>{
        const numeros =[document.querySelector("#valor1").value,document.querySelector("#valor2").value]
        resultado.value = Number(numeros[0]) *  Number(numeros[1])
    },
    ()=>{
        const numeros =[document.querySelector("#valor1").value,document.querySelector("#valor2").value]
        resultado.value = Number(numeros[0]) /  Number(numeros[1])
    }
]

adicao.addEventListener("click",calcular[0])
subtracao.addEventListener("click",calcular[1])
multipicacao.addEventListener("click",calcular[2])
divisao.addEventListener("click",calcular[3])


