package br.com.rodrigo.dspesquisa.repositories;



import br.com.rodrigo.dspesquisa.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.Instant;


@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {

    @Query(value = "SELECT obj FROM Record obj WHERE " +
            "(coalesce(:min,null) IS NULL OR obj.moment >= :min) AND " +
            "(coalesce(:max,null) IS NULL OR obj.moment <= :max)")
//    @Query(value = "SELECT " +
//            "* " +
//            " FROM TB_RECORD " +
//            "WHERE " +
//            "MOMENT >= :min " +
//            "AND " +
//            "MOMENT <= :max ",nativeQuery = true)

//    @Query(value = "SELECT obj FROM Record obj")
    Page<Record> findByMoments(Instant min, Instant max, Pageable pageable);
}
