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
public class Profesor extends Personas {
	private String materia;
	private boolean disponible;
	
	final String MATERIA="Matematicas";
	final boolean DISPONIBLE=true;
	final String NOMBREPROFESOR="Profesor";
	
	
//CONTRUCTORES
	
	public Profesor(String nombre, int edad, char sexo, int asistencia, String aula, String materia) {
		super(nombre, edad, sexo, asistencia, materia);
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprovarSexo(sexo);
		this.asistencia = asistencia;
		this.aula=aula;
		this.materia = comprovarMateria(materia);
		this.disponible=DISPONIBLE;
	}
	
	public Profesor() {
		Random rand= new Random();
		this.nombre = NOMBREPROFESOR;
		this.edad = rand.nextInt(47)+18;
		this.sexo = SEXO;
		this.asistencia = rand.nextInt(10);
		this.aula="000";
		this.materia=MATERIA;
		this.disponible=DISPONIBLE;
	}


//METODOS
	public String comprovarMateria(String materias) {
		if (materias!="matematicas" && materias!="filosofia" && materias!="fisica") {
			return materias;
		} else {
			return MATERIA;
		}
	}
	
	public boolean haFaltadoDeMas(double total) {
		boolean b=false;
		if(((asistencia/total)*100)>20) {
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

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
				+ ", asistencia=" + asistencia + "]";
	}	
}
