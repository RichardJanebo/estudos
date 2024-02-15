//  

for (i= 0 ; i < 10; i++){
    console.log("ola")
}
const arrey_numerico = [12, 2, 10, 6, 5, 98]
const receber =arrey_numerico.some((el,i)=>{
    if(el < 18){
        console.log(`O elemento ${i} não esta em conformidade`)
    }
    return el > 18

   
})
if ( receber == true){
    console.log("Tudo certo")

}