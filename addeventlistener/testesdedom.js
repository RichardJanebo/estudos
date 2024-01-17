const caixa1 = document.getElementById('caixa1')
const caixa2 = document.getElementById('caixa2')
const botao =  document.getElementById('btn_copiar')
const todosCursos = [...document.getElementsByClassName('curso')]

todosCursos.map((el)=>{
    el.addEventListener('click', (evt)=>{
        const cursos = evt.target
        cursos.classList.toggle('selecionado')
    })
})
botao.addEventListener('click',()=>{
    const cursoSelecionado = [...document.getElementsByClassName('selecionado')]
    cursoSelecionado.map((el)=>{
        caixa2.appendChild(el)
    })

})

