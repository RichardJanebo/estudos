const caixaArrey = document.querySelector("#arrey")
const caixaPesquisar = document.querySelector("#btnPesquisar")
const textPesquisar = document.querySelector("#text_pesquisar")
const resultado = document.querySelector("#resultado")

const arrey_numerico = [21, 20, 10, 26, 55, 98]
caixaArrey.innerHTML = arrey_numerico

caixaPesquisar.addEventListener("click",()=>{
    const verot = arrey_numerico.some((el)=>{
        el > 18
    })
    console.log(verot)
})
