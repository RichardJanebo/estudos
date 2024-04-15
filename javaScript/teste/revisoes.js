let numero = [10,20,30,40,50]


const pesquisarUmNumero = (a)=>{
    let indice = 0
    numero.filter((el,i)=>{
        if (el == a){
            indice = i

        }

    })
    return indice

}

const res = pesquisarUmNumero(20)

console.log(res)