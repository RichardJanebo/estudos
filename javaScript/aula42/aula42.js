
const idadades = [10,25,68,12,24,33,13,55,7,17]

function deMaior(valor){
    if (valor > 18 ){
        return valor
    }
}



const maioDezoito = idadades.filter((el)=>{
    if (el > 18){
        return el
    }
})

const menorDeIdade = idadades.filter((el)=>{
    if (el < 18){
        return el
    }
})
console.log(idadades)
console.log(maioDezoito)
console.log(menorDeIdade)

