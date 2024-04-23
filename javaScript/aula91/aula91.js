const objetos = document.querySelector("#objects")

let computador = {
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


const c1 = Object.assign(computador)
objetos.innerHTML=JSON.stringify(c1)


