const olhos = [...document.getElementsByClassName("olho")]
const body = document.querySelector("#body")


let posiX = 0
let posiy = 0



body.addEventListener("mousemove",(evt)=>{
    moveu(evt)
    


})

function moveu(evt){
    posiX = evt.clientX
    posiy = evt.clientY

    console.log(posiy)

}

