const todosOsCursos = ["Html","Css","JavaScript","Php","React","MySql","REact native","Python","RaspBary"]
const div1 = document.getElementById("div1")

todosOsCursos.map((el)=>{
    const novoElemento = document.createElement("div")
    novoElemento.innerHTML=el
    div1.appendChild(novoElemento)
})

const f = function(n,m){
    return n + m
}
console.log(f(10,10))  // Função anonima 

 const cursos = new Map([["carro","civic"]


])

 cursos.set("curso","Java Script")


console.log(cursos.get("curso"))
console.log(cursos.get("carro"))

const freeCodeCampBlog = new Map([
    ['nome', 'freeCodeCamp'],
    ['tipo', 'blog'],
    ['autor', 'Tapas Adhikary'],
  ]);

  console.log(freeCodeCampBlog.get("autor"))

