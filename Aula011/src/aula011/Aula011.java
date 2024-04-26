package aula011;

public class Aula011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pessoa p1 = new Pessoa(); por ser abtract classe Pessoa não pode ser instanciadda
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		//System.out.print(v1.toString());
		Aluno a1 = new Aluno();
		a1.setNome("Joao");
		a1.setIdade(30);
		a1.setSexo("M");
		a1.setCurso("Informatica");
		a1.setMatricula(1111);
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		//System.out.print(a1.toString());
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
	}

}
