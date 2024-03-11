class carro {
    constructor(tipo, estagio) {
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


class carroEspecial extends carro {
    constructor(estagio){
        super(4,estagio)
        this.nome = "carro Especial"
        this.velmax = 300 + this.turbo.potencia

    }

}


let c1 = new carro(1, 2)
const c2 = new carroEspecial(3)

c2.info()


