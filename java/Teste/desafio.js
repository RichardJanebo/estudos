const input_name = document.querySelector("#nome_produto");
const input_descricao = document.querySelector("#descricao_produto");
const input_preco = document.querySelector("#valor_produto");
const input_disponivelVenda = document.querySelector("#disponivel_venda");
const btn_cadastrar = document.querySelector("#cadastrar");
const form = document.querySelector("#form");

form.addEventListener("click", (el) => {
    el.preventDefault();
})



btn_cadastrar.addEventListener("click", () => {
    cadastrar(input_name.value, input_descricao.value, input_preco.value, input_disponivelVenda.value);
})

const cadastrar = (input_name, input_descricao, input_preco, input_disponivelVenda) => {
    if (input_name == "" || input_descricao == "" || input_preco == "" ) {
        alert("Por favor Preencha todos os campos")
    } else {
        let meusProdutosSalvos = JSON.parse(localStorage.getItem('meusProdutos')) || [];

        meusProdutosSalvos.push({
            "nome": input_name,
            "descricao": input_descricao,
            "preco": parseFloat(input_preco),
            "disponibilidade": input_disponivelVenda != "Sim" ? true : false
        })


        localStorage.setItem("meusProdutos", JSON.stringify(meusProdutosSalvos))
        form.reset();
        window.location.href = "./meusProdutos.html"


    }

}






