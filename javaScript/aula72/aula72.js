const teclasNumericas = [...document.querySelectorAll(".num")]
const teclasOperacoes = [...document.querySelectorAll(".op")]
const resposta = document.querySelector(".res")
const display = document.getElementById("display")
const onOfo = document.getElementById("tecla_onOf")
const limpar = document.getElementById("tecla_clean")


let sinal = false

teclasNumericas.map((el)=>{
    el.addEventListener("click", (evt)=>{
        display.innerHTML+=evt.target.innerHTML
    })

})
teclasOperacoes.map((el)=>{
    el.addEventListener("click", (evt)=>{
        if (display.innerHTML =="2"){
            display.innerHTML=""
        }

        if (!sinal){
            sinal = true
            
            if(evt.target.innerHTML == "x"){
                display.innerHTML="*"

            }else{
                display.innerHTML+=evt.target.innerHTML
            }
        }
    })

})
limpar.addEventListener("click",()=>{
    display.innerHTML="2"
})

resposta.addEventListener("click",()=>{
    let st = display.textContent
    let calc = eval(st)
    display.innerHTML=calc
})

console.log(teclasNumericas)
console.log(teclasOperacoes)