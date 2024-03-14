let n1 = 20
let n2 = 25


let k = [ 10,"Ola",30]

const aulas = {
    nome:"Java Script",
    materia:"objetos",
    aula:{
        aula01:"introdução",
        aula02:"desenvolvimento",
        aula03:"conclusão"

    }
}

if (n1 === n2){
    throw new TypeError("Deu erro")
}else{
    const convertString = JSON.stringify(aulas)
    const spread = [...k]
    console.log(k)
    console.log(spread)
    console.log(convertString)
}