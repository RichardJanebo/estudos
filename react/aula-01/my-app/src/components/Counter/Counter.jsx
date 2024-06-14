import React from "react";

export class Counter extends React.Component{
    constructor(){
        super()
        
        // this.contador = 0;
        this.state = { 
            contador : 0,
            nome :'',
            password:'',

        };
    }
    

    render(){
        return(
            <div style={{marginTop: '20px',marginLeft:'1rem'}}>
                <h1>{this.state.contador}</h1>

                <div>
                    <button onClick={()=>{this.setState({contador : this.state.contador - 1})}}>Diminuir</button>
                    <button onClick={()=>{this.setState({contador : this.state.contador + 1})}}>Aumentar</button>
                </div>

                <form style={{marginTop:'40px'}} onClick={(el)=>{el.preventDefault()}}>
                    <input type="text" placeholder="nome" value={this.state.nome} onChange={({target})=>{this.setState({nome : target.value})}}/>
                    <input type="password" placeholder="senha" value={this.state.password} onChange={({target})=>{this.setState({password : target.value})}}/>
                    <button onClick={()=>{console.log(this.state.password)}}>Enviar</button>
                </form>
            </div>
        )
    }
}