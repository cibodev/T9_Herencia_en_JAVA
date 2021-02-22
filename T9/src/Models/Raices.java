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
public class Raices {
	private double a;
	private double b;
	private double c;
	
	
//CONSTRUCTOR
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
//METODOS
	
	public void obtenerRaices() {
		double[] resultados=new double[2];
		resultados[0]=(((-this.b)+(Math.sqrt((this.b*this.b)-(4*this.a*this.c))))/(2*this.a));
		resultados[1]=(((-this.b)-(Math.sqrt((this.b*this.b)-(4*this.a*this.c))))/(2*this.a));
		System.out.println("+: "+resultados[0]+"-: "+resultados[1]);
	}
	
	public void obtenerRaiz() {
		double resultado=(((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		System.out.println(resultado);
	}
	
	public double getDiscriminante() {
		double d=((b*b)-(4*a*c));
		return d;
	}
	
	public boolean tieneRaices() {
		boolean raices=false;
		if(((b*b)-(4*a*c))>0) {
			raices=true;
		}
		return raices;
	}
	
	public boolean tieneRaiz() {
		boolean raiz=false;
		if(((b*b)-(4*a*c))==0) {
			raiz=true;
		}
		return raiz;
	}
	
	public void calcular() {
		double[] resultados=new double[2];
		double resultado=0;
		if(((b*b)-(4*a*c))>0) {
			resultados[0]=(((-this.b)+(Math.sqrt((this.b*this.b)-(4*this.a*this.c))))/(2*this.a));
			resultados[1]=(((-this.b)-(Math.sqrt((this.b*this.b)-(4*this.a*this.c))))/(2*this.a));
			for (int i = 0; i < resultados.length; i++) {
				System.out.println(resultados[i]);
			}
		}else{
			if(((b*b)-(4*a*c))==0) {
				resultado=(((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
				System.out.println(resultado);
			}else {
				System.out.println("No tiene ningun resultado posible");
			}
		}
	}
}
