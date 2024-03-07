const div1 = document.querySelector("#div1")
const enviar = document.querySelector("#button")

let cursos = ["Java Script", "Html","css"]
const removendo = ()=>{
    cursos.push("bola")
    
}

enviar.addEventListener("click",()=>{
    removendo()
    criarDivs()
    console.log(cursos)
    
})

let arrey_cursos = [...cursos]

const criarDivs = ()=>{
    div1.innerHTML=""

    cursos.map((el)=>{
        const curso = document.createElement("div")
        curso.setAttribute("class","cursos")
        curso.innerHTML=el
        div1.appendChild(curso)
        console.log(div1)
        curso.addEventListener("click",(evt)=>{
            console.log(evt.target.nextSibling)
        })
    })

}

criarDivs()


