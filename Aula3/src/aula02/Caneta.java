package aula02;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status(){
		System.out.println("uma modelo  " + this.modelo);
		System.out.println("uma caneta cor " + this.cor);
		System.out.println("Esta tampada esta " + this.tampada);
		System.out.println("a ponta é " + this.ponta);
		System.out.println("a carga  é " + this.carga);
	}
	public void rabiscar() {
	 if (this.tampada == true) {
		 System.out.println(" Erro: Esta tampada não pode rabiscar");
	 }else {
		 System.out.println("Destampada posso rabiscar ");
	 }	
		
	}
    public void tampar() {
    	this.tampada=true;
    }
    public void destampar() {
    	this.tampada = false;
    }
}
