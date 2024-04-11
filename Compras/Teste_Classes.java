public class App {
    public static void main(String[] args){
        Compra compra = new Compra();
        ItemDeCompra item = new ItemDeCompra(99999, "Cebola", 6.00, 1000);
        ItemDeCompra item1 = new ItemDeCompra(99998, "Banana", 10.00, 1000);
        compra.InserirItemCompra(item);
        compra.InserirItemCompra(item1);
        
        System.out.println(compra.gerarRelatorio(25));
    }
}
