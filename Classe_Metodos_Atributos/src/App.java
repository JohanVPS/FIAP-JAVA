public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta();
		cc.depositar(50);
		cc.setAgencia(123);
		cc.setNumero(321);

		cc.depositar(100);

		System.out.println(cc.getSaldo());

		Conta poupanca = new Conta(111,222,1000);

		poupanca.retirar(50);

		System.out.println(poupanca.getSaldo());
    }
}