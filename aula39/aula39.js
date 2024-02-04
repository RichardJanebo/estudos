const caixa1 = document.querySelector('#div1')
const caixa2 = document.querySelector('#div2')

const cursos = [...document.querySelectorAll('.curso')]
const filha = document.querySelector('#filha')





console.log(caixa1.firstElementChild)
console.log(caixa1.lastElementChild)
console.log(caixa1.getRootNode())
console.log(caixa1.children.length > 0 ? "Possui filhos" : "Não possui filhos")
caixa1.children[2].innerHTML='Ola mundo'
console.log(filha.parentElement)
