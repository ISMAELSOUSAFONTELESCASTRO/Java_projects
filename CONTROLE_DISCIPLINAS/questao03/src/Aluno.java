public class Aluno {
    private String Nome;
    private int Matricula;
    private double[] Nota = new double[2];

    public Aluno(String Nome, int Matricula){
        this.Nome = Nome;
        this.Matricula = Matricula;

    }

    void setNome(String Nome){
        this.Nome = Nome;
    }
    void setMatricula(int Matricula){
        this.Matricula = Matricula;
    }
    void setNota(int n, double nota){
        if(n == 1 || n == 0){
            this.Nota[n] = nota;
        }
    }



    String getNome(){
        return this.Nome;
    }
    int getMatricula(){
        return this.Matricula;
    }
    double getNota(int n){
        return this.Nota[n];
    }

    double CalcularMedia(){
        return (this.Nota[0] + this.Nota[1])/2;
    }




}
