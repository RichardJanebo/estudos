let data = new Date()
const exibir =  document.querySelector("#exibir")
const divData = document.querySelector("#div_data")
const relogio = document.querySelector("#relogio")
const conteudoInput = document.querySelector("#tmp_alarm")
const timer = document.getElementById("timer")
const horaAlarme = document.querySelector("#hora_alarme")
const btnAtivar = document.querySelector("#btn_ativar")
const btnDesativar = document.querySelector("#btn_desativar")


const somAlarme = new Audio("sound/clock-alarm-8761.mp3")

let tsAtual = null
let tsAlarme = null
let alarmeAtivado = false
let alarmeTocando = false

const atualizacao = ()=>{
    let dataAtual = new Date()

    let horas = dataAtual.getHours()
    horas=horas<10?"0"+horas:horas

    let minutes = dataAtual.getMinutes()
    minutes = minutes<10?"0"+minutes:minutes

    let segundos = dataAtual.getSeconds()
    segundos=segundos<10?"0"+segundos:segundos


    relogio.innerHTML=`${horas}:${minutes}:${segundos}`

}


const intervalo = setInterval(atualizacao,1000)


btnAtivar.addEventListener("click",()=>{
    tsAtual = Date.now()
    tsAlarme = tsAtual + (conteudoInput.value * 1000)
    alarmeAtivado = true
    const dtAlarme = new Date(tsAlarme)
    horaAlarme.innerHTML=`${dtAlarme.getHours()}:${dtAlarme.getMinutes()}:${dtAlarme.getSeconds()}`
    

    
})

btnDesativar.addEventListener("click",()=>{
    alarmeAtivado=false
    alarmeTocando = false
    horaAlarme.innerHTML=""

})













// console.log(Date.now()) //Timestamp
