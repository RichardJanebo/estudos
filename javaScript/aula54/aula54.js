const caixa = document.querySelector(".caixa")
const pesquisar = document.querySelector("#texto")
const botao = document.querySelector("#verificar")


const text = pesquisar

let num = new Map()
num.set("curso","Java Script")
num.set(22,"Php")
num.set(10,1)



num.delete("curso")

botao.addEventListener("click",()=>{
    const text = pesquisar.value
    if (num.has(text)){
        caixa.innerHTML=`A Chave existe na memoria ela é a ${num.get(text)}` 
    }else{
        caixa.innerHTML="A Chave não Existe na memoria"
    }
    console.log(text)
})
console.log("o tamanho da coleção é " + num.size + "E o tipo é " + typeof(num))
num.forEach((el)=>{
    console.log(el)
}) 

