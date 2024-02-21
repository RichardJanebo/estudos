const caixa = document.getElementById("caixa")

const setColection = new Set()

setColection.add("musica")
setColection.add("comida")
setColection.add("musica")



setColection.forEach((el)=>{
    
    console.log(el);
})
console.log(setColection.entries());

let num = [10,20,30,40,10,20,22,36,22]

let arr = [...new Set(num)]
console.log(arr.length)