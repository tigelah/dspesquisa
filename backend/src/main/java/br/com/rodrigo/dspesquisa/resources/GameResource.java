package br.com.rodrigo.dspesquisa.resources;


import br.com.rodrigo.dspesquisa.dtos.GameDTO;
import br.com.rodrigo.dspesquisa.entities.Game;
import br.com.rodrigo.dspesquisa.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

    @Autowired
    private GameService gameService;


    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll(){
        List<GameDTO> list = gameService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
