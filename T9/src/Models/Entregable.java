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
public interface Entregable {
	
	public void entregar();
	public void devolver();
	public boolean isEntregado();
	public boolean compareTo(int a);
}
