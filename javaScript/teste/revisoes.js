class animais {
    constructor(patas){
        this.patas = patas
    
    if(this.constructor === animais){
        throw new TypeError("Esta classe não pode ser instanciada")
    }
}
}


class cachorro  extends animais{
    constructor(som){
        super(4)
        this.som = som
        if(this.som == "auau"){
            this.agua = true
        }
        
    }
}

cachorro.prototype.vida = 10

let c1 = new cachorro("auau")

let stringJson = JSON.stringify(c1)
console.log(c1)
console.log(stringJson)