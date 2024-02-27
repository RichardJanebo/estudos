class carro{
    constructor(pnome,ptipo){
        this.nome = pnome

        if (ptipo == 1){
            this.tipo = "Comum"
        }else if(ptipo == 2){
            this.tipo = "Empresarial"
        }else if(ptipo == 3){
            this.tipo = "Corrida"
        }
    }

    getInfo(){
        return `O nome do carro é ${this.nome} e o tipo é ${this.tipo}`
    }
}


let p1 = new carro("corola", 2)

console.log(p1.getInfo())