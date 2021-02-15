/**
 * 
 */
package Models;

/**
 * @author Christian Rivas Pottier
 *
 *
 * @date 15 feb. 2021
 *
 *
 */
public class Serie implements Entregable{
	private String titulo;
	private int nTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	final int NTEMPORADAS=3;
	final boolean ENTREGADO=false;
	
	
//CONTRUCTORES
	
	public Serie() {
		this.nTemporadas = NTEMPORADAS;
		this.entregado = ENTREGADO;
	}


	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.nTemporadas = NTEMPORADAS;
		this.entregado = ENTREGADO;
		this.creador = creador;
	}


	public Serie(String titulo, int nTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nTemporadas = nTemporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

//METODOS
	
	@Override
	public void entregar() {
		this.entregado=true;
	}


	@Override
	public void devolver() {
		this.entregado=false;	
	}


	@Override
	public boolean isEntregado() {
		return this.entregado;
	}


	@Override
	public boolean compareTo(int a) {
		return (this.nTemporadas>a)?true:false;
	}
	
//GETTERS Y SETTERS

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}


	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	/**
	 * @return the nTemporadas
	 */
	public int getnTemporadas() {
		return nTemporadas;
	}


	/**
	 * @param nTemporadas the nTemporadas to set
	 */
	public void setnTemporadas(int nTemporadas) {
		this.nTemporadas = nTemporadas;
	}


	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}


	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	
// TOSTRING

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nTemporadas=" + nTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	
}
