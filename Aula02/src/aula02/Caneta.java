package aula02;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status(){
		System.out.println("uma modelo  " + this.modelo);
		System.out.println("uma caneta cor " + this.cor);
		System.out.println("Esta tampada esta " + this.tampada);
		System.out.println("a ponta é " + this.ponta);
		System.out.println("a carga  é " + this.carga);
	}
	void rabiscar() {
	 if (this.tampada == true) {
		 System.out.println(" Erro: Esta tampada não pode rabiscar");
	 }else {
		 System.out.println("Destampada posso rabiscar ");
	 }	
		
	}
    void tampar() {
    	this.tampada=true;
    }
    void destampar() {
    	this.tampada = false;
    }
}
