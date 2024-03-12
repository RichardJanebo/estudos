class CarroPadrao{
    constructor(){
        if(this.constructor === CarroPadrao){
            throw new TypeError("Esta classe não pode ser instanciada")
        }
        if(this.ligar === undefined || this.desligar === undefined){
            throw new TypeError("É obrigatorio implemnetar o metodo ligar e desligar")
        }
        this.rodas = 4
        this.portas = 4
        this.ligado = false
    }
}



class Carro extends CarroPadrao{
    constructor(tipo, estagio) {
        super()
        this.turbo = new turbo(estagio)
        if (tipo == 1) {
            this.velmax = 120
            this.nome = "Normal"
        } else if (tipo == 2) {
            this.velmax = 160
            this.nome = "Esportivo"
        } else if (tipo == 3) {
            this.velmax = 200
            this.nome = "Rapidão"
        }

        this.velmax += this.turbo.potencia
    }
    info() {
        console.log(`Nome: ${this.nome} Velocidade: ${this.velmax} `)
        console.log(`Portas ${this.portas}`)
        console.log(`Esta ligado :${this.ligado}`)
        console.log(`Rodas : ${this.rodas}`)
    }
    ligar(){
        this.ligado = true
    }
    desligar(){
        this.ligado = false
    }

}

class turbo {
    constructor(n) {
        if (n == 0) {
            this.potencia = 0
        } else if (n == 1) {
            this.potencia = 100
        } else if (n == 2) {
            this.potencia = 200
        } else {
            this.potencia = 300
        }
    }
}


class CarroEspecial extends Carro {
    constructor(estagio){
        super(4,estagio)
        this.infodopai = 1
        this.nome = "carro Especial"
        this.velmax = 300 + this.turbo.potencia

    }
    info(){
        if(this.infodopai == 1){
            super.info()
        }else{

            console.log(`Nome: ${this.nome} Velocidade: ${this.velmax} `)
            console.log("Nome:", this.nome , "Info novo")
        }

    }

}


let c1 = new Carro(1, 2)
const c2 = new CarroEspecial(3)



c2.info()



