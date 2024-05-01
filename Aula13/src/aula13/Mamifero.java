package aula13;

public class Mamifero extends Animal{
	protected String corPelo; 
	

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de mamífero");
	}
	
	public String getcorPelo() {
		  return this.corPelo;
	  }
	public void  setcorPelo(String corPelo) {
		  this.corPelo=corPelo;
	  }

}
