public class ItemDeCompra {
    private long Codigo;
    private String Nome;
    private double Preco;
    private int Q_Comprada;

    public ItemDeCompra(long Codigo, String Nome, double Preco, int Q_Comprada){
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Preco = Preco;
        this.Q_Comprada = Q_Comprada;
    }

    void setCodigo(long Codigo){
        this.Codigo = Codigo;
    }
    void setNome(String Nome){
        this.Nome = Nome;
    }
    void setPreco(double Preco){
        this.Preco = Preco;
    }
    void setQ_Comprada(int Q_Comprada){
        this.Q_Comprada = Q_Comprada;
    }

    long getCodigo(){
        return this.Codigo;
    }
    String getNome(){
        return this.Nome;
    }
    double getPreco(){
        return this.Preco;
    }
    int getQ_Comprada(){
        return this.Q_Comprada;
    }

    double Calcular_Total(){
        return this.Preco*this.Q_Comprada;
    }
