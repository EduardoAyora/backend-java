package ec.edu.ups.pw2.demoapp2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Factura implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int numero;
	private Date fecha;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "per_cedula")
	private Persona cliente;
	
	@OneToMany
	@JoinColumn(name="fac_codigo")
	private List<DetalleFactura> detalles;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public List<DetalleFactura> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}
	
	
}
