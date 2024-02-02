const caixa1 = document.getElementById('div1')
const caixa2 = document.getElementById('div2')
const butao  = document.getElementById('botao')





const cursos = [...document.getElementsByClassName('curso')]
cursos.map((el)=>{
    el.addEventListener('click',(u)=>{
        let sele = u.target
        sele.classList.toggle('destaque')

    })
})

butao.addEventListener('click',()=>{
    let adicionado = [...document.getElementsByClassName('destaque')]
    console.log(adicionado)
    

})