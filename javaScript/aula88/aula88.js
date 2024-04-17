const btn_alert = document.querySelector("#btn_alert")
const btn_confirm = document.querySelector("#btn_confirm")
const btn_prompt = document.querySelector("#btn_prompt")


btn_alert.addEventListener("click",(evt)=>{
    window.alert("Ola como voce esta ?")

})

btn_confirm.addEventListener("click",(evt)=>{
const confirmacao =     confirm("Ola como vc esta")
switch (confirmacao){
    case true: alert("A Pessoa esta bem")
    break 
    case false : alert("A Pessoa não esta bem")
}    
    
})

btn_prompt.addEventListener("click",(evt)=>{
let nome =   window.prompt("Qual é o seu nome","Digite se nome aqui")
if (nome == null){
    alert("Por favor Precisamos de um nome")
    nome =   window.prompt("Qual é o seu nome")
}


alert(`Òla ${nome} Gostaria de testar os outros botões da pagina`)
    
})