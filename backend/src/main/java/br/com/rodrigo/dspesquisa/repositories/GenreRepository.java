package br.com.rodrigo.dspesquisa.repositories;


import br.com.rodrigo.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {
}
