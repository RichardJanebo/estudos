const nome = Symbol()
const numero = Symbol()
const corUniforme = Symbol()


const Jogador = {
    [nome] :"Pelé",
    [numero]:10,
    [corUniforme]:"Amarelo"

}

for(j in Jogador){
    console.log(j)
}

console.log(Jogador[numero])