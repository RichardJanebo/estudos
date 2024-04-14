// const somaDoisNumeros = (a,b)=>{
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve(a + b)
//         },2000)
//         reject("Deu errado")
//     })
    
// }

// somaDoisNumeros(20,20)
// .catch((resultado)=>{
//     console.log(resultado)
// })




// .then((resposta)=>{
//     const recebeu = resposta.json().then(body=>
//         body.slip
//     )

//     console.log(recebeu)
  
  
// })
// .catch((resposta)=>{
//     console.log(resposta)
// })

async function buscarFrases (){
    const response = await fetch("https://api.adviceslip.com/advice")
    .then((r)=>{r.json().then((b)=>{console.log(b.slip.advice)})})

}

buscarFrases()
