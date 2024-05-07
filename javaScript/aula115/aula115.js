let numeros = [10,20,30,40,50,60,70,90]


let [a,b,c,...d] =numeros

console.log(a)
console.log(b)
console.log(c)
console.log(d = d.filter((el)=>{
    return el < 90
}))

let obj ={
    nome:"Richard",
    cor:"Parda"
}
let {nome,cor} = obj
console.log(nome)
console.log(cor)

let cores = ()=>{
    return ["Amarelo", "Verde", "Vermelho",]

}

let [a1,a2,a3] = [...cores()]
console.log(a1)


let curso = "curso de javascript"

let [primeiraPalavra,SegundaPalavra,TerceiraPalavra] = curso.split(" ")

console.log(primeiraPalavra)
console.log(SegundaPalavra)
console.log(TerceiraPalavra)