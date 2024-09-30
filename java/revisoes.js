function pularAnuncio() {
    let botaoPular = document.querySelector('.ytp-skip-ad-button');

    if (botaoPular && botaoPular.style.display !== 'none') {
        botaoPular.click();
        console.log("Anúncio pulado!");
    } else {
        console.log("Botão de pular ainda não disponível.");
    }
}

setInterval(pularAnuncio, 1000);