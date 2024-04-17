const botao = document.querySelector("#btn_url")
const input_url = document.querySelector("#url")
const forumlario = document.querySelector("#forumlario")

botao.addEventListener("click",(evt)=>{
    //  window.location.replace("https://www.youtube.com/") //Deleta a url corrente do historico
    // window.location.assign("htttps://www.google.com") Não deleta aa utl do historico
    // window.location.reload() recarrega a pagina
    // window.location="https://www.gooogle.com"
    // window.history.forward() Vai para proxima pagina salva no historico

    window.location=input_url.value
    console.log(input_url.value)
    eventoDoForm()
    
})

const eventoDoForm = ()=>{
    forumlario.addEventListener("submit",(evt)=>{
        evt.preventDefault()
    })

}