const caixa1 = document.getElementById('div1')
const caixa2 = document.getElementById('div2')
const butao  = document.getElementById('botao')

const cursos = [...document.getElementsByClassName('curso')]
cursos.map((el)=>{
    el.addEventListener('click',(s)=>{
        let selecionar = s.target
        selecionar.classList.toggle('destaque')
    })
})

butao.addEventListener('click',()=>{
    let selecionados = [...document.getElementsByClassName('destaque')]
    selecionados.map((el)=>{

        caixa2.appendChild(el)
    })
})