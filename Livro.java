public class Livro {

		String titulo;
		String descrição;
		int quantidade;
		
		public Livro(String titulo, String descrição, int quantidade) {
			super();
			this.titulo = titulo;
			this.descrição = descrição;
			this.quantidade = quantidade;
		}
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDescrição() {
			return descrição;
		}
		public void setDescrição(String descrição) {
			this.descrição = descrição;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		@Override
		public String toString() {
			return "Livro [titulo=" + titulo + ", descrição=" + descrição + ", quantidade=" + quantidade + "]";
		}
	}