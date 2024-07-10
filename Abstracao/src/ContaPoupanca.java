public final class ContaPoupanca extends Conta { //modificador final na classe = ela nao pode ser mae de nenhuma subclasse
  
    @Override
    public double verificarSaldo() {
      return saldo;
    }
}
//
