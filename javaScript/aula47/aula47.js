const caixaArrey = document.querySelector("#arrey" )
const caixaPesquisar = document.querySelector("#btnPesquisar")
const textPesquisar = document.querySelector("#text_pesquisar")
const resultado = document.querySelector("#resultado")

const arrey_numerico = ["Java script","css","Htmlcs"]
caixaArrey.innerHTML=arrey_numerico

caixaPesquisar.addEventListener("click",()=>{
    arrey_numerico.find((ele,i)=>{
        if (ele == textPesquisar.value){
            resultado.innerHTML=`o valor pesquisado foi ${ele} e esta na posicçao ${i+1} `
            return ele
        }else{
            resultado.innerHTML="Valor não encontrado"
        }
       })
})