package ultraemojicombat;

public class Lutador {
	    // atributos
		private String nome, nacionalidade, categoria;
		private int idade, vitorias, derrotas, empates;
		private float altura, peso;
		//metodos publicos
		public void apresentar() {
			System.out.println("=============================");
			System.out.println("Chegou a hora de apresentar o lutador "+this.getNome());
			System.out.println("Diretamente de "+this.getNacionalidade());
			System.out.println("com "+ this.getIdade()+ " Anos e " +this.getAltura());
			System.out.println("pesando " +this.getPeso()+ " Kg");
			System.out.println(this.getVitorias()+" Vitorias");
			System.out.println(this.getDerrotas()+ " Derrotas");
			System.out.println(this.getEmpates()+" Empates");
		}
		public void status() {
			System.out.println("=============================");
			System.out.println(this.getNome()+" é um peso "+this.getCategoria());
			System.out.println("Ganhou "+this.getVitorias()+" vezes");
			System.out.println("Derrotas "+this.getDerrotas()+" vezes");
			System.out.println("Empatou "+this.getEmpates()+" vezes");
		}
		public void ganharLuta() {
			this.setVitorias(this.getVitorias()+1);
		}
		public void perderLuta() {
			this.setDerrotas(this.getDerrotas()+1);
		}
		public void empatarLuta() {
			this.setEmpates(this.getEmpates()+1);
		}
		//metodos especiais
		public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
			this.nome = nome;
			this.nacionalidade = nacionalidade;
			this.idade = idade;
			this.altura = altura;
			this.setPeso(peso);
			this.vitorias = vitorias;
			this.derrotas = derrotas;
			this.empates = empates;
			
					
		}
		
		public void setNome(String nome) {
			this.nome=nome;
		}
		public String getNome() {
			return nome;
		}
		
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade=nacionalidade;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getIdade() {
			return idade;
		}
		
		public void setVitorias(int vitorias) {
			this.vitorias = this.getVitorias()+1;
		}
		public int getVitorias() {
			return vitorias;
		}
		
		public void setDerrotas(int derrotas) {
			this.derrotas = this.getDerrotas()+1;;
		}
		public int getDerrotas() {
			return derrotas;
		}
		
		public void setEmpates(int empates) {
			 this.empates=this.getEmpates()+1;
		}
		public int getEmpates() {
			return empates;
		}
		
		public void setAltura(float altura) {
			this.altura=altura;
		}
		public float getAltura() {
			return altura;
		}
			
		public void setPeso(float peso) {
			this.peso =peso;
			this.setCategoria();
		}
		public float getPeso() {
			return peso;
		}
	   private void setCategoria() {
		   if (this.getPeso() < 52.2) {
			   this.categoria = "Inválido";
		   }else if(this.getPeso() <= 70.3) {
			   this.categoria= "Leve";
		   }else if (this.getPeso() <= 83.9) {
			   this.categoria= "Medio";
		   }else if (this.getPeso() <= 120.2) {
			   this.categoria="Pesado";
		   }else {
			   this.categoria="Invalido";
		   }
	   }
	   public String getCategoria() {
		   return categoria;
	   }
}
