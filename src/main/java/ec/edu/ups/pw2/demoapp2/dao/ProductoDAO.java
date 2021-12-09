package ec.edu.ups.pw2.demoapp2.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.pw2.demoapp2.model.Producto;

@Stateless
public class ProductoDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Producto producto) {
		em.persist(producto);
	}
	
	public void update(Producto producto) {
		em.merge(producto);
	}
	
	public Producto read(int id) {
		Producto producto = em.find(Producto.class, id);
		return producto;
	}
	
	public void delete(int id) {
		Producto producto = em.find(Producto.class, id);
		em.remove(producto);
	}
}
