const ary = [10,20,30,40,100]
let soma = 0
let iteracoes = 1
let valor = 0


const media = ary.map((el,i)=>{
    soma = soma + el
    
    iteracoes =  i
    iteracoes = iteracoes + 1
    
    
     valor = soma / iteracoes

     return valor  
})
console.log(iteracoes)
console.log(valor)
