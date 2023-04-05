package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDavi = new Conta();
		contaDoDavi.saldo = 100;
		contaDoDavi.deposita(50);
		System.out.println(contaDoDavi.saldo);
		boolean conseguiuRetirar = contaDoDavi.saca(20);
		System.out.println(contaDoDavi.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(1000);
		
		if(contaDaAna.transfere(300, contaDoDavi)) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaAna.saldo);
		System.out.println(contaDoDavi.saldo);
	}
}
