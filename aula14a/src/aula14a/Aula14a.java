package aula14a;

public class Aula14a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v[]= new Video[3];
	     v[0]= new Video("Aula 1 de Poo");
	     v[1]= new Video("Aula 2 de Poo");
	     v[2]= new Video("Aula 3 de Poo");
	     System.out.println(v[0].detalhes());
	     v[0].like();
	     Gafanhoto g[]=new Gafanhoto[2];
	     g[0]= new Gafanhoto("Jubileu",22,"M","juba");
	     g[1]= new Gafanhoto("Creuza",12,"F","creuzita");
	     System.out.println(v[0].detalhes());
	     System.out.println(g[0].detalhes());
	}

}
