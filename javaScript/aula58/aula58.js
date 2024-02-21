// const caixa = document.getElementById("caixa")

class carro  {
    constructor(pnome,ptipo){
        this.nome=pnome
        if (ptipo == 1){
            this.tipo="Esportivo"
            this.velMax=300

        }else if(ptipo == 2){
            this.tipo="Utilitario"
            this.velMax=120
        }else if(ptipo == 3){
            this.tipo="passeio"
            this.velMax=80
        }else{
            this.tipo="Militar"
            this.velMax=200
        }
    }
}

const p1 = new carro("Porsh",1)
const p3 = new carro("Av. Bob kan 2222")
const p2 = new carro("67 9999-9999")

console.log(p1.nome)
console.log(p1.tipo)
console.log(p1.velMax)

console.log(p2.endereço)
console.log(p3.telephone)