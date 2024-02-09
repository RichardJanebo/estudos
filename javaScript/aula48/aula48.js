const caixaArrey = document.querySelector("#arrey")
const caixaPesquisar = document.querySelector("#btnPesquisar")
const textPesquisar = document.querySelector("#text_pesquisar")
const resultado = document.querySelector("#resultado")

const arrey_numerico = [21, 6, 18, 26, 55, 98]
caixaArrey.innerHTML = arrey_numerico

caixaPesquisar.addEventListener("click", () => {
    resultado.innerHTML = "Arrey não esta em conformidade "
    const ret = arrey_numerico.every((ele, ind, arr) => {
        if (ele < 18) {
            resultado.innerHTML = `o Arrey não esta em conformidade pois o elemento da posição ${ind+1} esta fora da rregra estabelecida`
        } else {
            resultado.innerHTML = "O arrey esta em conformidade"
        }
       
    })

})

