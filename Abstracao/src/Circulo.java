public class Circulo {
  
    private final double NUMERO_PI = 3.1416;//final no atributo = atributo nunca muda seu valor
    
    private double raio;
    
    public final double calcularArea(){ //final no metodo = metodo nao pode ser sobrescrito
      return NUMERO_PI*raio*raio;
    }
  
    public double getRaio() {
      return raio;
    }
  
    public void setRaio(double raio) {
      this.raio = raio;
    }
    
  }
