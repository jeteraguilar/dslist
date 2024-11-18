package com.jetcursos.dslist.repositories;

import com.jetcursos.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
