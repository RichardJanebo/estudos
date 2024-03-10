// // const arrey_numerico = [21, 20, 105, 26, 55, 89]

// // const teste = arrey_numerico.every((el,i)=>{

// //     if (el < 18){
// //         const arrey = []
// //         arrey_numerico.map((e)=>{
// //             if (e < 18){
// //                 arrey.push(e)
// //             }
// //         })
// //         console.log(arrey)

// //     }
    
    

// //     return el > 18


// // })

// // console.log(teste)

// // const idadades = [10,25,68,12,24,33,13,55,7,17]
// // const filtrando = idadades.filter((el)=>{
// //     return el > 18
// // })

// // console.log(filtrando)

// // let soma = 0
// // let mais = 0
// // do{
    
// //     soma++
// //     console.log(soma)
// // }while(soma < idadades.length)


// // while(mais < idadades.length){
// //     mais ++
// //     console.log(mais)
// // }

// const divTeste = document.createElement("div")
// const div1 = document.querySelector("#div1")

// div1.appendChild(divTeste)
// divTeste.setAttribute("class","vermelho")
// divTeste.innerHTML="Fazendo um teste"

// divTeste.addEventListener("click", (el)=>{
//     let elemento = el.target

//     elemento.classList.toggle("amarelo")
    
// })

// console.log(div1.hasChildNodes()?divTeste.textContent:"Não")



// // let cursos = ["Html","Css","JavaScript"] 

// // const acrescenta = ()=>{
// //     cursos.push("Curso novo")
// //     console.log(cursos)
// // }

// // acrescenta()
// // acrescenta()

// // let min = 0
// // let max = 100

// // for(i = 0;min < max;min++){
// //     if(min % 2 != 0 ){
// //         continue
// //     }
// //     console.log(min)
// // }



// const pessoa = {
//     nome:"Richad",
//     idade:20,
//     velocidade:100
// }

// const para_String = JSON.stringify(pessoa)

// const para_Object = JSON.parse(para_String)

// console.log(para_Object)
// console.log(para_String)

// class carro {
//     constructor(portas, velocidade){
//         this.portas = portas
//         this.veelocidade = velocidade 
//         this.nome = "camaro Amarelo"

//     }

//     setPortas(p){
//         this.portas = p
//     }

//     setVelocidade(v){
//         this.velocidade = v
//     }
// }


// const n = new carro(4,100)
// n.setPortas(9)
// console.log(n.portas)

// const letrasDonome = n.nome

// const separadas = letrasDonome.split(" ")

// console.log(separadas)

// const meuSet = new Set()
// meuSet.add(1)
// meuSet.add(2)
// meuSet.add(1)
// meuSet.add(1)
// meuSet.add(1)
// meuSet.add(1)
// meuSet.add(1)
// meuSet.add(1)
// meuSet.add(1)

// console.log(meuSet)

// const meuMap = new Map([


// ])
// meuMap.set("nome","Richard")



// console.log(meuMap.get("nome"))

// const numeros = [10,2,3,4,50]

// const some = numeros.some((el)=>{
    
//     return el > 18

// })

// console.log(some)

const f = new Function("n","m","return n+m")

console.log(f(10,10))


