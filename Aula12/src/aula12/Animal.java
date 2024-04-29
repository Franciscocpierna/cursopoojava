package aula12;

public abstract class Animal {
	 protected  float peso;
	  protected int idade; 
	  protected int membros;
	  
	  public abstract void locomover();
	  public abstract void  alimentar();
	  public abstract void emitirsom();
		   
	  public float getIdade() {
		  return this.idade;
	  }
	  public void  setIdade(int idade) {
		  this.idade=idade;
	  }
	  
	  public float getmembros() {
		    return membros;
	  }
	  public void  setMembros(int membros) {
		   this.membros=membros;
	  }

	  public float getPeso() {
		  return this.peso;
	  }
	  public void  setPeso(float peso) {
		  this.peso=peso;
	  }
	     
}
