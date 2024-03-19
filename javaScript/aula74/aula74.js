const teclasNumericas = [...document.querySelectorAll(".num")]
const teclasOperacoes = [...document.querySelectorAll(".op")]
const resposta = document.querySelector(".res")
const display = document.getElementById("display")
const onOfo = document.getElementById("tecla_onOf")
const limpar = document.getElementById("tecla_clean")
const tcpy = document.getElementById("tcpy")





let sinal = false
let decimal = false

teclasNumericas.map((el)=>{
    el.addEventListener("click", (evt)=>{
        sinal = false
       
        if(evt.target.innerHTML==","){
            if(!decimal){
                decimal = true
                if(display.innerHTML=="0"){
                    display.innerHTML="0,"
                }
                display.innerHTML+=evt.target.innerHTML
            }

        }else{
            if (display.innerHTML =="0"){
                display.innerHTML=""
            }   
            display.innerHTML+=evt.target.innerHTML
        }
        
    })

})
teclasOperacoes.map((el)=>{
    el.addEventListener("click", (evt)=>{
        

        if (!sinal){
            sinal = true
            decimal = true

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
    decimal = false
    display.innerHTML="0"
})

resposta.addEventListener("click",()=>{
    let st = display.textContent
    let calc = eval(st)
    display.innerHTML=calc
})

tcpy.addEventListener("click",()=>{
    navigator.clipboard.writeText(display.innerHTML)

})