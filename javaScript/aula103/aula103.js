let nome = new String("Richard")
let nome2 = new String("Richarqd")
let perssonagem  = new String("Elvis")

let l = "Bom dia"

console.log(l.slice(2,6))



console.log(nome.localeCompare(nome2)) //Retorno 0 As String são iguais, Se o retorno for -1 a strig comparada é maior e 1 é quando a string comparada é menor

console.log(nome.replace("d","D")) //Busca o elemento d e troca pelo D maiusculo

console.log(nome.search("i")) //Retorna a posição da letra

console.log(nome.slice(0,6)) //Recorta um recorte da string


console.log(nome.substring(0,6))

console.log(nome.substr(2,3))

console.log(nome.toUpperCase()) //Transforma a string em maiuscula
console.log(nome.toLowerCase()) //Transforma a string em minuscula
console.log(nome.valueOf())


let num = 10
let z = 0

let numeros  =Number(num.toString().concat(z.toString())) 
console.log(numeros + 200)






