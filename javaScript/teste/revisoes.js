const text = document.querySelector("#texto")
const botao = document.querySelector("#botao")




let podeIr = false

const promisse = new Promise((deuCerto,deuc)=>{
    podeIr = true

        setTimeout(()=>{
            if(podeIr = true){
                deuCerto("Deu certo ")
                
            }else{
                deuc("Não puxou")
            }
            
        },3000)
    

    
})

botao.addEventListener("click",()=>{
    
    promisse.catch((retorno)=>{
        console.log(retorno)
    })
    promisse.then((retorno)=>{
        console.log(retorno)
    })
    

})