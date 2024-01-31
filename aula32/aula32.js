const todosCursos = [...document.getElementsByClassName('curso')]
const cursoC1 = [...document.getElementsByClassName('c1')]
const cursoC2 = [...document.getElementsByClassName('c2')]


console.log(cursoC1)
console.log(cursoC2)
console.log(todosCursos)
todosCursos.map((el)=>{
    el.classList.add("destaque")
})
