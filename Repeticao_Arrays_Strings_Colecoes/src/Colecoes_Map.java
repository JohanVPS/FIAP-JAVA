import java.util.HashMap;

public class Colecoes_Map {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        HashMap mapa = new HashMap();

        mapa.put("RM1234", "Thiago");
        mapa.put("RM4321", "João");

        System.out.println(mapa);
        System.out.println(mapa.get("RM1234"));
        
        mapa.remove("RM1234");
        
        System.out.println(mapa.get("RM1234"));
    }
}
