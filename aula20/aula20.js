function mudar_texto(){
    let divs = [...document.getElementsByTagName("div")]
    divs.map((el)=>{
        el.innerHTML="Mudou o nome"
    })

}
let botao = window.document.getElementById('botao')
botao.addEventListener('click',()=>{
    
    mudar_texto()
    
})



