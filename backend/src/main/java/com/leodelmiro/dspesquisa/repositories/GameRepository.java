package com.leodelmiro.dspesquisa.repositories;

import com.leodelmiro.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
