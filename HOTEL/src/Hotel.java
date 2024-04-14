import java.util.ArrayList;
public class Hotel {
    private double diaria;
    private boolean cfdm;
    private ArrayList<Integer> qvagos = new ArrayList<>();
    private float nota;

    public Hotel(double diaria, boolean cfdm, ArrayList<Integer> qvagos, float nota){
        this.diaria = diaria;
        this.cfdm = cfdm;
        for(int i = 0; i < qvagos.size(); i++){
            this.qvagos.add(qvagos.get(i));
        }
        this.nota = nota;
    }
}
