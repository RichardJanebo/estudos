const teclasNumericas = [...document.querySelectorAll(".num")]
const teclasOperacoes = [...document.querySelectorAll(".op")]
const resposta = document.querySelector(".res")
const display = document.getElementById("display")
const onOfo = document.getElementById("tecla_onOf")
const limpar = document.getElementById("tecla_clean")


let sinal = false

teclasNumericas.map((el)=>{
    el.addEventListener("click", (evt)=>{
        sinal = false
        if (display.innerHTML =="0"){
            display.innerHTML=""
        }
        display.innerHTML+=evt.target.innerHTML
    })

})
teclasOperacoes.map((el)=>{
    el.addEventListener("click", (evt)=>{
        

        if (!sinal){
            sinal = true
            if (display.innerHTML =="0"){
                display.innerHTML=""
            }
            
            if(evt.target.innerHTML == "x"){
                display.innerHTML+="*"

            }else{
                display.innerHTML+=evt.target.innerHTML
            }
        }
    })

})
limpar.addEventListener("click",()=>{
    sinal = false
    display.innerHTML="0"
})

resposta.addEventListener("click",()=>{
    let st = display.textContent
    let calc = eval(st)
    display.innerHTML=calc
})

console.log(teclasNumericas)
console.log(teclasOperacoes)