"use strict"

function vernome(){
    let nome = "Bruno"
    if (true){
        console.log(`Variavel declarada no if dentro da função ${nome}`)
    }
    console.log(`Variavel declarada dentro da função ${nome}`)

}
vernome()
console.log(`Variavel declarada fora do escopo da função ${nome}`) 

const numer = 10 //Não pode mais ser mudada

