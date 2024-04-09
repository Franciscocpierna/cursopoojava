package aula05;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco p1 = new ContaBanco();
		p1.setNumconta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumconta(2222);
		p2.setDono("Cleusa");
		p2.abrirConta("CP");
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		p2.sacar(1000);
		p1.sacar(150);
		p1.fecharConta();
		p1.estadoAtual();
		p2.estadoAtual();
		

	}

}
