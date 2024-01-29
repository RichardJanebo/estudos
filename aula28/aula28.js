/*let cursos = ['Java script', "Html", "Css", "Php"]
cursos.map((el,i)=>{
    el.length
    console.log(cursos[i])

})*/
/*let cursos = [...document.getElementsByTagName("div")]
cursos.map((el)=>{
    el.innerHTML="veio do map"

})*/


let num = ['1','2','3','4'].map((e)=>
    parseInt(e*2)
)
console.log(num)