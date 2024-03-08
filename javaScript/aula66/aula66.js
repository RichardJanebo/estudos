class carro{
    static portas = true
    constructor(velocidade){
        this.velocidade = velocidade
        if (velocidade > 100){
            this.turbo = true
        }else{
            this.turbo = false
        }
    }
    info(){
        return `Velocidade: ${this.velocidade} Turbo ${this.turbo} Portas:${this.portas ?"4":"0"}`
    }
}

let n1 = new carro(98)

console.log(n1.info())
