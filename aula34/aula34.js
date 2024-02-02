const curso1 = [...document.getElementsByClassName('c1')]

curso1.map((el)=>{
    el.addEventListener('click',(u)=>{
        let sele = u.target
        sele.classList.toggle('destaque')
        console.log(el.className + "Foi clicado")
    })
})