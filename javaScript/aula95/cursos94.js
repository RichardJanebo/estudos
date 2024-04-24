class Cursos {
    static cursos = ["JavaScript","Html","Css","Arduino","Raspberry","C++","Python","C#"]
    constructor(){}

    static getTodosOsCursos(){
        return this.cursos
    }
    static getCurso(m){
        return this.cursos[m]
    }
    static addCurso(novo){
        this.cursos.push(novo)
    }
    static apagarCursos(){
        this.cursos = []
    }

}

export default Cursos

