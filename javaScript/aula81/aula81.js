const olhos = [...document.getElementsByClassName("olho")]



let posiX = 0
let posiY = 0

window.addEventListener("mousemove",(evt)=>{
        posiX = evt.clientX
        posiY = evt.clientY
        console.log(posiX)


        const rot = Math.atan2(posiY,posiX) * 180/Math.PI
        olhos.forEach((o)=>{
            o.style.transform="rotate("+rot+"deg)"

        })


})










