package aula14a;

public class Visualizacao {
  private Gafanhoto espectador;
  private Video filme;
  
  public Visualizacao(Gafanhoto espectador, Video filme) {
	  //this.setEspectador(espectador);
	  //this.setFilme(filme);
	  this.espectador = espectador;
	  this.filme = filme;
	  this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
	  this.filme.setViews(this.filme.getViwes()+1);
  }
  
  
  public void avaliar() {
	  this.filme.setAvaliacao(5);
  }
  public void avaliar(int nota) {
	this.filme.setAvaliacao(nota); 
  }
  public void avaliar(float porc) {
	  int tot=0;
	  if(porc <= 20) {
		  tot=3;
	  }else if(porc <= 50) {
		  tot=5;
	  }else if (porc <= 90) {
		  tot=8;
	  }else {
		  tot = 10;
	  }
	  this.filme.setAvaliacao(tot);
  }

  public Gafanhoto getEspectador() {
	  return this.espectador;
  }
  
  public void setEspectador(Gafanhoto espectador) {
	  this.espectador = espectador;
  }
  
  public Video getFilme() {
	  return this.filme;
  }
  
  public void setFilme(Video filme) {
	  this.filme = filme;
  }
  
  
  public String toString() {
		return "Visualizaçao{" +"Espectador "+this.espectador.nome+" Filme "+this.filme.getTitulo()+
				" Assistindo "+this.espectador.getTotAssistindo()+" Views"+this.filme.getViwes()+
				" Avaliação "+this.filme.getAvaliacao() +'}';
	}



}
