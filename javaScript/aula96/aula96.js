import database from "./mudolo96.js"

const text_name = document.querySelector("#text_name")
const text_number = document.querySelector("#text_number")
const text_email = document.querySelector("#text_email")
const salvar = document.querySelector("#salvar")
const bd = document.querySelector("#data")


const salvarNoBanco = (n,t,e)=>{
    database.push({
        nome:n,
        telefone:t,
        email:e,
    })
    mostrarNoArrey()
    

}


const mostrarNoArrey = ()=>{
    bd.innerHTML=""

    database.map((el)=>{
        const div = document.createElement("div")
        div.setAttribute("class","div_d")
        div.innerHTML=`Nome:${el.nome} </br> Telefone:${el.telefone} </br> ${el.email}`
        bd.appendChild(div)

        
        div.addEventListener("click",()=>{
            removerdoarrey(el)
        })

        

    })
}


const removerdoarrey = (el)=>{
    database.pop()
    // database.filter((e)=>{
    //     if(el != e){
    //         return e
    //     }

    // })

    mostrarNoArrey()
    console.log(database)
}



salvar.addEventListener("click",()=>{
    salvarNoBanco(text_name.value,text_number.value,text_email.value)
    cleanForm()
})

const cleanForm = ()=>{
    text_email.value = ""
    text_name.value  = ""
    text_number.value= ""
}





