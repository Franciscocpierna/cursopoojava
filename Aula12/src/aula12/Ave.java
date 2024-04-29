package aula12;

public class Ave extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo frutas");
	}

	@Override
	public void emitirsom() {
		// TODO Auto-generated method stub
		System.out.println("Som de Ave");
	}
	
	public String getcorPena() {
		  return this.corPena;
		}
		
	public void setcorPena() {
			this.corPena=corPena;
		}
	public void fazerNinho() {
		System.out.println("fazendo ninho");
	}

}
