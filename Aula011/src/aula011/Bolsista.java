package aula011;

public class Bolsista extends Aluno{
	private float bolsa;
    public void renovarBolsa() {
    	System.out.println("Renovar Bolsa de " + this.getNome()); 
    }
    @Override
    public void pagarMensalidade() {
		System.out.println(this.getNome()+" é bolsista! Pagamento facilitado");
	} 
    public void setBolsa(float bolsa) {
    	this.bolsa=bolsa;
    }
    public float getBolsa() {
    	return this.bolsa;
    }
}
