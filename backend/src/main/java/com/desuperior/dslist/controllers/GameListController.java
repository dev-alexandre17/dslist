package com.desuperior.dslist.controllers;

import com.desuperior.dslist.dto.GameDTO;
import com.desuperior.dslist.dto.GameListDTO;
import com.desuperior.dslist.dto.GameMinDTO;
import com.desuperior.dslist.services.GameListService;
import com.desuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
