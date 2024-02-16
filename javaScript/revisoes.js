const idadades = [10,25,68,12,24,33,13,55,7,17]

const are = idadades.filter((el)=>{

    return el > 18
})
console.log(are)

let num = 0
while (num < 10){
    num ++
    console.log(num)
}
const div = document.querySelector("#div1")
console.log(div.childNodes)
// const paragrafo = document.createElement("p")
// div.before(paragrafo)

const someMetodo =idadades.some((el)=>{
    return el > 18
})
console.log(someMetodo)

function* geradora(){
    yield "ola"
    yield "teste"
}
const gerar = geradora()
console.log(gerar.next().value)
console.log(gerar.next().value)

const nume = ["Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado" ]
let j = 0
for (j in nume){
    
}
console.log(j)
idadades.reduce((anterior, atual , iterador)=>{
    // console.log(atual)
    console.log(anterior)


})
const i = idadades.every((el)=>{
    return el > 18 
})
console.log(i)

const laza = "lazanhad"
switch (laza){
    case  "lazanha":
        console.log("Prato certo")
    break
    case "Cebola" : 
    console.log("prato errado")
    break

    default :
    console.log("Não temos esse prato")
}

const funConstrutora = new Function ("n1","n2","return n1 + n2")
console.log(funConstrutora(10,10))