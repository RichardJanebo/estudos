function cadastro(nome,nota=0){
    this.nome = nome 
    this.nota = nota

    this.contador = function(){
        setTimeout(() => {
            this.nome = "X"
            this.nota = 10
            console.log(this.nome)
            console.log(this.nota)
        },2000);
    }
}
const al1 = new cadastro('Richard', 10)
al1.contador()