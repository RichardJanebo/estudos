const nomes  = document.querySelector("#textNome")
const idade = document.querySelector("#textidade")
const botao = document.querySelector("#verificar")
const main  = document.querySelector("#main")
const p     = document.createElement("div")

main.appendChild(p)
p.setAttribute("class","paragrafo")
p.innerHTML="Teste"


class pessoa{
    constructor(pnome,pidade){
        this.nome = pnome 
        this.idade = pidade 
    }
    getNome(){
        return this.nome
    }
    getIdade(){
        return this.idade
    }
    setNome(nome){
        this.nome = nome
    }
    setIdade(idade){
        this.idade = idade
    }
    info(){
        return `nome:${this.nome} Idade:${this.idade}`
    }
}

let pessoas = []


const addPessoas = ()=>{
    p.innerHTML=""
    pessoas.map((el)=>{
        const div = document.createElement("div")
        div.setAttribute("class","Pessoa")
        div.innerHTML=`Nome: ${el.getNome()} Idade:${el.getIdade()}`

        p.appendChild(div)
    })
    

}

botao.addEventListener("click",()=>{
    let q1 = new pessoa(nomes.value,idade.value)

    pessoas.push(q1)
    nomes.value=""
    idade.value=""

    console.log(pessoas)

    addPessoas()

  

})