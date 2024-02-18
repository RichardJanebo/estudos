const multipicacao = document.querySelector("#multiplicacao")
const adicao = document.querySelector("#adicao")
const subtracao = document.querySelector("#subtracao")
const divisao = document.querySelector("#divisao")
const resultado = document.querySelector("#resultado")
const valor1 =document.querySelector("#valor1")
const valor2 =document.querySelector("#valor2")



const calcular = [
    (el)=>{
        let soma = 0
        for (v of el){
            soma += v 

        }
        return soma
    },
    (el)=>{
        let menos = 0
        for (v of el){
            menos = v 
            

        }
        return menos
    },
    (el)=>{
        let vezez = 1
        for (v of el){
            vezez *= v 

        }
        return vezez
    },
    (el)=>{
        let dividi = 1
        for (v of el){
            dividi /= v 

        }
        return dividi
    }
]

const tipos = [adicao,subtracao,divisao,multipicacao]

tipos.map((el=>{
    el.addEventListener("click",()=>{
        const valor01 = parseInt(valor1.value)
        const valor02 = parseInt(valor2.value)
        const valores = [valor01,valor02]
        
        if ( el == adicao){
             console.log(calcular[0](valores))
        }else if(el == subtracao){
            console.log(calcular[1](valores))

        }else if(el == multipicacao){
            console.log(calcular[2](valores))
        }else if(el == divisao){
            console.log(calcular[3](valores))
        }

           
            
        
    })
    

}))
