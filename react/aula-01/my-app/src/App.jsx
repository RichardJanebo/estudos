import React from "react";
import { NavBar } from "./components/NavBar/Navbar";
import { Article } from "./components/Article/Article";
import './styles/App.css'

import nasaImg from './assets/images/nasa.png'
import vibranteImg from './assets/images/vibrante.png'
import daysImg from './assets/images/36days.png'
import { Counter } from "./components/Counter/Counter";


class App extends React.Component {
  render() {
    return (
      <>
        <NavBar/>
        <Counter/>
        {/* <section id="articles">
        <Article title="Designing Dashboards" provider="NASA" description="Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud ame" image={nasaImg}/>

        <Article title="Vibrant Portraits of 2020" provider="SpaceNews" description="Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet." image={vibranteImg}/>

        <Article title="36 Days of Malayalam type" provider="Spaceflight Now" description="Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud ame" image={daysImg}/>
        
        <Article title="Designing Dashboards" provider="NASA" description="Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet." image={nasaImg}/>


        </section> */}

      </>
    );
  }
}

export default App;
