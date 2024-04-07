let n = 10
let fat = 1

while (n > 1){
    fat = fat * n
    console.log(fat)
    n--
}

const aulas = {
    nome:"Java Script",
    materia:"objetos",
    aula:{
        aula01:"introdução",
        aula02:"desenvolvimento",
        aula03:"conclusão"

    }
}

console.log(JSON.stringify(aulas))