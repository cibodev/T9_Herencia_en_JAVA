/**
 * 
 */
package Models;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 1 mar. 2021
 *
 *
 */
public class Pelicula {
	private String titulo;
	private int duracion;
	private int edadMin;
	private String director;
	
//CONTRUCTORES
	
	public Pelicula(String titulo, int duracion, int edadMin, String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMin = edadMin;
		this.director = director;
	}
	
	
//GETTERS Y SETTERS Y TOSTRING

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMin() {
		return edadMin;
	}
	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Pelicula\n\tTitulo: " + titulo + "\n\tDuracion: " + duracion + "\n\tEdad Minima: " + edadMin + "\n\tDirector: "
				+ director;
	}
	
	
}
