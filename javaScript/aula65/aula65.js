const aulas = {
    nome:"Java Script",
    materia:"objetos",
    aula:{
        aula01:"introdução",
        aula02:"desenvolvimento",
        aula03:"conclusão"

    }
}



const converteToJson =  JSON.stringify(aulas) //Converte o objeto em string Json

const string = '{"nome":"Java Script","materia":"objetos","aula":{"aula01":"introdução","aula02":"desenvolvimento","aula03":"conclusão"}}'

const convertToObject = JSON.parse(string) // Converte um Json em objeto


console.log(convertToObject)