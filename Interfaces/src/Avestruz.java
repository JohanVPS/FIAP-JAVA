public class Avestruz implements Corredor{
  
    @Override
    public void parar() {
      System.out.println("Avestruz parando...");
    }

    @Override
    public void correr(int velocidade){
        System.out.println("Avestruz correndo...");
    }

}
