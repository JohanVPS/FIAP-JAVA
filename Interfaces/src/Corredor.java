public interface Corredor {
  
    void correr(int velocidade); //metodo abstrato, precisa ser implementado na classe
  
    default void parar(){ //metodo concreto necessita do modificador default - herdados pelas classes
      System.out.println("Parando..");
    }
  
    static void acelerar(){//metodo estatico pertence a interface e nao pode ser sobrescrito pela classe. Nao necessita instancia de objeto para ser utilizado
      System.out.println("Acelerando");
    }
}
