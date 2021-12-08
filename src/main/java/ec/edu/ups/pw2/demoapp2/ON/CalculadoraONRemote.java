package ec.edu.ups.pw2.demoapp2.ON;

import javax.ejb.Remote;

@Remote
public interface CalculadoraONRemote {

	public double suma(double a, double b);
}
