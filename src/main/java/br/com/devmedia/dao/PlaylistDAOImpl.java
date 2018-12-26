package br.com.devmedia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.devmedia.domain.Playlist;

@Repository
public class PlaylistDAOImpl implements PlaylistDAO{

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void salvar(Playlist playlist) {
		em.persist(playlist);
	}

	@Override
	public List<Playlist> recuperar() {
		return em.createQuery("select p from Playlist p", Playlist.class).getResultList();
	}

	@Override
	public Playlist recuperarPorID(long id) {
		return em.find(Playlist.class, id);
	}

	@Override
	public void atualizar(Playlist playlist) {
		em.merge(playlist);
	}

	@Override
	public void excluir(long id) {
		em.remove(em.getReference(Playlist.class, id));
	}


}
