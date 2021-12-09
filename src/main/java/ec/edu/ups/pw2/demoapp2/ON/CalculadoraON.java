package ec.edu.ups.pw2.demoapp2.ON;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pw2.demoapp2.dao.OperacionDAO;
import ec.edu.ups.pw2.demoapp2.model.Operacion;

@Stateless
public class CalculadoraON implements CalculadoraONRemote, CalculadoraONLocal {
	
	@Inject
	private OperacionDAO operacionDAO;
	
	public double suma(double a, double b) {
		double c = a + b;
		
		Operacion operacion = new Operacion();
		operacion.setA(a);
		operacion.setB(b);
		operacion.setOperacion("+");
		operacion.setR(c);
		operacionDAO.insert(operacion);
		
		System.out.println("Sumado en server: " + a + " + " + b);
		
		return c;
	}
	
	public double resta(double a, double b) {
		double c = a - b;
		return c;
	}
}
