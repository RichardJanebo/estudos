let numeros = [10,20,30,40,50,60,70]
const res = document.querySelector("#res")
const text = document.querySelector("#texto")
const botao = document.getElementById("botao")
const h1 = document.getElementById("h1")


numeros.map((el)=>{
    const create = document.createElement("div")
    create.innerHTML=el
    h1.appendChild(create)
})

botao.addEventListener("click",()=>{
    numeros.find((ele,i)=>{
        if (ele == text.value){
            res.innerHTML= `O valor pesquisado foi o ${ele} e ele esta na posição ${i+1}`
        }else{
        
        }
    })


})