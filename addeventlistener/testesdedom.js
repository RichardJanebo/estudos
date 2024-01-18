const caixa1 = document.getElementById('caixa1')
const caixa2 = document.getElementById('caixa2')
const botao =  document.getElementById('btn_copiar')
const todosCursos = [...document.getElementsByClassName('curso')]

todosCursos.map((el)=>{
    el.addEventListener('click',(el)=>{
        const sele = el.target
        sele.classList.toggle("selecionado")
    })
})

botao.addEventListener('click', ()=>{
    const cursosSelecionados = [...document.getElementsByClassName('selecionado')]
    const cursosNaoselecionados = [...document.querySelectorAll('.curso:not(.selecionado)')]
    console.log(cursosNaoselecionados)
    cursosSelecionados.map((el)=>{
        caixa2.appendChild(el)
    })
    cursosNaoselecionados.map((el)=>{
        caixa1.appendChild(el)
    }) 
})

