class carro {
    constructor(pnome,ptipo){
        this.nome = pnome

        if(ptipo == 1){
            this.tipo = "esportivo"
            this.velMax = 300
        }else if(ptipo == 2){
            this.tipo = "Utilitario"
            this.velMax = 200
        }else if(ptipo == 3){
            this.tipo = "passeio"
            this.velMax = 100
        }else{
            this.tipo = "Militar"
            this.velMax = 300
    
        }
        
    }
    getTipo(){
        return this.tipo
    }
    getVelmax(){
        return this.velMax
    }
    getNome(){
        return this.nome
    }
    getArrey(){
        return [this.nome,this.tipo,this.velMax]
        
    }

    informacao(){
        console.log(`Nome ${this.nome}`)
        console.log(`Tipo ${this.tipo}`)
        console.log(`Tipo ${this.tipo}`)
        console.log("-----------------")

    }
}

let p1 = new carro("Abarth", 1)
let p2 = new carro("Civic",1)
let p3 = new carro("Strada",2)
let p4 = new carro("Corola",3)
let p5 = new carro("Viatura",4)




console.log(p1.informacao())
console.log(p2.informacao())
console.log(p3.getArrey())
console.log(p4)
console.log(p5)






