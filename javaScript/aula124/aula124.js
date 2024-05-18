const p_temp = document.querySelector("#p_temp")
const p_nivel = document.querySelector("#p_nivel")
const p_press = document.querySelector("#p_press")
const btn_texto = document.querySelector("#btn_texto")

let endPoint = "https://abd01f3c-3d08-44b0-91ab-6c7883d2cec2-00-2vpt2brpi66ct.kirk.replit.dev/"
// fetch(endPoint)
// .then((resposta)=>{ return resposta.json()}
// )
// .then((resposta)=>{
//     console.log(resposta)
//     p_temp.innerHTML=`Temperatura ${resposta.temperatura}`
//     p_press.innerHTML=`Pressão ${resposta.pressao}`
//     p_nivel.innerHTML=`Nivel ${resposta.nivel}`
// })

let pessoa = {
    nome:"Richard",
    idade:20,
    cor:"Parda"
}



let cabecalho = {
    method:"POST",
    body:JSON.stringify(pessoa)
}

function post(){
    fetch(endPoint,cabecalho)
    .then((resposta)=>{
        return resposta.json()
    })
    .then((resposta)=>{
        console.log(resposta)
    })
}

btn_texto.addEventListener("click",()=>{
    post()
})