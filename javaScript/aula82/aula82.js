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

console.log(widthStage)