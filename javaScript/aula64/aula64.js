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
    blind.value=0
    muni.value=0
})

radio2.addEventListener("click", (evt)=>{
    blind.setAttribute("disabled","disabled")
    muni.setAttribute("disabled","disabled")
    blind.value=0
    muni.value=0
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
        return `Nome: ${this.nome} Portas:${this.pportas} `
    }
}

let arrey_carros = []

console.log(arrey_carros)
const removendo = (rem)=>{
    arrey_carros=arrey_carros.filter((el)=>{
        return el.nome!=rem
    })

}


const gerenciarExibicaoDeCarros=()=>{
    paragrafo.innerHTML=""

    arrey_carros.forEach((c)=>{
        console.log(c)
        const div = document.createElement("div")
        const btn = document.createElement("button")
        div.setAttribute("class","carros")
        div.setAttribute("data-nome",c.nome)

        btn.addEventListener("click",(evt)=>{
            paragrafo.removeChild(evt.target.parentNode)
            const rmv = evt.target.parentNode.getAttribute("data-nome")
            removendo(rmv)
            console.log(arrey_carros)
        })
       
        div.innerHTML=`Nome:${c.nome} Portas:${c.pportas} Munição:${c.minicao} Blindagem:${c.blindagem}`
        btn.innerHTML="Remover"
        paragrafo.appendChild(div)
        div.appendChild(btn)
       
    })
}


adicionar.addEventListener("click",()=>{
    let c1 = new blindado(nome.value,port.value,blind.value,muni.value)
    let c2 = new normal(nome.value,port.value)
    if(c1.nome.length == 0 || c2.nome.length == 0){
        alert("nome nulo")
    }else 

    
    if(radio1.checked){
        arrey_carros.push(c1)
    }else{
        arrey_carros.push(c2)
    }

    gerenciarExibicaoDeCarros()
})




