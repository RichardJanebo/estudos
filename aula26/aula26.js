const somar = (...valores)=>{
    const soma =  val =>{
        let res =0
        for (j of val){
            res = res + j
           
        }
        return res
    }
    return soma(valores)


}
console.log(somar(10,20,30))
