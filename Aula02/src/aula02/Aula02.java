package aula02;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Caneta  c1 = new Caneta();
     c1.cor = "Azul";
     c1.ponta = 0.5f;
     c1.tampar();
     //c1.destampar();
     c1.status();
     c1.rabiscar();
     Caneta c2 = new Caneta(); 
     c2.modelo = "Hostnet";
     c2.cor = "preta";
     c2.ponta = 1.5f;
     c2.destampar();
     c2.status();
     c2.rabiscar();
     
	}

}
