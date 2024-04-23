import { cursos } from "./modulo.js";
import {carros} from "./modulo.js"


const objetos =document.querySelector("#objetos")


cursos.map((el)=>{
    const div = document.createElement("div")
    div.innerHTML=el
    div.setAttribute("style","background-color:red; margin-botton:10px;color:white;")
    objetos.appendChild(div)
})


console.log(carros)

console.log(cursos)