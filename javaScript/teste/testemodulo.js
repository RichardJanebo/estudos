let arrey = [10,20,30,40]

const eleminar = (e)=>{
    arrey = arrey.filter((el)=>{
        if(e != el){
            return el
        }
    
    })
    console.log(arrey)
    
    }

export {eleminar}