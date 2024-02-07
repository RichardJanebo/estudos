const arrCursos = ["html","Css","javaScript","Php","REact","MySql","ReactNative"]
const caixa1 = document.querySelector('#caixaDeFuncionalidades')
const caixa2 = document.querySelector('#caixaCursos')
const btn_cursosSelecionados = document.querySelector('#btnCursosSelecionados')
const btn_RemoverCursos = document.querySelector('#btnRemoverCursos')
const addCursoAntes = document.querySelector("#btnAdicionarNovosCursos")
const addCursoDepois = document.querySelector("#adicionarD")
const texto = document.querySelector("#texto")


let indice = 0
const criarNovoCurso = (el)=>{                  //cria o curso
    const cursos = document.createElement('div')
    cursos.setAttribute("id","c"+ indice)
    cursos.setAttribute("class","curso c1")
    cursos.innerHTML=el

    const comandos =document.createElement("div")
    comandos.setAttribute("class","comandos")

    const rb=document.createElement("input")
    rb.setAttribute("type","radio")
    rb.setAttribute("name","rb_curso")

    comandos.appendChild(rb)
    cursos.appendChild(comandos)
    return cursos

}

arrCursos.map((el,chave)=>{
    const cursos = criarNovoCurso(el)

   
    caixa2.appendChild(cursos)
    indice ++

})


const radioSelecionados = ()=>{
    const todosElementosRadio = [...document.querySelectorAll("input[type=radio]")]
    const radioSelecionado = todosElementosRadio.filter((el)=>{
        return el.checked

    })
    return radioSelecionado[0]
}
 btn_cursosSelecionados.addEventListener("click",(event)=>{
    const rs = radioSelecionados()
    if (rs === undefined){
        alert("Você precisa selecionar um ")
    }
    
    const curosSelecionados = rs.parentNode.parentNode.firstChild.textContent
    console.log(curosSelecionados)
    alert(curosSelecionados)

    console.log(todosElementosRadio)
    console.log(radioSelecionado)
 })
 btn_RemoverCursos.addEventListener("click",(el)=>{
    const rs = radioSelecionados()
    if (rs === undefined){
        alert("Você precisa selecionar um ")
    }
    
    const cursoParaRemover = rs.parentNode.parentNode


    caixa2.removeChild(cursoParaRemover)
 })

addCursoAntes.addEventListener("click",(el)=>{
    const rs = radioSelecionados()
    if (rs === undefined){
        alert("Você precisa selecionar um ")
    }
    
    const cursosSelecionados = rs.parentNode.parentNode
    const cursos = criarNovoCurso(texto.value)
    caixa2.insertBefore(cursos,cursosSelecionados)

    
   

})
addCursoDepois.addEventListener("click",(el)=>{
    const rs = radioSelecionados()
    if (rs === undefined){
        alert("Você precisa selecionar um ")
    }
    
    const cursosSelecionados = rs.parentNode.parentNode
    const cursos = criarNovoCurso(texto.value)
    caixa2.insertBefore(cursos,cursosSelecionados.nextSibling)
})



