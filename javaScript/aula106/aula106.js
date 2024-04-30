let nome = "Joãoooo dao silva 1979"
let email ="jão@jão.com.br"
let numeros = "1 10 100 1000 10000"

console.log(nome.match(/a/ig))

console.log(nome.match(/[os]/ig))

console.log(nome.match(/[a-j|0-9]/ig)) //Retorna todas as letras de a "a" a "j" dentro da string



//----------------Meta caracteres ----------------------------------------------
console.log(nome.match(/\d/ig)) //Retorna somente os numeros
console.log(nome.match(/\s/ig)) //Retorna os espaços
console.log(nome.match(/\bs/ig)) //Retorna se tem esse cacactere dentro da string

//-----------------Qualificadores ----------------------------------------------
console.log(numeros.match(/10+/ig))
console.log(numeros.match(/10*/ig))
console.log(numeros.match(/10/ig))
console.log(numeros.match(/10?/ig))