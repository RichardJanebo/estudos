const string = "Richard"
const numero = 15 
const boleano = true
const objs = {}


console.log(typeof(string))
console.log(typeof(numero))
console.log(typeof(boleano))
console.log(typeof(objs))

//Tipos de declarações de variaveis


var   testeDeVar  = "Variavel var"
const testeDeConst = "Variavel const"
let testeDeLet = "Variavel let"

console.log(testeDeVar)
console.log(testeDeConst)
console.log(testeDeLet)

// Testando escopo 
if (boleano == true){
    let testeDeEscopoLet = 10
    const testeDeEscopoConst = 10
    var testeDeEscopoVar = 10
}

console.log(testeDeEscopoVar)

// Testando constante
// testeDeConst = 45  Da erro 

     //Operadores Matematicos
let num1 = 10
let num2 = 10
let num3 = 30

console.log(num1+num2) // Adição 
console.log(num1-num2) // Subrtação
console.log(num1*num2) // Multiplicação
console.log(num1/num2) // Divisão
console.log(num1**num2)// Potencia
console.log(num1%num2) // Resto da divisão

   //Operadores Logicos 
if(num1 + num2 == 20 && num1 - num2 == 0){
    console.log("condição do e satisfeita")
}
if(num1 + num2 == 20 || num1 * num2 == 10){
    console.log("Condição do ou satisfeita")
}
if(num1 + num2 == 20 && !(num1 % num2 == 1) ){
    console.log("condição não satisfeita")
}

    // Operadores Relacionais 
if(num1 < num3 || num3 == num1 ){
    console.log("Menor que , Igual a ")
}
if(num1 != 30){
    console.log(`${num1} é diferente de 30`)
}
if(num3 >= 30 ){
    console.log(`${num3} é maior igual a 30`)
}
if(num1 >= num2){
    console.log(`${num1} é maior ou igual a ${num2}`)
}

// Indentificando qual dispositivo esta rodando o codigo

if(navigator.userAgent.match(/Android/i)){
    console.log("O codigo esta sendo rodado em um dispositivo android")
}

// Operadores BitWise 

function base10Parabase2(el) {
    let bit = []
    let divisao = el

    while (divisao != 1) {
        if (divisao % 2 != 0) { //Se for impar
            bit.push(1)
            divisao = divisao / 2
            divisao = Math.trunc(divisao)
        } else if (divisao % 2 == 0) {
            divisao = divisao / 2
            bit.push(0)
        }
        if (divisao == 1) {
            bit.push(1)
        }
        console.log(divisao)
    }
    return bit
}

let total = base10Parabase2(5).reverse().toString()
let bitwise = total.replace(/,/g, "")
console.log(bitwise)


