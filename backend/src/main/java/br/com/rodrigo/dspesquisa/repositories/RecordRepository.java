package br.com.rodrigo.dspesquisa.repositories;


import br.com.rodrigo.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record,Long> {
}
