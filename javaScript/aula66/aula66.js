class npc{
    static alerta = false
    constructor(energy){
        this.energia = energy
    }

    info(){
        return `Alert :${npc.alerta} Energia:${this.energia} `
    
    }
}

const npc1 = new npc(100)


console.log(npc1.info())