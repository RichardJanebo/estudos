const botao = document.querySelector("#botao")
const res = document.querySelector("#res")

botao.addEventListener("click",()=>{
    testedecaso(0)
})


const testedecaso = (e)=>{
    switch (e){
        case 1: 
        res.innerHTML=`Foi digitado o ${e}`
        break
    default:
        res.innerHTML=`Nenhum Parametro identificado`
    }
}

