package br.com.rodrigo.dspesquisa.repositories;

import br.com.rodrigo.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
}
