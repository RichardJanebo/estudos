function calcular(...valores){
    let soma = 0

    for (j of valores){
        soma = soma + j
    }
    return soma
}
console.log(calcular(10,20,30,40,50))