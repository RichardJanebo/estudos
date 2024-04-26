let database = []

const text_name = document.querySelector("#text_name")
const text_number = document.querySelector("#text_number")
const text_email = document.querySelector("#text_email")
const salvar = document.querySelector("#salvar")
const bd = document.querySelector("#data")





const mostrarNoArrey = () => {
    bd.innerHTML = ""

    database.map((el) => {
        const div = document.createElement("div")
        div.setAttribute("class", "div_d")
        div.innerHTML = `Nome:${el.nome} </br> Telefone:${el.telefone} </br> ${el.email}`
        bd.appendChild(div)


        div.addEventListener("click", () => {
        removerDo(el)            

            
        })



    })
}






salvar.addEventListener("click", () => {
    salvarNoBanco(text_name.value, text_number.value, text_email.value)
    mostrarNoArrey()
    cleanForm()
    console.log(database)
})

const cleanForm = () => {
    text_email.value = ""
    text_name.value = ""
    text_number.value = ""
}


let removerDo= (el)=>{
    database = database.filter((e) => {
                
        if (el != e) {
            return el
        }

    })


    mostrarNoArrey()

}

const salvarNoBanco = (n, t, e) => {
    database.push({
        nome: n,
        telefone: t,
        email: e,
    })


}






