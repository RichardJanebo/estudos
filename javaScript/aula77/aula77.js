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










// console.log(Date.now()) //Timestamp
