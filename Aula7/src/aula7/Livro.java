package aula7;

public class Livro implements Publicacao {
	private String titulo;
	private String autor; 
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
		return "Livro{"+"titulo=" + this.getTitulo() +", autor= "+this.getAutor()
				+ "\n, totPaginas= "+ this.getTotpaginas()+ ", pagAtual="+this.getPagatual()+","
				+ "\n, aberto="+aberto+"\n, Nome="+ leitor.getNome()+
				", Idade="+ leitor.getIdade()+
				", sexo="+ leitor.getSexo()+'}';
	}
	public void setTitulo(String titulo) {
		    this.titulo =titulo;
		}
	public String getTitulo() {
			return this.titulo;
		}
	public String getAutor() {
			return this.autor;
		}
	private void setAutor(String autor) {
	    	this.autor= autor;
	    }
	public Pessoa getLeitor() {
	    	return this.leitor;
	    }
	public void setLeitor(Pessoa leitor) {
	    	this.leitor=leitor;
	    	
	    }
	public void setTotpaginas(int totPaginas) {
    	this.totPaginas= totPaginas;
    }
	public int getTotpaginas() {
       return this.totPaginas;
    }
	private int getPagatual() {
	       return this.pagAtual;
	    }
	
	private void setPagatual(int pagAtual) {
    	this.pagAtual= pagAtual;
    }

	public boolean getAberto() {
	       return this.aberto;
	    }

	public void setAberto(boolean aberto) {
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
		if(p >this.totPaginas) {
			this.setPagatual(0);
		}else {
			this.setPagatual(p);	
		}
		
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
