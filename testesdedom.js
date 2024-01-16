const c1 = document.getElementById('c1')
c1.addEventListener('click', (parametro)=>{
    const deondeveio = parametro.target
    deondeveio.classList.add("destaque")
    
})