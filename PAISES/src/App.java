import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Pais pais = new Pais("Estados Unidos", "Washington", 9833520L);
        //System.out.println(pais.getNome());
        //System.out.println(pais.getCapital());
        //System.out.println(pais.getDimensao());
        ArrayList<Pais> paises = new ArrayList<>();
        paises.add(new Pais("Mexico", "Mexico", 1972550L));
        paises.add(new Pais("Canada", "Otawa", 9984670L ));
   
        pais.setPaises_Fronteirissos(paises);
 
        for(int i = 0; i < pais.getSize(); i++){
            for(int j = 0; j < 2; j++){
                System.out.println(pais.getPaises_Fronteirissos_info().get(i)[j]);
            }
            System.out.println();
        }

      
        


    }
}
