package aula14a;

public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistindo;
	public void viuMaisUm() {}
	 
	public Gafanhoto(String nome, int idade, String sexo,String login) {
		super(nome, idade, sexo);
		this.setLogin(login);
		this.setTotAssistindo(0);
	} 
	public String getLogin() {
	 	return this.login;
	 }
	public void setLogin(String login) {
	 	this.login=login;
	 	
	 }
	public int getTotAssistindo() {
		 	return this.totAssistindo;
	 }
	 public void setTotAssistindo(int totAssistindo) {
		 	this.totAssistindo=totAssistindo;
		 	
	 }
	 @Override
	 public String toString() {
			return "Gafanhoto{"+ super.toString()+"\n Login "+this.getLogin()+", Assistindo "+this.getTotAssistindo()+'}';
		}
}
