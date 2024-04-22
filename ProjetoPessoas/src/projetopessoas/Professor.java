package projetopessoas;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	
	public void ReceberAum(float aum) {
		this.salario=this.getSal()+aum;
	} 
	
	
	
	public String getEspecial() {
		return this.especialidade;
	}
		
	public void setEspecial(String especialidade){
		this.especialidade = especialidade;
	}

	public float getSal() {
		return this.salario;
	}
		
	public void setSal(float salario){
		this.salario = salario;
	}

}
