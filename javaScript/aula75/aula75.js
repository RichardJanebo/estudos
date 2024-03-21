const numero = document.getElementById("numero")

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

promise.then((retorno) => {
    numero.innerHTML = retorno
    numero.classList.remove("erro")
    numero.classList.add("ok")
})

promise.catch((retorno) => {
    numero.innerHTML = retorno
    numero.classList.remove("ok")
    numero.classList.add("erro")
})


numero.innerHTML = "processando..."
