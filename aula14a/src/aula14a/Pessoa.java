package aula14a;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setExperiencia(0);
	}
	public void setNome(String nome) {
	 this.nome =nome;
	}
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
    public void setIdade(int idade) {
    	this.idade= idade;
    }
    public String getSexo() {
    	return this.sexo;
    }
    public void setSexo(String sexo) {
    	this.sexo=sexo;
    	
    }
    public float getExperiencia() {
    	return this.experiencia;
    }
    public void setExperiencia(float experiencia) {
    	this.experiencia = experiencia;
    	
    }
   

   
    public String toString() {
		return "Pessoa{"+"Nome=" + this.getNome() +", Idade="+ this.getIdade()+
				", sexo= "+ this.getSexo()+" Experiencia"+this.getExperiencia()+'}';
	}
}
