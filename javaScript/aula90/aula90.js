const objetos = document.querySelector("#objects")

const computador = {
    cpu: "i9",
    ram: "64g",
    ssd: "1tb",

    info: function () {
        return `Cpu:${this.cpu} </br> Ram:${this.ram} </br>ssd:${this.ssd}`
    }
}

let computadores = [
    {
        marca: "positivo",
        cpu: "intel celerom",
        ram: "2g",
        hd: "500h"
    },
    {
        marca: "azus",
        cpu: "core i5",
        ram: "6g",
        ssd: "500g"
    },
    {
        marca: "Lg",
        cpu: "core i9",
        ram: "14g",
        ssd: "1tb"
    }
]

// console.log(computadores)


// objetos.innerHTML=JSON.stringify(computadores)




const removeItem = (m) => {
    computadores = computadores.filter((elemento) => {
        if (elemento != m) {
            return elemento
        }
    })
}



const criadorDeDiv = () => {
    objetos.innerHTML = ""
    computadores.map((el) => {
        const div = document.createElement("div")
        div.innerHTML = `Marca:${el.marca}</br>CPu:${el.cpu}</br> Ram:${el.ram}</br>Memoria:${el.ssd}</br> `


        div.addEventListener("mousemove", () => {
            removeItem(el)
            criadorDeDiv()
        })

        objetos.appendChild(div)
        console.log(el)

    })
    console.log(computadores)
}

criadorDeDiv()

