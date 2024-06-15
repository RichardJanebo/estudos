import React from "react";

export class Counter extends React.Component {
    constructor(){
        super();
        this.state={
            contador: 0
        };
        console.log("Construindo a classe Counter")
    }

    //Metodo chamado sempre que uma prop ou estado atualizar
    shouldComponentUpdate(){
        return true;
    }


    componentWillUnmount(){
        alert("O componete vai desmontar")
    }

    componentDidUpdate(){
        
    }
       
    render() {
        console.log("Renderizando o componente counter")
        return (
            <div>
                <h1>{this.state.contador}</h1>
                <button onClick={()=>{this.setState({contador : this.state.contador - 1})}}>Diminuir</button>
                <button onClick={()=>{this.setState({contador : this.state.contador + 1})}}>Aumentar</button>
            </div>
        );
    }
}
