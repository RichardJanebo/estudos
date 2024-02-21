// const caixa = document.getElementById("caixa")

class pessoa  {
    constructor(pnome){
        this.nome=pnome
        this.endereço=pnome
        this.telephone=pnome

    }

}

const p1 = new pessoa("Richard")
const p3 = new pessoa("Av. Bob kan 2222")
const p2 = new pessoa("67 9999-9999")

console.log(p1.nome)
console.log(p2.endereço)
console.log(p3.telephone)