const f_texto = document.querySelector("#f_texto")
const btn_texto = document.querySelector("#btn_texto")
const p_texto = document.querySelector("#p_texto")

btn_texto.addEventListener("click",()=>{

})

let num = 10
localStorage.setItem("nome","Richard")
localStorage.setItem("curso","Java Script")
localStorage.setItem("numero",num)
localStorage.clear()
// alert(localStorage.length)

sessionStorage.setItem("nome","Richard")