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
public class Asiento {
	private char fila;
	private char columna;
	private boolean ocupado;
	
//METODOS
	
	
//CONSTRUCTORES
	
	public Asiento(char fila, char columna) {
		this.fila = fila;
		this.columna = columna;
		this.ocupado = false;
	}
	
//GETTERS Y SETTERS Y TOSTRING
	
	public char getFila() {
		return fila;
	}
	public void setFila(char fila) {
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	public void setColumna(char columna) {
		this.columna = columna;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", columna=" + columna + ", ocupado=" + ocupado + "]";
	}
	
}
