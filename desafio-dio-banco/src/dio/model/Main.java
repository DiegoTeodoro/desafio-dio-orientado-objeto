package dio.model;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Diego Teodoro");

		IConta cc = new ContaCorrente(c1);
		cc.depositar(1000);

		IConta poupanca = new ContaPoupanca(c1);
		cc.transferir(500, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
