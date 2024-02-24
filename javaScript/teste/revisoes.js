function palavra(el){
    let p = el.split("").reverse().join("")

    console.log(p)
    console.log(el)
    return el === p
    


}

console.log(palavra("ovo"))