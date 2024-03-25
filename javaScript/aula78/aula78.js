let data = new Date()
const exibir =  document.querySelector("#exibir")
const botao = document.querySelector("#botao")
const divData = document.querySelector("#div_data")
const relogio = document.querySelector("#relogio")


// console.log(data)
// console.log(data.getDate()) //Dia do mes
// console.log(data.getFullYear()) //Ano
// console.log(data.getHours()) // hora
// console.log(data.getMinutes()) // Minutos
// console.log(data.getSeconds())// Segundos
// console.log(data.getDay()) //Dia da semana em numeros


let diaMes = data.getDate()
diaMes = diaMes<10?"0"+diaMes:diaMes

let mes = data.getMonth()
mes = mes<10?"0"+mes:mes

const datas = diaMes+"/"+mes+"/"+data.getFullYear()


divData.innerHTML=datas




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













// console.log(Date.now()) //Timestamp
