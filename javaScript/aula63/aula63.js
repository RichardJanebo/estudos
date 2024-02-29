const radio1 = document.querySelector("#txtradio1")
const radio2 = document.querySelector("#txtradio2")
const blind = document.querySelector("#txtblindagem")
const muni = document.querySelector("#txtmunicao")
const nome = document.querySelector("#txtname")
const adicionar = document.querySelector("#adicionar")
const port = document.querySelector("#txtdoor")
const paragrafo = document.querySelector("#paragrafo")


radio1.addEventListener("click", (evt)=>{
    blind.removeAttribute("disabled")
    muni.removeAttribute("disabled")
})

radio2.addEventListener("click", (evt)=>{
    blind.setAttribute("disabled","disabled")
    muni.setAttribute("disabled","disabled")
})


class carro{
    constructor(pnome,pportas,pblindagem){
        this.nome = pnome
        this.blidagem = pblindagem
        this.pportas = pportas

    }
}



let c1 = new carro(nome.value,port.value,blind.value)

