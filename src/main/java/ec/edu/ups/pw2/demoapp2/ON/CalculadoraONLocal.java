package ec.edu.ups.pw2.demoapp2.ON;

import javax.ejb.Local;

@Local
public interface CalculadoraONLocal {
	
	public double suma(double a, double b);
}
