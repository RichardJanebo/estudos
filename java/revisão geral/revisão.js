const imgs = document.querySelector("#container")
const img = document.querySelectorAll(".imgBanner")
const btn_banner1 = document.getElementById("btn_banner1");
const btn_banner2 = document.getElementById("btn_banner2");
const footer = document.querySelector("#footer");


let numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9]


const renderizar = () => {
    footer.innerHTML=""
    numeros.map((el) => {
        
        const div = document.createElement("div");
        div.setAttribute("class", "teste")
        div.addEventListener("click",()=>{excluir(el)})
        div.innerHTML = el;
        footer.appendChild(div)
    })
}


const excluir = (el) => {
    numeros = numeros.filter((ele)=>{return el !== ele })
    renderizar();
}




let idx = 0;



function carrossel() {
    idx++;
    if (idx > img.length - 1) {
        idx = 0;
    }
    console.log(-idx * [...img][0].getBoundingClientRect().width)
    imgs.style.transform = `translateX(${-idx * [...img][0].getBoundingClientRect().width}px)`;
}


btn_banner1.addEventListener("click", carrossel)
btn_banner2.addEventListener("click", renderizar)
