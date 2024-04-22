package projetopessoas;

public class Aluno extends Pessoa {
private int mat;
private String curso;

public void cancelarMatr() {
	System.out.println("Matricula será cancelada");
}



public int getMatr() {
	return this.mat;
}
	
public void setMatr(int mat){
	this.mat = mat;
}

public String getCurso() {
	return this.curso;
}
	
public void setCurso(String curso){
	this.curso = curso;
}
}
