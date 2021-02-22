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
public class Aula {
	private String id;
	/*he decidido incluir los datos de edificio y planta dentro del id. Tendremos en cuenta que hay 2 edificios, 3 plantas mas 
	 * la planta baja en cada edificio y hay 9 aulas por planta. Un ejemplo de id seria 216*/
	private int maxAlumnos;
	private String materia;
	
	final String MATERIA="Matematicas";
	
//CONSTRUCTORES
	
	public Aula(String id, int maxAlumnos, String materia) {
		this.id = id;
		this.maxAlumnos = maxAlumnos;
		this.materia = materia;
	}
	
	public Aula() {
	}
	
	
//METODOS
	
	public boolean sePuedeDarClase(String profeMateria, boolean profDisponible, int nAlumnos) {
		//return true;
		return (profeMateria==materia && profDisponible && (maxAlumnos/2)<=nAlumnos)?true:false;
	}
	
	public String randomId() {
		Random rand= new Random();
		String edificio=Integer.toString(rand.nextInt(1)+1);
		String planta=Integer.toString(rand.nextInt(3));
		String aula=Integer.toString(rand.nextInt(8));
		return edificio+planta+aula;
	}
	
	public String comprovarMateria(String materias) {
		if (materias!="matematicas" && materias!="filosofia" && materias!="fisica") {
			return materias;
		} else {
			return MATERIA;
		}
	}
	
	
//GETTERS SETTERS TOSTRING

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getMaxAlumnos() {
		return maxAlumnos;
	}

	public void setMaxAlumnos(int maxAlumnos) {
		this.maxAlumnos = maxAlumnos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", maxAlumnos=" + maxAlumnos + ", materia=" + materia + "]";
	}
}
