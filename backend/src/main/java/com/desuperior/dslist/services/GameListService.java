package com.desuperior.dslist.services;

import com.desuperior.dslist.dto.GameDTO;
import com.desuperior.dslist.dto.GameListDTO;
import com.desuperior.dslist.dto.GameMinDTO;
import com.desuperior.dslist.entities.Game;
import com.desuperior.dslist.entities.GameList;
import com.desuperior.dslist.repositories.GameListRepository;
import com.desuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
