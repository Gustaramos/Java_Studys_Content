package Studys.src;

public class TesteJavaBean {

	public static void main(String[] args) {
		PessoaBean p = new PessoaBean();
		p.setNome("Gustavo");
		p.setIdade(26);
		
		System.out.println(p.getNome() + " tem " + p.getIdade()+ " anos");
	}

}
