public class Aluno {

    int Matricula;
    String Nome;
    float Nota1, Nota2, Nota3;
    int Faltas;
    
    public void setMatricula (int matricula){
        Matricula = matricula;
    }
    public int getMatricula (){
        return Matricula;
    } 

    public void setNome (String nome){
        Nome = nome;
    }
    public String getNome (){
        return Nome;
    } 

    public void setNota1 (float nota1){
        Nota1 = nota1;
    }
    public float getNota1 (){
        return Nota1;
    } 
    public void setNota2 (float nota2){
        Nota2 = nota2;
    }
    public float getNota2 (){
        return Nota2;
    } 
    public void setNota3 (float nota3){
        Nota3 = nota3;
    }
    public float getNota3 (){
        return Nota3;
    } 

    public void setFaltas (int faltas){
        Faltas = faltas;
    }

    public int getFaltas (){
        return Faltas;
    }

}


