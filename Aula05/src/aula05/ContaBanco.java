package aula05;

public class ContaBanco {
public int numconta;
protected String tipo;
private String dono;
private float saldo;
private boolean status;

public void abrirConta(String t) {
	this.setTipo(t);
	this.setStatus(true);
	if(t=="CC") {
		this.setSaldo(50);
	}else if(t=="CP")  {
		this.setSaldo(150);
	}
	System.out.println("conta aberta com sucesso");
	}
public void fecharConta() {
	if (this.getSaldo()>0) {
		System.out.println("Não pode ser fechada tem dinheiro na conta");
	}else if(this.getSaldo()<0) {
		System.out.println("Não pode ser fechada falta dinheiro na conta");
	}else {
		this.setStatus(false);
		System.out.println("conta fechada com sucesso");
	}
	
}
public void depositar(float v) {
	if (this.getStatus()==true) {
		this.setSaldo(this.getSaldo()+v);
	}
}
public void sacar() {
	
}
public void pagarMensal() {
	
}

public ContaBanco() {
	this.setSaldo(0);
	this.setStatus(false);
	
}
public void setNumconta(int n) {
	this.numconta=n;
}
public int getNumconta() {
	return this.numconta;
}
public void setTipo(String t) {
	this.tipo=t;
}
public String getTipo() {
  return this.tipo;	
}

public void setDono(String d) {
	this.dono=d;
}	

public String getDono() {
	return this.dono;
}
public void setSaldo(float s) {
	this.saldo=s;
}
public float getSaldo() {
	return this.saldo;
}
public  void setStatus(boolean st) {
	this.status=st;
}

public boolean getStatus() {
	return this.status;
}


} 
