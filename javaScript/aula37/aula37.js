const caixa1 = document.querySelector('#div1')
const div1 = document.querySelector('#c1')
const cursos = [...document.querySelectorAll('.curso')]
cursos.map((el)=>{
    el.addEventListener('click',(evt)=>{
        evt.stopPropagation()
    })

})

caixa1.addEventListener('click',(el)=>{
    console.log('clicou')
    console.log(el.target)
    
    
    

})
div1.addEventListener('click',(el)=>{
    el.stopPropagation()
      
})

