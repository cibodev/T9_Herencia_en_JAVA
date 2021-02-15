package Main;
/**
 * 
 */

import javax.swing.JOptionPane;

import Models.Serie;
import Models.Videojuego;

/**
 * @author Christian Rivas Pottier
 *
 * 15 feb. 2021
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Serie[] series=new Serie[5];
		Videojuego[] videojuegos=new Videojuego[5];
		
		series[0]=new Serie();
		series[1]=new Serie("The Office", "Greg Daniels");
		series[2]=new Serie("Breaking Bad", 5,"Drama Criminal", "Vince Gilligan");
		series[3]=new Serie();
		series[4]=new Serie();
		videojuegos[0]= new Videojuego();
		videojuegos[1]= new Videojuego("The Last of Us", 50);
		videojuegos[2]= new Videojuego("VA-11 HALL-A", 20, "Novela Visual", "Sukeban Games");
		videojuegos[3]= new Videojuego();
		videojuegos[4]= new Videojuego();
		
		videojuegos[2].entregar();
		series[1].entregar();
		series[4].entregar();
		videojuegos[1].entregar();
		
		int seriesEntregadas=0;
		int videojuegosEntregados=0;
		int videojuegoMasLargoint=0;
		int serieMasLargaint=0;
		String tituloVideojuegoMasLargo="";
		String tituloSerieMasLarga="";
		String infoSerie="";
		String infoVideojuego="";
		
		for (int i = 0; i < videojuegos.length; i++) {
			if(videojuegos[i].isEntregado()) {
				videojuegosEntregados++;
				videojuegos[i].devolver();
			}
			if(videojuegos[i].compareTo(videojuegoMasLargoint)) {
				videojuegoMasLargoint=videojuegos[i].gethEstimadas();
				tituloVideojuegoMasLargo=videojuegos[i].getTitulo();
			}
			infoVideojuego+=videojuegos[i].toString()+"\n";
		}
		for (int i = 0; i < series.length; i++) {
			if(series[i].isEntregado()) {
				seriesEntregadas++;
				series[i].devolver();
			}
			if(series[i].compareTo(serieMasLargaint)) {
				serieMasLargaint=series[i].getnTemporadas();
				tituloSerieMasLarga=series[i].getTitulo();
			}
			infoSerie+=series[i].toString()+"\n";
		}
		
		JOptionPane.showMessageDialog(null, infoSerie+"Series entregadas: "+seriesEntregadas+"\nSerie mas larga: "+tituloSerieMasLarga+"\n-----------------------------------------------------------\n"
											+ infoVideojuego+"Videojuegos entregados: "+videojuegosEntregados+"\nVideojuego mas largo: "+tituloVideojuegoMasLargo);
		
	}

	
}
