public class AcessoCatraca {
  
    private static int totalAcesso; //atributo estatico -> naa depende das caracteristicas de cada objeto - invodados sem instancia de classe - tarefa comum a todos os objetos
    
    private String nome;
    
    public void entrar(String nome){
      this.nome = nome;
      totalAcesso = totalAcesso + 1;
    }
    
    public static int recuperarTotal(){ //metodo estatico -> naa sefere ao objeto mas a classe, portanto, compartilhara o mesmo valor em todos os objetos
      return totalAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}