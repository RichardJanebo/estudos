const caixaArrey = document.querySelector("#arrey")
const caixaPesquisar = document.querySelector("#btnPesquisar")
const textPesquisar = document.querySelector("#text_pesquisar")
const resultado = document.querySelector("#resultado")

const arrey_numerico = [1, 2, 13, 12, 5, 10,19]
caixaArrey.innerHTML = arrey_numerico

caixaPesquisar.addEventListener("click",()=>{
    const verot = arrey_numerico.some((el,i)=>{
        if ( el <= 18){
            resultado.innerHTML=`O valor que não esta em conformidade é o ${i}`
        }
        return   el > 18
        
    })
    if (verot == true){

        resultado.innerHTML=`O valor esta em conformidade`
    }
})
