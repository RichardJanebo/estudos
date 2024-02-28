class carro {  //Class pai
    constructor(pnome,pportas){
        this.nome = pnome
        this.portas = pportas
        this.ligado = false
        this.vel = 0
        this.cor = undefined

    }
    ligar(){
        this.ligado = true
    }
    desligar(){
        this.ligado = false
    }
    setCor(cor){
        this.cor = cor
        return cor
        
    }
     
}

class militar extends carro{

}




const c1 = new carro("Normal", 4)
c1.setCor("Branco") 
console.log(`Nome:${c1.nome}`)
console.log(`Portas ${c1.portas}`)
console.log(`ligado:${c1.ligado}`)
console.log(`Velocidade:${c1.vel}`)
console.log(`Cor:${c1.cor}`)



