
// import java.util.Calendar;

// public class Conta {
//     // int numero;
//     int agencia;
//     double saldo = 100;
//     // Calendar dataAbertura;
//     // Cliente cliente;

//     public double consultarSaldo(){
//         return saldo;
//     }

//     public void depositar(double valor){
//         saldo = saldo + valor;
//     }
// //------------------------------SOBRECARGA DE METODOS------------------------------\\
//     public void retirar(double valor){
//         saldo = saldo - valor;
//     }

//     public void retirar(double valor, double taxa){
//         saldo -= valor - taxa;
//     }
// //---------------------------------------------------------------------------------\\ 
//     public void setAgencia(int agencia){
//         this.agencia = agencia;
//     }
// //--------------------CONSTRUTORES E SOBRECARGA DE CONSTRUTORES--------------------\\
//     public Conta(){

//     }
//     public Conta(double saldo){
//         this.saldo = saldo;
//     }
//     public Conta(int agencia, double saldo){
//         this.saldo = saldo;
//         this.agencia = agencia;
//     }

// }


// public class Conta {

// 	int numero;
// 	int agencia;
// 	double saldo;

// 	public Conta(){

// 	}

// 	public Conta(int numero, int agencia, double saldo){
// 		this.numero = numero;
// 		this.agencia = agencia;
// 		this.saldo = saldo;
// 	}

// 	public void depositar(double valor){
// 		this.saldo += valor;
// 	}

// 	public void retirar(double valor){
// 		this.saldo -= valor;
// 	}

// 	public double verificarSaldo(){
// 		return saldo;
// 	}
// }



/**
 * Classe que abstrai uma Conta Bancária
 * @author thiagoyama
 * @version 1.0
 */
public class Conta {
	
	private int numero;
	private int agencia;
	private double saldo;

	public Conta(){

	}

	public Conta(int numero, int agencia, double saldo){
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSaldo(saldo);
	}

	/**
	   * Deposita um valor ao saldo da conta
	   * @param valor Valor a ser depositado
	*/
	public void depositar(double valor){
		saldo = saldo + valor;
	}

	/**
	  * Retira um valor do saldo da conta
	  * @param valor Valor a ser retirado
	*/

	public void retirar(double valor){
		saldo = saldo - valor;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}



/*public class Telefone {
	private String ddd;
	private String numero;

	//métodos gets e sets

	public String getTelefoneFormatado(){
		return formatarTelefone(ddd,numero);
	}

	private String formatarTelefone(String ddd, String numero){
		return "(" + ddd + ") " + numero;
	}

}*/