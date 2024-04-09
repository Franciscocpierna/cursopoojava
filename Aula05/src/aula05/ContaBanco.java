package aula05;

public class ContaBanco {
public int numconta;
protected String tipo;
private String dono;
private float saldo;
private boolean status;

public void estadoAtual() {
	System.out.println("============================");
	System.out.println("Conta: "+ this.getNumconta());
	System.out.println("Tipo: "+this.getTipo());
	System.out.println("Dono: "+this.getDono());
	System.out.println("Saldo: "+this.getSaldo());
	System.out.println("Status "+this.getStatus());
	
}

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
	if (this.getStatus()) {
		this.setSaldo(this.getSaldo()+v);
		System.out.println("Deposito efetuado com sucesso na conta "+this.getDono());
	}else {
		System.out.println("impossível depositar em uma conta fechada");
	}
}
public void sacar(float v) {
	if(this.getStatus()) {
		if(this.getSaldo()>=v) {
			this.setSaldo(this.getSaldo()-v); 
			System.out.println("Saque realizado na conta de "+this.getDono());
		}else {
			System.out.println("saldo insuficiente na conta de "+this.getDono());
		} 
	}else {
		System.out.println("A conta esta fechada do "+this.getDono());
	}
	
}
public void pagarMensal() {
	int v=0;
	if (this.getTipo()=="CC") {
		v=12;
	}else if(this.getTipo()=="CP"){
		v=20;
	}
	if(this.getStatus()) {
		this.setSaldo(this.getSaldo()-v);
		System.out.println("mensalidade paga com sucesso por "+this.getDono());
	} else {
		System.out.println("não foi paga Conta fechada de  "+this.getDono());
	}
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
