public class ContaCorrente extends Conta {
    private String tipo;
    private double chequeEspecial;

    public ContaCorrente(int numero, String tipo){
        super(numero);//se nao houver necessidade de passagem de parametro no super, o java omite o execucao do metodo caso o mesmo nao seja explicitado
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel(){
        return getSaldo() + this.chequeEspecial;
    }

    @Override //sobrescrevendo metodo de retirar da superclasse
    public void retirar(double valor){
        valor += 10;
        super.retirar(valor);//chamando metodo de retirar da superclasse passando por parametro o valor acrescido da taxa especifica necessaria para contas do tipo conta corrente
    }
}
