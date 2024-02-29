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
    constructor(pnome,pportas,blindagem,municao){
        super(pnome,pportas)

        this.blindagem = blindagem
        this.municao = municao
        this.setCor("verde")
    }
    atirar(){
        if(this.municao > 0 ){
            this.municao-- 
            console.log("pei,pei")
        }
    }

}


class utilitario extends carro{
    constructor(pnome,pportas,lugares){
        super(pnome,pportas)

        this.lugares = lugares

        if (lugares => 5 ){
            this.velocidade = 100
        }

    }
}


const c1 = new carro("Normal", 4)
c1.setCor("Branco") 
c1.ligar()

const c2 = new militar("lutador",1, 50, 10)


const c3 = new utilitario("Vectra",4,5)








c2.atirar()

console.log(`Nome:${c1.nome}`)
console.log(`Portas ${c1.portas}`)
console.log(`ligado:${(c1.ligado?"Sim":"Não")}`)
console.log(`Velocidade:${c1.vel}`)
console.log(`Cor:${c1.cor}`)
console.log("-----------------------------------")
console.log(`Nome:${c2.nome}`)
console.log(`Portas ${c2.portas}`)
console.log(`ligado:${(c2.ligado?"Sim":"Não")}`)
console.log(`Velocidade:${c2.vel}`)
console.log(`Cor:${c2.cor}`)
console.log(`Blindagem : ${c2.blindagem}`)
console.log(`Munição : ${c2.municao}`)
console.log("-----------------------------------")
console.log(`Nome: ${c3.nome}`)
console.log(`Portas ${c3.portas}`)
console.log(`Lugares : ${c3.lugares}`)
console.log(`Velocidade: ${c3.velocidade}`)





