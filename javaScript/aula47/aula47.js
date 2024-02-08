const arrCursos = ["html", "Css", "javaScript", "Php", "REact", "MySql", "ReactNative"]
const caixa1 = document.querySelector('#caixaDeFuncionalidades')
const caixa2 = document.querySelector('#caixaCursos')
const btn_cursosSelecionados = document.querySelector('#btnCursosSelecionados')
const btn_RemoverCursos = document.querySelector('#btnRemoverCursos')
const addCursoAntes = document.querySelector("#btnAdicionarNovosCursos")
const addCursoDepois = document.querySelector("#adicionarD")
const texto = document.querySelector("#texto")


const tirarSelecao = () => {
    const curosSelecionados = [...document.querySelectorAll(".selecionado")]
    curosSelecionados.map((el) => {
        el.classList.remove("selecionado")
    })

}




let indice = 0
const criarNovoCurso = (el) => {                  //cria o curso
    const cursos = document.createElement('div')
    cursos.setAttribute("id", "c" + indice)
    cursos.setAttribute("class", "curso c1")
    cursos.innerHTML = el
    cursos.addEventListener("click", (ele) => {
        const selecionado = ele.target
        tirarSelecao()
        selecionado.classList.toggle("selecionado")
    })
    return cursos

}

arrCursos.map((el, chave) => {
    const cursos = criarNovoCurso(el)
    caixa2.appendChild(cursos)
    indice++

})


const cursoSelecionados = () => {
    const curosSelecionados = [...document.querySelectorAll(".selecionado")]
    return curosSelecionados[0]
}
btn_cursosSelecionados.addEventListener("click", (event) => {
    const rs = cursoSelecionados()
    const curSelecionados = rs
    console.log(curSelecionados)
    alert(curSelecionados.textContent)

})
btn_RemoverCursos.addEventListener("click", (el) => {
    const rs = cursoSelecionados()
    if (rs === undefined) {
        alert("Você precisa selecionar um ")
    }

    const cursoParaRemover = rs


    caixa2.removeChild(cursoParaRemover)
})

addCursoAntes.addEventListener("click", (el) => {
    const rs = cursoSelecionados()
    if (rs === undefined) {
        alert("Você precisa selecionar um ")
    }

    const cursosSelecionados = rs
    const cursos = criarNovoCurso(texto.value)
    caixa2.insertBefore(cursos, cursosSelecionados)
})

addCursoDepois.addEventListener("click", (el) => {
    const cursos = criarNovoCurso(texto.value)
    caixa2.insertBefore(cursos, cursoSelecionados().nextSibling)
})



