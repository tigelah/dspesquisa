package br.com.rodrigo.dspesquisa.repositories;

import br.com.rodrigo.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
