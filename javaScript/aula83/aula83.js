const divControls = document.querySelector("#controls")
const p = document.querySelector("#num_objects")
const inputQtde = document.querySelector("#txt_qtde")
const btnAdd = document.querySelector("#btn_add")
const btnRemover = document.querySelector("#btn_remove")
const stage = document.getElementById("stage")

let widthStage = stage.offsetWidth
let heightStage = stage.offsetHeight
let balls = []
let numBall = 0


class Bola{
    constructor(){
        this.tam = Math.round(((Math.random() * 10) + 10))
        this.r = Math.round((Math.random() * 255))
        this.g = Math.round((Math.random() * 255))
        this.b = Math.round((Math.random() * 255))
        this.px = Math.floor(Math.random() * (widthStage - this.tam))
        this.py = Math.floor(Math.random() * (heightStage - this.tam))
    }

}





window.addEventListener("resize",()=>{
    widthStage = stage.offsetWidth
    heightStage = stage.offsetHeight

    console.log(widthStage)
    
})


btnAdd.addEventListener("click",()=>{
    const quantidade = inputQtde.value

    
    

    for(let i = 0 ; i < quantidade;i++){
        let n = new Bola()
        const div = document.createElement("div")
        div.setAttribute("class","ball")
        
        stage.appendChild(div)
        


    }

})

btnRemover.addEventListener("click",()=>{
    balls.map((ele)=>{

        //Remover a Bolinha

    })

})
