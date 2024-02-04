const caixa1 = document.querySelector('#div1')
const cursos = [...document.querySelectorAll('.curso')]

const todosOsCursos = ["Html","Css","JavaScript","Php","React","MySql","REact native","Python","RaspBary"]
todosOsCursos.map((el)=>{
    let btn_lixeira = document.createElement('img')
    btn_lixeira.setAttribute("src","lixeira.png")
    btn_lixeira.setAttribute("class","lixo")


    
    let c = document.createElement('div')
    c.innerHTML= el
    c.setAttribute("class","curso")
    caixa1.appendChild(c)
    c.appendChild(btn_lixeira)

    btn_lixeira.addEventListener("click",()=>{
        caixa1.removeChild(c)
    })
    


})