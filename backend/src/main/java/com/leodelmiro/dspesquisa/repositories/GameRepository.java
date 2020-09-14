package com.leodelmiro.dspesquisa.repositories;

import com.leodelmiro.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
