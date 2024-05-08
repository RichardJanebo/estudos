const f_nome = document.querySelector("#f_nome")
const f_nota = document.querySelector("#f_nota")
const f_msg = document.querySelector("#f_msg")

document.querySelector("btn_validar").addEventListener("click",(evt)=>{
    let v = null

    if(!f_nota.checkValidity()){
        v = f_nota.ariaInvalidationMessage
    }




    f_msg.innerHTML=v
    



    evt.preventDefault()


})