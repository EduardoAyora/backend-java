package ec.edu.ups.pw2.demoapp2.ON;

import javax.ejb.Stateless;

@Stateless
public class CalculadoraON {
	
	public double suma(double a, double b) {
		double c = a + b;
		return c;
	}
	
	public double resta(double a, double b) {
		double c = a - b;
		return c;
	}
}
