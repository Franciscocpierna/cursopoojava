package aula12;

public class Reptil extends Animal{
    private String corEscama;
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("rastejando");	
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("comendo vegetais");
	}

	@Override
	public void emitirsom() {
		// TODO Auto-generated method stub
		System.out.println("som de Reptil");
	}
	
	public String getcorEscama() {
		  return this.corEscama;
		}
		
	public void setcorEscama() {
			this.corEscama=corEscama;
		}
}
