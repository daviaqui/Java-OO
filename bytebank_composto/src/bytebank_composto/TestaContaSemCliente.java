package bytebank_composto;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaLucyana = new Conta();
		System.out.println(contaDaLucyana.getSaldo());
		
		contaDaLucyana.titular = new Cliente();
		System.out.println(contaDaLucyana.titular);
		
		contaDaLucyana.titular.nome = "Lucyana";
		System.out.println(contaDaLucyana.titular.nome);
	}
}
