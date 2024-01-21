let original = [10,20, 30]
let copiaSemspread = original
let copiaComspread = [...original]
copiaComspread.push(10)
copiaSemspread.push(20)



console.log(original, typeof(original))
console.log(copiaSemspread, typeof(copiaSemspread))
console.log(copiaComspread, typeof(copiaComspread))
console.log("--------------------------------------")

let m = [10,20,30,40]
let m1 = [10,20,30,40]
console.log(...m,...m1)
console.log('--------------------------------------')
let jogador1 = {nome:"Richard", magia:10 ,velocidade:500}
let jogador2 = {nome:"osvaldin", magia:10 }
let jogador3 = {...jogador1,...jogador2 }
console.log(jogador3)
console.log("--------------------------------------")

const soma = (n1,n2,n3)=>{
    return n1 + n2 + n3
}

let numm =[10,10,10]

console.log(soma(...numm))