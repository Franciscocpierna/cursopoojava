package aula14a;

public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private int views;
	private  int curtidas;
	private boolean reproduzindo;
	
	public Video (String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views=0;
		this.curtidas=0;
		this.reproduzindo=false;
	} 

	@Override
	public void play() {
		// TODO Auto-generated method stub
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		this.setReproduzindo(false);
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		//this.setCurtidas(getCurtidas+1);
		this.setCurtidas(this.getCurtidas()+1);
	}
	
	public void setTitulo(String titulo) {
		 this.titulo = titulo;
		}
	public String getTitulo() {
			return this.titulo;
		}
	
	public int getAvaliacao() {
			return this.avaliacao;
		}
	public void setAvaliacao(int avaliacao) {
	   	this.avaliacao= avaliacao;
	    }
	public int getViwes() {
	    	return this.views;
	    }
	public void setViews(int viwes) {
	    	this.views=views;
	    	
	    }
	public int getCurtidas() {
	    	return this.curtidas;
	    }
	public void setCurtidas(int curtidas) {
	   	this.curtidas=curtidas;
	    	
	    }
	public boolean getReproduzindo() {
	    	return this.reproduzindo;
	    }
	public void setReproduzindo(boolean reproduzindo) {
	    	this.reproduzindo=reproduzindo;
	    	
	    }
	  
	@Override 
	public String  detalhes() {
			return "Titulo{"+"titulo=" + this.getTitulo() +", Avaliação = "+this.getAvaliacao()+
					
			" Views "+this.getViwes()+" Curtidas "+this.getCurtidas()+" reproduzindo "+this.getReproduzindo()+'}';
		
		}
	
	
	
}
