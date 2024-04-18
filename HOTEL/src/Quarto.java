public class Quarto {
    private int numero;
    private int dias;

    public Quarto(int numero, int dias){
        this.numero = numero;
        this.dias = dias;
    }
    public Quarto(int numero){
        this.numero = numero;
    }

    public int getDias() {
        return dias;
    }
    public int getNumero() {
        return numero;
    }


    public void setDias(int dias) {
        this.dias = dias;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    void subDias(){
        this.dias -=1;
        if(this.dias < 0){
            this.dias = 0;
        }
    }

    void zerarDias(){
        this.dias = 0;
    }



}
