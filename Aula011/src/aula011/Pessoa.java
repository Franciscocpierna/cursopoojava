package aula011;

public abstract  class Pessoa {

	protected String nome;
	protected int idade;
	protected String sexo;
	
	
	public void fazerAniver(){
		this.setIdade(this.getIdade()+1);
		
	}
	
	/*public Pessoa(String nome, int idade, String sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		
	}
	*/
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
    @Override
    public String toString() {
    	return "Pessoa{"+this.getNome()+", idade="+this.getIdade()+
    			        ", Sexo =" + this.getSexo()+'}' ;
    }


}
