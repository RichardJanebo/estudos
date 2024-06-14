import React from "react";
import logoImg from "../../assets/images/logo.png"
import './style.css'

export class NavBar extends React.Component {
    render() {
        return (
            <header>
                <nav id="nav-brnad">
                    <div >
                        <img src={logoImg} alt="Imagem" />
                        <h1>Space Flight News</h1>
                    </div>
                    <ul>
                        <li><a href="/">Home</a></li>
                        <li><a href="/">Trending</a></li>
                        <li><a href="/">Categories</a></li>
                        <li><a href="/">About us</a></li>
                    </ul>
                </nav>

            </header>
        )

    }
}


