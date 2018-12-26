package br.com.devmedia.dao;

import java.util.List;

import br.com.devmedia.domain.Musica;

public interface MusicaDAO {

	void salvar(Musica musica);

	List<Musica> recuperarPorPlaylist(long playlistId);

	Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);

	void atualizar(Musica musica);

	void excluir(long musicaId);
}
