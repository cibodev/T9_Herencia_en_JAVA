/**
 * 
 */
package Main;

import Models.Alumno;
import Models.Aula;
import Models.Profesor;

/**
 * @author Christian Rivas Pottier
 *
 * 10 feb. 2021
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aula aula1 = new Aula();
		Profesor profe = new Profesor();
		Alumno[] alumnos = new Alumno[6];
		
		aula1=new Aula("213", 10, "fisica");
		profe = new Profesor();	
		profe.setAula("213");
		profe.setMateria("fisica");
		
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i]=new Alumno();
			alumnos[i].setAula("213");
			alumnos[i].setNombre(alumnos[i].getNombre()+" "+i);
		}
		
		if(aula1.sePuedeDarClase(profe.getMateria(), profe.isDisponible(), alumnos.length)) {
			for (int i = 0; i < alumnos.length; i++) {
				if (alumnos[i].getCalificacionActual()>=5) {
					System.out.println(alumnos[i].getNombre()+" esta aprobado ("+alumnos[i].getCalificacionActual()+")");
				} else {
					System.out.println(alumnos[i].getNombre()+" esta suspendido ("+alumnos[i].getCalificacionActual()+")");
				}
			}
		}
		
	}

}

