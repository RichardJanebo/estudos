const caixaArrey = document.querySelector("#arrey")
const caixaPesquisar = document.querySelector("#btnPesquisar")
const textPesquisar = document.querySelector("#text_pesquisar")
const resultado = document.querySelector("#resultado")

const arrey_numerico = [21, 20, 10, 26, 55, 98]
caixaArrey.innerHTML = arrey_numerico

caixaPesquisar.addEventListener("click", () => {
    const arrey = arrey_numerico.every((el,i)=>{
        if(el < 18){
            resultado.innerHTML=`Arrey não conforme na posição ${i+1}`
        }
        return el >= 18
    })
    if (arrey == true){
        resultado.innerHTML=`Retorno verdadeiro`
    }
})

