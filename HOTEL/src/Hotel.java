import java.util.ArrayList;
public class Hotel {
    private double diaria;
    private boolean cfdm;
    private ArrayList<Quarto> qvagos = new ArrayList<>();
    private float nota;

    public Hotel(double diaria, boolean cfdm, ArrayList<Quarto> qvagos, float nota){
        this.diaria = diaria;
        this.cfdm = cfdm;
        for(int i = 0; i < qvagos.size(); i++){
            this.qvagos.add(qvagos.get(i));
        }
        this.nota = nota;
    }

    public double getDiaria() {
        return this.diaria;
    }
    public float getNota() {
        return this.nota;
    }
    public ArrayList<Quarto> getQvagos() {
        return this.qvagos;
    }
    public boolean getCfdm(){
        return this.cfdm;
    }


    public void setCfdm(boolean cfdm) {
        this.cfdm = cfdm;
    }
    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public void setQvagos(ArrayList<Quarto> qvagos) {
        for(int i = 0; i < qvagos.size(); i++){
            this.qvagos.add(qvagos.get(i));
        }
    }

    public int ocuparQuarto(int quarto){
        for(int i = 0; i < this.qvagos.size();i++){
            if(this.qvagos.get(i).getNumero() == quarto){
                
            }
        }
    }




}
