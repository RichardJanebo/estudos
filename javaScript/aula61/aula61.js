const nomes  = document.querySelector("#textNome")
const idade = document.querySelector("#textidade")
const botao = document.querySelector("#verificar")
const main  = document.querySelector("#main")
const p     = document.createElement("div")

main.appendChild(p)
p.setAttribute("class","paragrafo")
p.innerHTML="Teste"


const pessoa =  {
    nome:"",
    idade:"",



    getNome(){
        return this.nome
    },

    setIdade(idade){
        this.idade = idade
        return idade
    },

    setNome(name){
        this.nome = name
        return this.nome
    },
    info(){
        return `O Nome é ${this.nome} e a idade é ${this.idade}`
    }


}

botao.addEventListener("click", ()=>{
    let p1 = pessoa
    p1.setNome(nomes.value)
    let p2 = pessoa
    p2.setIdade(idade.value)

    p.innerHTML= pessoa.info()




})