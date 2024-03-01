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


class normal{
    constructor(pnome,pportas){
        this.nome = pnome
        this.pportas = pportas

    }
}

class blindado extends normal{
    constructor(pnome,pportas,blindagem,municao){
        super(pnome,pportas)
        this.minicao = municao
        this.blindagem = blindagem
    }

    info(){
        return `Nome: ${this.nome} </br> Portas:${this.pportas} `
    }
}






let res = []



adicionar.addEventListener("click",()=>{
    let c1 = new normal(nome.value,port.value,blind.value)
    let c2 = new blindado(nome.value,port.value,blind.value,muni.value)


    res.push(c2.info())
    console.log(res)
})


