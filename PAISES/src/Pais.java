import java.util.ArrayList;

public class Pais {
    private String Nome;
    private String Capital;
    private long Dimensao;
    private ArrayList<Pais> Paises_Fronteirissos = new ArrayList<>();

    public Pais(String Nome, String Capital, long Dimensao) {
        this.Nome = Nome;
        this.Capital = Capital;
        this.Dimensao = Dimensao;
    }

    String getNome() {
        return this.Nome;
    }

    String getCapital() {
        return this.Capital;
    }

    long getDimensao() {
        return this.Dimensao;
    }

    void setNome(String Nome) {
        this.Nome = Nome;
    }

    void setCapital(String Capital) {
        this.Capital = Capital;
    }

    void setDimensao(long Dimensao) {
        this.Dimensao = Dimensao;
    }

    boolean equals(Pais outro) {
        return this.Nome.equals(outro.getNome()) && this.Capital.equals(outro.getCapital());
    }

    int getSize() {
        return this.Paises_Fronteirissos.size();
    }

    void setPaises_Fronteirissos(ArrayList<Pais> Paises) {
        for (Pais pais : Paises) {
            if (!this.Paises_Fronteirissos.contains(pais) && !this.equals(pais)) {
                this.Paises_Fronteirissos.add(pais);
            }
        }
    }

    ArrayList<String[]> getPaises_Fronteirissos_info() {
        ArrayList<String[]> paises = new ArrayList<>();
        for (Pais pais : this.Paises_Fronteirissos) {
            String[] pais_info = new String[2];
            pais_info[0] = pais.getNome();
            pais_info[1] = pais.getCapital();
            paises.add(pais_info);
        }
        return paises;
    }
}
