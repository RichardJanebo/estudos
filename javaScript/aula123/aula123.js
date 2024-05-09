const p_temp = document.querySelector("#p_temp")
const p_nivel = document.querySelector("#p_nivel")
const p_press = document.querySelector("#p_press")
const btn_texto = document.querySelector("#btn_texto")




const obterDados = ()=>{
fetch("https://abd01f3c-3d08-44b0-91ab-6c7883d2cec2-00-2vpt2brpi66ct.kirk.replit.dev/")
.then(res=>res.json())
.then((data)=>{
    p_nivel.innerHTML=`Nivel:${data.nivel }`
    p_press.innerHTML = `Pressão:${data.pressao}`
    p_temp.innerHTML= `Temperatura:${data.temperatura}`
})
}




setInterval(obterDados,3000)