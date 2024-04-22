package projetopessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // programa Principal
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		p1.setSexo("M");
		p2.setIdade(22);
		p4.setSexo("F");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		p2.setCurso("Informática");
		p3.setSal(2500.75f);
		p4.setSetor("Estoque");
		p3.ReceberAum(550.20f);
		p4.mudarTrabalho();
		p2.cancelarMatr();
		
	}

}
