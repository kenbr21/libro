package libros;

public class Libro {
	private String titulo;
	private String autor;
	private int numPage;
	private int puntuacion;
	
	public Libro() {
		titulo="";
		autor="";
		numPage=0;
		puntuacion=0;						
	}

	public Libro(String titulo, String autor, int numPage, int puntuacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPage = numPage;
		this.puntuacion = puntuacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPage() {
		return numPage;
	}

	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
}
