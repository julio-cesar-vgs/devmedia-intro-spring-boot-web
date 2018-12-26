package br.com.devmedia.dao;

import java.util.List;

import br.com.devmedia.domain.Playlist;

public interface PlaylistDAO {

	void salvar(Playlist playlist);

	List<Playlist> recuperar();

	Playlist recuperarPorID(long id);

	void atualizar(Playlist playlist);

	void excluir(long id);

}
