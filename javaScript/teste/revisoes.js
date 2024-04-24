class Cursos {
    constructor(u,v){
        this.velocidade = u
        this.altura = v
    }
}

class Animal extends Cursos{
    constructor(l,n,j){
        super(l,n)
        this.stong = j
    }

}

const m = new Animal(10,20,30)

console.log(m)
