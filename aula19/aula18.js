/*let x = 1
let y = 1000
while(x <= y){
    console.log(x)
    if(x  >= 10){
        break
    }
    x++
}
console.log(x)*/
let num1 = 0
let max = 1000
for (i = 0;i < max;i++){
    if(i%2!=0){
        continue
    }
    num1++
}
console.log(num1)
