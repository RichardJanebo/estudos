const teclasNumericas = [...document.querySelectorAll(".num")]
const teclasOperacoes = [...document.querySelectorAll(".op")]
const resposta = document.querySelector(".res")
const display = document.getElementById("display")
const onOfo = document.getElementById("tecla_onOf")
const limpar = document.getElementById("tecla_clean")


teclasNumericas.map((el)=>{
    el.addEventListener("click", (evt)=>{
        display.innerHTML+=evt.target.innerHTML
    })

})
teclasOperacoes.map((el)=>{
    el.addEventListener("click", (evt)=>{
        display.innerHTML+=evt.target.innerHTML
    })

})
limpar.addEventListener("click",()=>{
    display.innerHTML="0"
})


console.log(teclasNumericas)
console.log(teclasOperacoes)