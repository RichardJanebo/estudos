class Jogador {
    constructor(nome) {
        this.nome = nome
        this.id = Symbol()
    }
}

let jogadores = [new Jogador("jogador 2"), new Jogador("jogador 2"), new Jogador("jogador 2"), new Jogador("Jogador 4"), new Jogador("Jogador 5"), new Jogador("Jogador 5 ")]

let s = []

let simbolojogadores = jogadores.filter((j) => {
    return j.nome == "jogador 2"

})

s = simbolojogadores.map((j) => {
    return j.id

})



let indice = 0
while (s.length > indice) {
    jogadores = jogadores.filter((elemento) => {
        if (s[indice] != elemento.id) {
            return elemento
        } 

    })
    indice++
}







console.log(simbolojogadores)
console.log(s)
console.log(jogadores)


