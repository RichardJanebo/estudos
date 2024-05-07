const long = document.getElementById("long")
const lati = document.getElementById("lati")

if (navigator.geolocation){

    navigator.geolocation.getCurrentPosition(mostrarLocalização,erroDeLocalização)

}else{
    console.log("Geolocalização não suportada")
}

function mostrarLocalização(pos){
    console.log(pos)
    lati.innerHTML= `Latitude :${pos.coords.latitude}`
    long.innerHTML=  `Longitude :${pos.coords.longitude}`
}
function erroDeLocalização(){
    console.log("Não consegui puxar sua localização")
}
