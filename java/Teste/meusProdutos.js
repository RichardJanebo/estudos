const listaProdutos = document.querySelector("#listaProdutos");
const mostrarLista = document.querySelector("#mostrarLista");
const ordenacao = document.querySelector("#ordenacao");
const cadastro = document.querySelector("#cadastro");






cadastro.addEventListener("click", () => {
    window.location.href = "./index.html"
})


mostrarLista.addEventListener("click", () => {
    criarLista();
})


ordenacao.addEventListener("click", () => {
    ordenacaoPorNumero();
})

const criarLista = () => {
    listaProdutos.innerHTML = "";
    let meusProdutos = JSON.parse(localStorage.getItem('meusProdutos'));
    console.log(meusProdutos)
    meusProdutos.map((el) => {
        const div = document.createElement("div");
        const p = document.createElement("p");

        const lixeira = criarLixeira();


        div.setAttribute("class", "div_produto")
        div.appendChild(p);
        div.appendChild(lixeira);
        p.setAttribute("data-nome",el.nome)
        p.innerHTML = `Nome: ${el.nome} Valor: ${el.preco}`;
        listaProdutos.appendChild(div);
    })
}


const criarLixeira=()=>{
    const lixeira = document.createElement("span");
        lixeira.setAttribute("class", "material-symbols-outlined");
        lixeira.innerHTML = "delete";

        lixeira.addEventListener("click",({target})=>{excluir(target)});
        return lixeira;
}



const ordenacaoPorNumero = () => {
    listaProdutos.innerHTML = "";
    let meusProdutos = JSON.parse(localStorage.getItem('meusProdutos'));
    meusProdutos.sort((a, b) => a.preco - b.preco);
    meusProdutos.map((el) => {
        const div = document.createElement("div");
        const lixeira = criarLixeira();
        div.setAttribute("class", "div_produto");
        div.innerHTML = `Nome: ${el.nome} Valor: ${el.preco}`;
        listaProdutos.appendChild(div);
    })

}

const excluir =(elemento)=>{
    console.log(elemento.parentNode.firstChild.dataset.nome)
    let meusProdutos = JSON.parse(localStorage.getItem('meusProdutos'));
    meusProdutos = meusProdutos.filter((el)=>{
        if(el.nome != elemento.parentNode.firstChild.dataset.nome){
            return el;
        }
    })
    localStorage.setItem("meusProdutos", JSON.stringify(meusProdutos))
    criarLista();
    

}






window.addEventListener("load", () => {
    criarLista();
})