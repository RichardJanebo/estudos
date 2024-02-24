// Contador de vogais 

let vogal = ["a","e","i","o","u"]

let palvra = "JavaScript"

function vowelConter(palvra){
    let letras = palvra.split("")
    let contador = 0

    for (j of letras){
        for(n of vogal)
        if (j === n){
            contador ++

        }
    }
    return contador
}
console.log(vowelConter(palvra))


