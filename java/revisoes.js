let filmes = [
    [
        {
        titulo: 'acao',
        descricao: 'matador'
        },
        {
        titulo: 'acao 2',
        descricao: 'matadores'
         }
    ],
    [
        {
            titulo: 'terror',
            descricao: "sangrento"
        }
    ]
]



const  pesquisarPorNome =(nome)=>{
    let armazenaNome ="";
    for(i = 0;i < filmes.length; i++){
        filmes[i].map((el,ind)=>{
            if(nome === el.titulo){
                armazenaNome = `Nome: ${el.titulo} e indice ${ind}`;            }
        })
        
        
        i++;
    }
    console.log(armazenaNome)
}

pesquisarPorNome("acao");



