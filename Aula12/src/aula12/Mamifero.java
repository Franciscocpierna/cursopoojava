package aula12;

public class Mamifero extends Animal{
private String corPelo;
	
	public String getcorPelo() {
	  return this.corPelo;
	}
	
	public void setcorPelo(String corPelo) {
		this.corPelo=corPelo;
	}
	@Override 
	public void locomover() {
		System.out.println("correndo");
		  
	  }
	@Override
	public void  alimentar() {
		System.out.println("mamando");	  
	  }
	@Override	
	public void emitirsom() {
		System.out.println("Som de Mamifero");  
	  }

}
