package bytebank_encapsulado;

public class TestaGetSet { 
    public static void main(String[] args) { 
        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getNumero());

        Cliente davi = new Cliente(); 
        davi.setNome("davi barbosa");
        davi.setCpf("123.456.789-01");
        davi.setProfissao("Dev");
        
        conta.setTitular(davi);
        
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("programador");
        //agora em duas linhas;
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        
        System.out.println(titularDaConta);
        System.out.println(davi);
        System.out.println(conta.getTitular());
        
    }
}