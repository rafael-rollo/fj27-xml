package br.com.cdc.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.cdc.loja.models.Produto;

@Repository
public class ProdutoDao {

	@PersistenceContext
	private EntityManager manager;

	public void save(Produto produto) {
		manager.persist(produto);
	}
	
	public List<Produto> lista() {
		return manager.createQuery(
				"select distinct(p) from Produto p join fetch p.precos",
				Produto.class).getResultList();
	}

}
