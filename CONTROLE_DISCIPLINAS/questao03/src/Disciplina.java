import java.util.ArrayList;

public class Disciplina {
    private int Codigo;
    private String Nome;
    private int Q_max;
    private ArrayList<Aluno> Alunos = new ArrayList<>();


    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }
    public void setNome(String Nome){
        this.Nome = Nome;
    
    }
    public void setQ_max(int Q_max){
        this.Q_max = Q_max;
    }
    public int getCodigo() {
        return Codigo;
    }
    public String getNome() {
        return Nome;
    }
    public int getQ_max() {
        return Q_max;
    }
    public ArrayList<Aluno> getAlunos() {
        return Alunos;
    }

    void setNewAluno(Aluno aluno){
        if(this.Alunos.size() < this.Q_max){
            this.Alunos.add(aluno);
        }else{
            System.err.println("ERRO");
        }
    }
    void setAlunoNota(int Matricula, double nota, int n){
        for(int i = 0;i< this.Alunos.size();i++){
            if(this.Alunos.get(i).getMatricula() == Matricula){
                this.Alunos.get(i).setNota(n, nota);
                break;
            }
            else if(i == this.Alunos.size() -1){
                System.err.println("ERRO");
            }
        }
    }
    
}
