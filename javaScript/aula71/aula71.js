const teclasNumericas = [...document.querySelectorAll(".num")]
const teclasOperacoes = [...document.querySelectorAll(".op")]
const resposta = document.querySelector(".res")
const display = document.getElementById("display")


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
console.log(teclasNumericas)
console.log(teclasOperacoes)