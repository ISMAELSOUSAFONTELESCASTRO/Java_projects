public class Compra {
    ItemDeCompra[] iCompra = new ItemDeCompra[5];
    int n = 0;
    
    

    boolean InserirItemCompra(ItemDeCompra item){
        try{
            this.iCompra[this.n] = item;
            this.n +=1;
            return true; 
        }
        catch(ArrayIndexOutOfBoundsException oob){
            return false;
        }
    }

    double TotalCompra(){
        int soma = 0;
        for(int i = 0; i < this.n; i++){
            soma += this.iCompra[i].Calcular_Total();
        }

        return soma;
    }

    double darDesconto(double percent){
        return this.TotalCompra()*percent/100;
    }

    double calcularTotalFinal(double percent){
        return this.TotalCompra()*(1 - percent/100);
    }

    String gerarRelatorio(double num){
    
        String relatorio = "CUPOM FISCAL\n\n";
        String item_info = "";
        for (int i = 0; i < this.n; i++) {
            item_info += "Nome do item:" + this.iCompra[i].getNome() + '\n';
            item_info += "Codigo do item:" + this.iCompra[i].getCodigo() + "     ";
            item_info += "Preço do item:" + this.iCompra[i].getPreco() + '\n';
            item_info += "Quantidade do item:" + this.iCompra[i].getQ_Comprada() + "\n\n";

        }
        relatorio += item_info;
        relatorio += "DESCONTO" + "    " +String.format("%.2f", this.darDesconto(num)) + "\n\n";
        relatorio += "TOTAL" + "    " + String.format("%.2f", this.calcularTotalFinal(num)) + "\n\n";


        

        return relatorio;
    }

    
    
}
