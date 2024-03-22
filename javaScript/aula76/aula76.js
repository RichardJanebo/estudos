const numero = document.getElementById("numero")
const btn_promessa = document.querySelector("#promessa")

btn_promessa.addEventListener("click",()=>{
    console.log(promessa())
    .then((retorno) => {
        numero.innerHTML = retorno
        numero.classList.remove("erro")
        numero.classList.add("ok")
    })
    
    .catch((retorno) => {
        numero.innerHTML = retorno
        numero.classList.remove("ok")
        numero.classList.add("erro")
    })
})


const promessa = ()=>{
    numero.innerHTML="Processando..."
    let promise = new Promise((resolve, regect) => {
        let resultado = true
        let tempo = 3000
        setTimeout(() => {
            if (resultado) {
                resolve("Deu certo")
            } else {
                regect("Deu tudo errado")
            }
        }, tempo)
    })
    
    return promise
}

numero.innerHTML = "Eperando..."
