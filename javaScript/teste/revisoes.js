// const body = document.querySelector("#body")

// // console.log(body.offsetWidth)

// // const nome = "Richard"
// // localStorage.setItem("nome",nome)
// // console.log(localStorage.getItem("nome"))

// let numeros = [10,20,30]

// numeros = numeros.every((el)=>{
//     return el > 20
// })

// console.log(numeros)

// body.addEventListener("click",({target})=>{
//     console.log(target)
// 


let arr = [10,26,65,89,4,55]

const maior18 = arr.every((el,i)=>{
    let indice = 0
    let elemento = 0
    if (el < 18){
        indice = i 
        elemento = el

    }

    console.log(`O elemento menor que 18 é o ${elemento} e seu indice é ${i}` ) 
})

