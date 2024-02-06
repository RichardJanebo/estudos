const arrCursos = ["html","Css","javaScript","Php","REact","MySql","ReactNative"]
const caixa1 = document.querySelector('#caixaDeFuncionalidades')
const caixa2 = document.querySelector('#caixaCursos')
const btn_cursosSelecionados = document.querySelector('#btnCursosSelecionados')
const btn_RemoverCursos = document.querySelector('#btnRemoverCursos')

arrCursos.map((el,chave)=>{
    const cursos = document.createElement('div')
    cursos.setAttribute("id","c"+ chave)
    cursos.setAttribute("class","curso c1")
    cursos.innerHTML=el

    const comandos =document.createElement("div")
    comandos.setAttribute("class","comandos")
    
    const rb=document.createElement("input")
    rb.setAttribute("type","radio")
    rb.setAttribute("name","rb_curso")

    comandos.appendChild(rb)

    cursos.appendChild(comandos)
    caixa2.appendChild(cursos)

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
    
    const curosSelecionados = rs.parentNode.parentNode.firstChild.textContent
    console.log(curosSelecionados)
    alert(curosSelecionados)

    console.log(todosElementosRadio)
    console.log(radioSelecionado)
 })
 btn_RemoverCursos.addEventListener("click",(el)=>{
    const rs = radioSelecionados()
    const cursoParaRemover = rs.parentNode.parentNode


    caixa2.replaceChildren(cursoParaRemover)
 })

