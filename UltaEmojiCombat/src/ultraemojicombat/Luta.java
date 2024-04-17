package ultraemojicombat;

import java.util.Random;


public class Luta {
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovada;
  public void Lutar() {
	 if(this.aprovada) {
		 System.out.println("### DESAFIADO ###");
		 this.desafiado.apresentar();
		 System.out.println("### DESAFIANTE ###");
		 this.desafiante.apresentar();
		 
		 Random aleatorio = new Random();
		 int vencedor = aleatorio.nextInt(3); // 0, 1 ou 2
		 System.out.println("### Resultado da luta ###");
		 switch(vencedor){
		 
		  case 0: // empate
			   System.out.println("Empatou");
			   this.desafiado.empatarLuta();
			   this.desafiante.empatarLuta();
			   break;
		   case 1: // Desafiado vence
			   System.out.println("Vitoria do "+this.desafiado.getNome());
			   this.desafiado.ganharLuta();
			   this.desafiante.perderLuta();
			   break;
		  case 2: // Desafiante vence
			   System.out.println("Vitoria do "+this.desafiante.getNome());
			   this.desafiante.ganharLuta();
			   this.desafiado.perderLuta();
			  break;
		 }
		 System.out.println("=========================="); 
		 }else {
			 System.out.println("A luta não pode acontecer");
		 }
	 }
  public void marcarLutar(Lutador l1,Lutador l2){
	  if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
		  this.aprovada= true;
		  this.desafiado = l1;
		  this.desafiante = l2;
	  }else {
		  this.aprovada = false;
		  this.desafiado = null;
		  this.desafiante = null;
	  }
  }
  public Lutador getDesafiado() {
	  return desafiado;
  }
  public void setDesafiado(Lutador desafiado) {
	this.desafiado = desafiado;  
  }
  public Lutador getDesafiante() {
	  return desafiante;
  }
  public void setDesafiante(Lutador desafiante) {
	this.desafiante = desafiante;  
  }
  public int  getRound() {
	  return rounds;
  }
  public void setRounds(int rounds) {
	  this.rounds= rounds;
  }
  public boolean getAprovada() {
	  return this.aprovada;
  }
  public void setAprovada(boolean aprovada) {
	  this.aprovada = aprovada;
  }
  }