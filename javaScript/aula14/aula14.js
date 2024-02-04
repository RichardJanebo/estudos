let data = new Date()
let dia = 10
let diaAtual

switch (dia){
    case 0:
        diaAtual = "Domingo"
        break
    case 1:
        diaAtual = "Segunda"
        break
    case 2 : 
        diaAtua = "Terça"
        break
    case 3 :
        diaAtual = "quarta"
        break
    case 4 : 
        diaAtual = "Quinta"
        break
    case 5 : 
        diaAtual = "Sexta"
    case 6 :
        diaAtual = "Sabado"
        break
    default:
        console.log("O dia é invalido")
}

console.log(`O dia de hoje é ${diaAtual}`)