public class Usuario implements Autenticavel{
  
    @Override
    public boolean login(String usuario, String senha) {
      return "admin".equals(usuario) && "1234".equals(senha);
    }
  
    @Override
    public void logou() {
        System.out.println(MSG_LOGOUT);
      
    }
  
}
