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
public class Cine {
	private String tituloPelicula;
	private double precioEntrada;
	private int filas;
	private int columnas;
	
	
//CONTRUCTORES
	
	public Cine(String tituloPelicula, double precioEntrada, int filas, int columnas) {
		this.tituloPelicula = tituloPelicula;
		this.precioEntrada = precioEntrada;
		this.filas = filas;
		this.columnas = columnas;
	}
	
	
//GETTERS Y SETTERS Y TOSTRING
	
	public String getTituloPelicula() {
		return tituloPelicula;
	}
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	@Override
	public String toString() {
		return "Cine\n\tTitulo Pelicula: " + tituloPelicula + "\n\tPrecio Entrada: " + precioEntrada + "\n\tFilas: " + filas
				+ "\n\tColumnas: " + columnas;
	}
}
