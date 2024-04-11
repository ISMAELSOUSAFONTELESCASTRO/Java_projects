public class Estado {
    
    private String Nome;
    private String Sigla;
    private double VMAlcool;
    private double VMGasolina;

    public String getNome() {
        return Nome;
    }
    public String getSigla() {
        return Sigla;
    }
    public double getVMAlcool() {
        return VMAlcool;
    }
    public double getVMGasolina() {
        return VMGasolina;
    }


    public void setNome(String nome) {
        this.Nome = nome;
    }
    public void setSigla(String sigla) {
        this.Sigla = sigla;
    }
    public void setVMAlcool(double vMAlcool) {
        this.VMAlcool = vMAlcool;
    }
    public void setVMGasolina(double vMGasolina) {
        VMGasolina = vMGasolina;
    }

    public String MaisVantajoso(){
        if(this.VMAlcool >= 0.7*this.VMGasolina){
            return this.Nome + " " + this.Sigla + "\n" + "Alcool";
        }
        else{
            return this.Nome + " " + this.Sigla + "\n" + "Alcool";
        }
    }
