// let at = document.createElement("div")
// at.setAttribute("id","Ola")
const body = document.getElementById("body")

let  altura = body.offsetHeight


console.log(altura)


window.addEventListener("resize",()=>{
    let largura = body.offsetWidth
    console.log(largura)
    
})
let controls = false



const Nave =  function(energia){
    
    this.energia = energia
    this.disparos = 10
    Nave.prototype.vidas = 3 
    
}


let c = new Nave(100)

let ener = c.energia



const f = function(n,m){
    return(n+m)
    
}

console.log(f(10,10))

let numero_1 = 10
let numero_2 = 3000

console.log(numero_1++)






let promessa = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        controls = true
        if(controls == true){
            resolve("Deu certo")
        }else{
            reject("Deu errado")
        }

       
        
    },numero_2)

    
    

})


.then((retorno)=>{
    console.log(retorno)
})
.catch((retorno)=>{
    console.log(retorno)
})


console.log(10+10)

const sim = ()=>{
    let n = 10.5
    console.log(Math.floor(n))
}

sim()






let set = new Set()

set.add("palmeiras")
set.add("corintias")
set.add("são paulo")
set.add("flamengo")
set.add("santos")
set.add("são paulo")
set.add("flamengo")

set.delete("palmeiras")

console.log(set)



class Pessoa{
    constructor(pnome){
        this.nome = pnome
        this.endereço = pnome
        this.telefone = pnome
    }
}

const p1 = new Pessoa("Richard")
const P2 = new Pessoa("Rua das agulhas negras n 813")
const p4 = new Pessoa(6795552994499929)

console.log(p1.nome)
console.log(P2.endereço)
console.log(p4.telefone)



const map =new Map()
map.set("curso","javaScript")
map.set("corrida","Velozes e furiosos")

console.log(map.get("curso"))



//detectando qual dispositivo esta rodando o codigo 
const text = document.querySelector("#texto")

const click = document.querySelector("#botao")
click.addEventListener("click",()=>{
    if(navigator.userAgent.match(/Android/i)){
      alert("celular")
    }else{
        alert("pc")
    }

    navigator.clipboard.writeText(text.value)
    

    
})
let j = 10

while(j >= 1){
    console.log(j)
    j--
    if(j == 5){
        break
    }
}


