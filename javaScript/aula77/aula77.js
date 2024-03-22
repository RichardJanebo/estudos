let data = new Date()
const exibir =  document.querySelector("#exibir")
const botao = document.querySelector("#botao")

// console.log(data)
// console.log(data.getDate()) //Dia do mes
// console.log(data.getFullYear()) //Ano
// console.log(data.getHours()) // hora
// console.log(data.getMinutes()) // Minutos
// console.log(data.getSeconds())// Segundos
// console.log(data.getDay()) //Dia da semana em numeros

const datas = data.getDate()+"/0"+data.getMonth()+"/"+data.getFullYear()

botao.addEventListener("click",()=>{
    exibição()

})


const exibição = ()=>{
    let promessa = new Promise((aceito,reject)=>{
        let tempo = 3000
        let resultado = true
    
        setTimeout(() => {
        
            if (resultado) {
                aceito(data.getDate()+"/0"+data.getMonth()+"/"+data.getFullYear())
            } else {
                reject("Deu tudo errado")
            }
           

        }, tempo)  
       
    })
    promessa.then((retorno)=>{
        exibir.innerHTML=retorno
    })

    promessa.catch((retorno)=>{
        exibir.innerHTML=retorno
    })


}








// console.log(Date.now()) //Timestamp
