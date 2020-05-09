import java.util.ArrayList;

public class Biblioteca {
	
	public ArrayList <Livro> livros;
	public Biblioteca() {
		 livros = new ArrayList<>(50);
	}
	 public void inserirLivro(Livro livro){
		   
	      livros.add(livro);
	   } 
	   
	   public String listarLivros(){
	      String lp = "";  
	      for (Livro livro : livros ){
	         lp += livro.toString();
	      }
	      return lp;
	   }

}
