package com.leodelmiro.dspesquisa.services;

import com.leodelmiro.dspesquisa.dtos.RecordDTO;
import com.leodelmiro.dspesquisa.dtos.RecordInsertDTO;
import com.leodelmiro.dspesquisa.entities.Game;
import com.leodelmiro.dspesquisa.entities.Record;
import com.leodelmiro.dspesquisa.repositories.GameRepository;
import com.leodelmiro.dspesquisa.repositories.RecordRepository;
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
