let nome = "João Da Silva"

nome.replace("D","L")  //O primeiro parâmetro é substituido pelo segundo = João La Silva
nome.slice(0,4)      //Fatia a string entre o primero índice atribuído e o ultimo = João
nome = nome.split("")    // Separa a string em um arrey, com suas letras = 'J', 'o', 'ã','o'...
// nome.charAt(5)                  //Mostra qual letra esta no índice que foi atribuído= 'D'
// nome.toLowerCase()      //Deixa todos os caracteres da string minúsculo = 'joão da silva'
// nome.toUpperCase()      //Deixa todos os caracteres da string maiúsculo = 'JOÃO DA SILVA'
// nome.charCodeAt(5)                                   //Retorna o código do caractere = 68
// nome.indexOf("J")                      //Retorna o índice da primeira letra atribuída = 0
// nome.repeat(2)//Repete a string na quantidade de vezes atribuda = João Da Silva Jõao D...
// nome.valueOf()                      //Retorna o valor primitivo da string = João Da Silva
// nome.search("l")                          //Retorna o índice do caractere pesquisado = 10
// nome.includes("Silva")    //Verifica se existe o conteudo passado dentro da string = true
// nome.startsWith("João")   //Verifica se a string começa com os caracteres passados = true
// nome.endsWith("Silva")   //Verifica se a string termina com os caracteres passados = true

console.log(nome)