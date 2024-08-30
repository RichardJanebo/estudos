console.time('tempoTotal');

function concatString(tamanho) {
    const textoMap = new Map();

    for (let i = 0; i < tamanho; i++) {
        textoMap.set(i, i);
    }

    let resultado = '';
    textoMap.forEach((value) => {
        resultado.concat(value)
    });

    return resultado;
}

let resultado = concatString(100000);  // Número de iterações


console.log(resultado);
console.timeEnd('tempoTotal');