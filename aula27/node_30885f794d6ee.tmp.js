/*function* generate(){
    yield "Vermelho"
    yield "Amarelo"
    yield "Azul"
}

let itc = generate()
console.log(itc.next().value)
console.log(itc.next().value)*/

/*function* perguntas(){
    let nome = yield "Qual é o seu nome ?"
    let esporte = yield "Qual é o seu esporte favorito ?"
    return `Ola ${nome} seu esporte favorito é o ${esporte}` 
}
let itc = perguntas()
console.log(itc.next().value)
console.log(itc.next('Richard').value)
console.log(itc.next('Futebol').value)*/

function* numeros(){
    let num = 0
    while(true){
        num++
    }
}

let itc = numeros()
for (j of itc){
    console.log(j)
}
console.log(itc.next().value)