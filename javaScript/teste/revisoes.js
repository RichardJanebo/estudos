// const colecao = new Map(
//     [
        
//     ["curso","Java Script"],
//     ["Jogo","Call of Duth"]


//     ]
// )

// colecao.set("carro","Civic")
// console.log(colecao.get("carro"))


// // console.log(colecao.get("curso"))

// // const idades = [ 10,20,30,40,50]

// // const teste = idades.reduce((passado,atual,indice)=>{
// //     soma = passado + atual
    
// //     console.log(`Este é o atual ${atual}`)
// //     console.log(`Este é o passado ${passado}`)
// //     return soma
// // })
// // console.log(teste)

// let num1 = 14 
// let num2 = 11
// console.log(num1 & num2)


// const arrey = [
    
//     (el)=>{
//         let soma =10
//         soma += el
//         return soma
        
//     }
// ]
// console.log(arrey[0](10))

// arrey.unshift("Cavalo")

// console.log(arrey[0])


// const pesssoas = new Set()

// pesssoas.add("6799995555")
// pesssoas.add("Richard")
// pesssoas.add("6799995555")




// console.log(pesssoas)

// let test =new Function ("n1","n2","return n1+n2")

// console.log(test(10,10))

class carro {
    constructor(marca,velocidade){
        if(marca == 1){
           this.velocidade =300
        }else if(marca == 2){
            velocidade == 300
        }
    }
}

const l1 = new carro(1)
console.log(l1.velocidade)
