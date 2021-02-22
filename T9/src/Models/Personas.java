/**
 * 
 */
package Models;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 22 feb. 2021
 *
 *
 */
public abstract class Personas {
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected int asistencia;
	protected String aula;
	
	final char SEXO='n';
	final String AULA="000";
	
	
//CONSTRUCTORES
	
	public Personas(String nombre, int edad, char sexo, int asistencia, String aula) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asistencia = asistencia;
		this.aula=aula;
	}

	public Personas() {
	}	
}
