package aula12;

public class Peixe extends Animal {
    private String corEscama;
	
    @Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("comer Substância");
	}

	@Override
	public void emitirsom() {
		// TODO Auto-generated method stub
		System.out.println("Som de peixe");
	}
	
	public String getcorEscama() {
		  return this.corEscama;
		}
		
	public void setcorEscama() {
			this.corEscama=corEscama;
		}
	  
	public void soltarBolha() {
		System.out.println("soltando Bolhas");	
	}

}
