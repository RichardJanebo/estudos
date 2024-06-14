import React from "react";

export class Counter extends React.Component {
    constructor(){
        super();
        console.log("Construindo a classe Counter")
    }

    componentDidMount(){
        console.log("O componet foi montado ✅")
    }
    
   
    render() {
        console.log("Renderizando o componente counter")
        return (
            <div>
                <h1>0</h1>
                <button>Diminuir</button>
                <button>Aumentar</button>
            </div>
        );
    }
}