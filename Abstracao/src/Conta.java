public abstract class Conta {
	protected double saldo;
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor > saldo){
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}

  public abstract double verificarSaldo(); //metodo abstrato - nao possui implementacao - termina em ;

}
