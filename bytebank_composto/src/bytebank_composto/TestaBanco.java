package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente davi = new Cliente();
		davi.nome = "Davi Barbosa";
		davi.cpf = "123.456.789-01";
		davi.profissao = "Desempregado";
		
		Conta contaDoDavi = new Conta();
		contaDoDavi.deposita(100);
		
		contaDoDavi.titular = davi;
		System.out.println(contaDoDavi.titular.nome);
		
	}
}
