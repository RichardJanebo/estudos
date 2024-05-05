let idadades = [10,25,68,12,24,33,13,55,7,17]

idadades = idadades.filter((el)=>{
    return el >18

})
console.log(idadades)


class Carro{
    constructor(p){
        this.portas = p
        this.cor = "Amarelo"
    }
}

class Camaro extends Carro{
    constructor(s){
        super(s)
    }
}

