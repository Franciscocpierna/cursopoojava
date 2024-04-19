package aula7;

public class Livro implements Publicacao {
	private String titulo, autor; 
	private int totPaginas,pagAtual;
	private boolean aberto; 
	private Pessoa leitor;
	
	public Livro(String Titulo, String autor, int totPaginas, Pessoa leitor) {
	   this.setTitulo(Titulo);
	   this.setAutor(autor);
	   this.setTotpaginas(totPaginas);
	   this.setLeitor(leitor);
	   this.setAberto(false);
	   this.setPagatual(0);
	}

	
	public String detalhes() {
		return "Livro{"+"titulo=" + titulo +"\n, autor= "+autor
				+ "\n, totPaginas= "+ totPaginas+ "\n, pagAtual="+pagAtual+","
				+ "\n, aberto="+aberto+"\n, leitor="+ leitor.getNome()+'}';
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
	private void setLeitor(Pessoa leitor) {
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
	    this.setAberto(true);
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.setAberto(false);
	}

	@Override
	public void folear(int p) {
		// TODO Auto-generated method stub
		this.setPagatual(p);
	}

	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		this.setPagatual(this.getPagatual()+1);
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.setPagatual(this.getPagatual()-1);
	}
	
}
