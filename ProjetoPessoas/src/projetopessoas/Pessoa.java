package projetopessoas;

public class Pessoa {
 private String nome, sexo;
 private int idade;
 
 public void fazerAniversario() {
	this.idade=this.getIdade()+1;
	 
 }
public String getNome(){
	return this.nome;
} 
public void setNome(String nome) {
	this.nome= nome;
}
public String getSexo(){
	return this.sexo;
} 
public void setSexo(String sexo) {
	this.sexo= sexo;
}
public int getIdade(){
	return this.idade;
} 
public void setIdade(int idade) {
	this.idade= idade;
}

@Override
public String toString() {
	return "Pessoa{"+this.getNome()+", idade="+this.getIdade()+
			        ", Sexo =" + this.getSexo()+'}' ;
}

}
