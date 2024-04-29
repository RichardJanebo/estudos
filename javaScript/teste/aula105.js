const nome = new String("Rrichard JaNeBo")


console.log(nome.toUpperCase().search("JANEBO"))

console.log(nome.search(/janebo/i)) // As duas barras cim o i desativam o case Sensitive

console.log(nome.match(/r/ig)) //Desse jeito busca todos os "r" sem case Sensitive e de forma geral

console.log(nome.replace(/janebo/i,"Murdok"))


let arrey = []
nome.split("").map((el, i) => { if (el === "R" ||el ==="r") { arrey.push(el.charCodeAt()) } })
console.log(arrey)
