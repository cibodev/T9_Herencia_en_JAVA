/**
 * 
 */
package Models;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 15 feb. 2021
 *
 *
 */
public class Videojuego implements Entregable{
	private String titulo;
	private int hEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	final int HESTIMADAS=10;
	final boolean ENTREGADO=false;
	
	
//CONSTRUCTORES
	
	public Videojuego() {
		this.hEstimadas = HESTIMADAS;
		this.entregado = ENTREGADO;
		
	}

	
	public Videojuego(String titulo, int hEstimadas) {
		this.titulo = titulo;
		this.hEstimadas = hEstimadas;
		this.entregado = ENTREGADO;
	}


	public Videojuego(String titulo, int hEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.hEstimadas = hEstimadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.compania = compania;
	}

//METODOS
	
	@Override
	public void entregar() {
		this.entregado=true;
	}


	@Override
	public void devolver() {
		this.entregado=false;	
	}


	@Override
	public boolean isEntregado() {
		return this.entregado;
	}


	@Override
	public boolean compareTo(int a) {
		return (this.hEstimadas>a)?true:false;
	}
	
//GETTERS Y SETTERS

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int gethEstimadas() {
		return hEstimadas;
	}


	public void sethEstimadas(int hEstimadas) {
		this.hEstimadas = hEstimadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCompania() {
		return compania;
	}


	public void setCompania(String compania) {
		this.compania = compania;
	}


	
//TOSTRING
	
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", hEstimadas=" + hEstimadas + ", entregado=" + entregado + ", genero="
				+ genero + ", compania=" + compania + "]";
	}
	
}