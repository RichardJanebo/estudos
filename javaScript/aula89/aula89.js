const enviar = document.querySelector("#enviar")

enviar.addEventListener("click",()=>{
    const table = document.querySelector("#table").innerHTML;

    let estilo = "<style>"
    estilo += "table{width:100%}; font:25px Calibri;}"
    estilo += "table, th, td {border: solid 2px #888: border-colapse: collapse;"
    estilo += "padding:4px 8px;text-aling: center;}"
    estilo += "</style>"

    const win = window.open("","", "height=700,width=700")
    win.document.write("<html>")
    win.document.write("<header>")
    win.document.write("<title>Aprendendo a criar um PDF</title>")
    win.document.write(estilo)
    win.document.write("</header>")
    win.document.write("<body>")
    win.document.write(table)
    win.document.write("</body></html>")
    
    win.print()
})