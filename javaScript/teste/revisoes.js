//Revisão dia 27/02/2024

class pessoa{
    constructor(pnome, pautura){
        this.nome = pnome 
        this.altura = pautura
    }
}

let p1 = new pessoa("Richard","1.70")
console.log(p1.nome)

const setColection = new Set()

setColection.add("JavaScript")
setColection.add("Php")
setColection.add("Laravvel")
setColection.add("Laravvel")


setColection.forEach((el,i)=>{
    console.log(el)

})

let funcArr = [
    (n1,n2)=>{ 
    return n1+n2
    }
]

console.log(funcArr[0](10,10))