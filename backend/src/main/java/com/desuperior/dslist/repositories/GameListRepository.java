package com.desuperior.dslist.repositories;

import com.desuperior.dslist.entities.Game;
import com.desuperior.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
