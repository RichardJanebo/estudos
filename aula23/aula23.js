function calculo(...valores){
    let n = valores.length
    let res = 0

   for (j of valores){
    res = res + j
   }
    return res
}
console.log(calculo(10,10,10,10,20,100))