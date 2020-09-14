package br.com.rodrigo.dspesquisa.services;

import br.com.rodrigo.dspesquisa.dtos.RecordDTO;
import br.com.rodrigo.dspesquisa.dtos.RecordInsertDTO;
import br.com.rodrigo.dspesquisa.entities.Game;
import br.com.rodrigo.dspesquisa.entities.Record;
import br.com.rodrigo.dspesquisa.repositories.GameRepository;
import br.com.rodrigo.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto){
        Record entity = new Record();

        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());
        
        Game game = gameRepository.getOne(dto.getGameId());
        entity.setGame(game);

        entity = recordRepository.save(entity);

        return new RecordDTO(entity);
    }

}
