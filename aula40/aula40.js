const caixa1 = document.querySelector('#div1')
const cursos = [...document.querySelectorAll('.curso')]

const todosOsCursos = ["Html","Css","JavaScript","Php","React","MySql","REact native","Python","RaspBary"]
todosOsCursos.map((el,i)=>{
    const novoElemento = document.createElement('div')
    novoElemento.setAttribute("class","curso")
    novoElemento.setAttribute("id","c" + (i+1))
    novoElemento.innerHTML=el
    caixa1.appendChild(novoElemento)        
})

