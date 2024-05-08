const f_nome = document.querySelector("#f_nome")
const f_nota = document.querySelector("#f_nota")
const f_msg = document.querySelector("#f_msg")

document.querySelector("btn_validar").addEventListener("click",(evt)=>{
    let estadoValidação = f_nota.validity

    if(estadoValidação.valueMissing){
        f_nota.setCustomValidity("Este campo é obrigadorio") // Esse tipo de comando ja não funciona mais pq o proprio frm ja faz essas validações no required
    }




    f_msg.innerHTML=v
    



    evt.preventDefault()


})