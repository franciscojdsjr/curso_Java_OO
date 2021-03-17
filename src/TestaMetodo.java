public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.pegaSaldo() = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.pegaSaldo());

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.pegaSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.spegaSaldo());
		System.out.println(contaDoPaulo.pegaSaldo());
	}

}