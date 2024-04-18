package aula7;

public class Livro implements Publicacao {
	private String titulo, autor,leitor; 
	private int totPaginas,pagAtual;
	private boolean aberto; 

	
	public void detalhes() {
		
	}
	
	private void setTitulo(String titulo) {
		 this.titulo =titulo;
		}
	private String getTitulo() {
			return this.getTitulo();
		}
	private int getAutor() {
			return getAutor();
		}
	private void setAutor(String autor) {
	    	this.autor= autor;
	    }
	private String getLeitor() {
	    	return this.getLeitor();
	    }
	private void setLeitor(String leitor) {
	    	this.leitor=leitor;
	    	
	    }
	private void setTotpaginas(int totPaginas) {
    	this.totPaginas= totPaginas;
    }
	private int getTotpaginas() {
       return this.getTotpaginas();
    }
	private int getPagatual() {
	       return this.getPagatual();
	    }
	
	private void setPagatual(int pagAtual) {
    	this.pagAtual= pagAtual;
    }

	private boolean getAberto() {
	       return this.getAberto();
	    }

	private void setAberto(boolean aberto) {
    	this.aberto= aberto;
    }

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
	    	
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void folear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		
	}
	
}
