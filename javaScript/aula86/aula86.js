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




class Bola {
    constructor(arreyballs, palco) {
        this.tam = Math.round(((Math.random() * 10) + 10))
        this.r = Math.round((Math.random() * 255))
        this.g = Math.round((Math.random() * 255))
        this.b = Math.round((Math.random() * 255))
        this.px = Math.floor(Math.random() * (widthStage - this.tam))
        this.py = Math.floor(Math.random() * (heightStage - this.tam))
        this.velx = Math.floor(Math.random() * 2) + 0.5
        this.vely = Math.floor(Math.random() * 2) + 0.5
        this.dirx = (Math.random() * 10) > 5 ? 1 : -1
        this.diry = (Math.random() * 10) > 5 ? 1 : -1
        this.palco = palco
        this.bolas = arreyballs
        this.id = Date.now() + "_" + Math.floor(Math.random() * 1000000000)
        this.desenhar()
        this.controls = setInterval(this.controlar, 10)
        this.eu = document.getElementById(this.id)
        numBall++
        p.innerHTML = numBall
    }

    minhaPos = () => {
        return this.bolas.indexOf(this)
    }

    removerBalls = () => {
        clearInterval(this.controls)
        balls = balls.filter((b) => {
            if (b.id != this.id) {
                return b
            }

        })
        this.eu.remove()
        numBall--
        p.innerHTML = numBall

    }


    desenhar = () => {
        const div = document.createElement("div")
        div.setAttribute("id", this.id)
        div.setAttribute("class", "ball")
        div.setAttribute("style", `left:${this.px}px;top:${this.py}px;width:${this.tam}px;height:${this.tam}px;background-color:rgb(${this.r},${this.g},${this.b})`)
        this.palco.appendChild(div)
    }
    colisao_bordas = () => {
        if (this.px + this.tam >= widthStage) {
            this.dirx = -1

        } else if (this.px <= 0) {
            this.dirx = 1

        } else if (this.py + this.tam >= heightStage) {
            this.diry = -1
        } else if (this.py <= 0) {
            this.diry = 1
        }

    }
    controlar = () => {
        this.colisao_bordas()
        this.px += this.dirx * this.velx
        this.py += this.diry * this.vely
        this.eu.setAttribute("style", `left:${this.px}px;top:${this.py}px;width:${this.tam}px;height:${this.tam}px;background-color:rgb(${this.r},${this.g},${this.b})`)

        if ((this.px > widthStage) || (this.py > heightStage)) {
            this.removerBalls()
        }

    }

}





window.addEventListener("resize", () => {
    widthStage = stage.offsetWidth
    heightStage = stage.offsetHeight

    console.log(widthStage)

})


btnAdd.addEventListener("click", () => {
    const quantidade = inputQtde.value
    for (let i = 0; i < quantidade; i++) {

        balls.push(new Bola(balls, stage))




    }

})

btnRemover.addEventListener("click", () => {
    balls.map((b) => {
        b.removerBalls()



    })

})



