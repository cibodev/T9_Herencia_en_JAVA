/**
 * 
 */
package Main;

import java.util.Random;

import Models.Asiento;
import Models.Cine;
import Models.Espectador;
import Models.Pelicula;

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
		Random rand = new Random();
		Espectador[] espectadores = new Espectador[30];
		Pelicula pelicula = new Pelicula("John Wick", 114, 18, "Chad Stahelski");
		Cine cine = new Cine(pelicula.getTitulo(), 8.5, 8, 9);
		Asiento[][] asientos = new Asiento[cine.getFilas()][cine.getColumnas()];
		
		for (int i = 0; i < espectadores.length; i++) {
			espectadores[i] = new Espectador("Espectador"+(i));
		}
		
		espectadores[9].setDinero(0);
		espectadores[23].setEdad(12);
		
		System.out.println(pelicula.toString()+"\n\n"+cine.toString());
		
		System.out.println("\n\n----------------------------------------------------------------\n");
		
		int espectadoresi=0;
		char chari=' ';
		char charj=' ';
		for (int i = 0; i < asientos.length; i++) {
			chari =(char) ((char) i+48);
			System.out.println();
			for (int j = 0; j < asientos[i].length; j++) {
				charj =(char) ((char) j+65);
				asientos[i][j]= new Asiento(chari, charj);
				if(espectadoresi<espectadores.length && espectadores[espectadoresi].getAsiento()==null && !asientos[i][j].isOcupado() && espectadores[espectadoresi].getDinero()>=cine.getPrecioEntrada() && espectadores[espectadoresi].getEdad()>=pelicula.getEdadMin()) {
					espectadores[espectadoresi].setAsiento(asientos[i][j]);
					asientos[i][j].setOcupado(true);
				}
				espectadoresi++;
				if (asientos[i][j].isOcupado()) {
					System.out.print(asientos[i][j].getFila()+"-"+asientos[i][j].getColumna()+"O ");
				} else {
					System.out.print(asientos[i][j].getFila()+"-"+asientos[i][j].getColumna()+" ");
				}				
			}
		}
		
		System.out.println("\n\n----------------------------------------------------------------\n");
		
		for (int i = 0; i < espectadores.length; i++) {
			if(espectadores[i].getAsiento()!= null){
			System.out.println(espectadores[i].getNombre()+": "+espectadores[i].getAsiento().getFila()+"-"+espectadores[i].getAsiento().getColumna());
			}else {
				System.out.println(espectadores[i].getNombre()+" no tiene asiento");
			}
		
		}
	}

}

