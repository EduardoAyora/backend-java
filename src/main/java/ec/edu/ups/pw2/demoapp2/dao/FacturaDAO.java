package ec.edu.ups.pw2.demoapp2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pw2.demoapp2.model.Factura;

@Stateless
public class FacturaDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Factura factura) {
		em.persist(factura);
	}
	
	public void update(Factura factura) {
		em.merge(factura);
	}
	
	public Factura read(int id) {
		Factura factura = em.find(Factura.class, id);
		return factura;
	}
	
	public void delete(int id) {
		Factura factura = em.find(Factura.class, id);
		em.remove(factura);
	}
	
	public List<Factura> getList() {
		List<Factura> listado = new ArrayList<Factura>();
		String jpql = "SELECT fac FROM Factura fac";
		Query query = em.createQuery(jpql, Factura.class);
		listado = query.getResultList();
		
		return listado;
	}
}
