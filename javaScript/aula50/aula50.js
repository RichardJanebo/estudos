const caixaArrey = document.querySelector("#arrey")
const caixaPesquisar = document.querySelector("#btnPesquisar")
const textPesquisar = document.querySelector("#text_pesquisar")
const resultado = document.querySelector("#resultado")

const arrey_numerico = [1,2,3,4,5,6,7]
caixaArrey.innerHTML = arrey_numerico

caixaPesquisar.addEventListener("click",(evt)=>{
    resultado.innerHTML = arrey_numerico.reduce((anterior,atual,posicao)=>{
        return anterior + atual
    })
})