package br.com.rodrigo.dspesquisa.resources;


import br.com.rodrigo.dspesquisa.dtos.RecordDTO;

import br.com.rodrigo.dspesquisa.dtos.RecordInsertDTO;
import br.com.rodrigo.dspesquisa.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/records")
public class RecordResource {

    @Autowired
    private RecordService recordService;


    @PostMapping
    public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
        RecordDTO newDTO = recordService.insert(dto);
        return ResponseEntity.ok().body(newDTO);
    }

}
