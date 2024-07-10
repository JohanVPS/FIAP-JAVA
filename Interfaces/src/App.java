public class App {
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario();
        if (user.login("admin", "1234")) {
            System.out.println("Login bem-sucedido!");
            user.logou();
        } else {
            System.out.println("Falha no login.");
        }

        //----------------------------------------------------
  
        Corredor avestruz = new Avestruz();
        
        if (avestruz instanceof Corredor){//verifica se objeto é do tipo da classe ou da interface
            System.out.println("É um corredor");
        }else{
            System.out.println("Não é um corredor");
        }
    }
}
