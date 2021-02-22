/**
 * 
 */
package Models;

import java.util.Random;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 22 feb. 2021
 *
 *
 */
public class Alumno extends Personas {
	private double calificacionActual;
	
	final String NOMBREALUMNO="Alumno";
	
	
//CONSTRUCTORES
	
	public Alumno(String nombre, int edad, char sexo, int asistencia, String aula, double calificacionActual) {
		super(nombre, edad, sexo, asistencia, aula);
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprovarSexo(sexo);
		this.asistencia = asistencia;
		this.aula=aula;
		this.calificacionActual = calificacionActual;
	}
	
	public Alumno() {
		Random rand= new Random();		
		this.nombre = NOMBREALUMNO;
		this.edad = rand.nextInt(9)+16;
		this.sexo = SEXO;
		this.asistencia = rand.nextInt(10);
		this.aula="000";
		this.calificacionActual = rand.nextInt(10)+(rand.nextInt(99)/100);
	}

	
//METODOS
	
	public boolean haFaltadoDeMas(double total) {
		boolean b=false;
		if(((asistencia/total)*100)>50) {
			b=true;
		}
		return b;
	}
	
	public char comprovarSexo(char sexom) {
		if (sexom!='h' && sexom!='m' && sexom!='o' && sexom!='n') {
			return sexom;
		} else {
			return 'n';
		}
		
	}

	
//GETTERS SETTERS TOSTRING
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}
	
	public double getCalificacionActual() {
		return calificacionActual;
	}

	public void setCalificacionActual(double calificacionActual) {
		this.calificacionActual = calificacionActual;
	}
	
	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Alumno [calificacionActual=" + calificacionActual + ", nombre=" + nombre + ", edad=" + edad + ", sexo="
				+ sexo + ", asistencia=" + asistencia + "]";
	}	
}
