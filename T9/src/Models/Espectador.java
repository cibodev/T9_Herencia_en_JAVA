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
public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	private Asiento asiento;

	
//CONTRUCTORES
	
	public Espectador(String nombre, int edad, double dinero, Asiento asiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
		this.asiento = asiento;
	}
	
	public Espectador(String nombre) {
		this.nombre = nombre;
		this.edad = 18;
		this.dinero = 100;
	}
	
//GETTERS Y SETTERS Y TOSTRING

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public Asiento getAsiento() {
		return asiento;
	}
	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
}
