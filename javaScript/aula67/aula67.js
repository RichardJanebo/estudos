const Nave = function(energia){
    this.energia = energia
    this.desparos = 20


}

const n1 = new Nave(100)

Nave.prototype.disparar = function(){
    if(this.desparos > 1){
        this.desparos --
    }
}

console.log(n1.energia)
console.log(Nave)

n1.disparar()


n1.disparar()
console.log(n1.desparos)


Nave.prototype.vidas = 3
