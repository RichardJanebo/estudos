const imgs = document.querySelector("#container")
const img = document.querySelectorAll(".imgBanner") 
const btn_banner1 = document.getElementById("btn_banner1");
const btn_banner2 = document.getElementById("btn_banner2");


let idx = 0;



function carrossel(){
    idx++;
    if(idx > img.length - 1){
        idx = 0;
    }
    console.log(-idx * [...img][0].getBoundingClientRect().width)
    imgs.style.transform = `translateX(${-idx * [...img][0].getBoundingClientRect().width}px)`;
}


btn_banner1.addEventListener("click",carrossel)
btn_banner2.addEventListener("click",carrossel)
