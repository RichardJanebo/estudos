let nome = new String("Richard")


console.log(nome.startsWith("i")) //Verifica se a string começa com essa letra

console.log(nome.endsWith("rd")) //Verifica se a string ternina com essa letra 

console.log(nome.includes("char")) //Verifica se na string tem essas formação

console.log(nome.repeat(4)) //Repete a string uma determinda string quantas vezes estiver no campo

let codigos = []
for (j in nome.split("")){
    codigos.push(nome.charCodeAt(j))
}

console.log(String.fromCodePoint(...codigos))

let irma = "Rayanne"
let c = []

for (j in irma.split("")){
    c.push(irma.charCodeAt(j))

}
console.log(String.fromCodePoint(...c))

