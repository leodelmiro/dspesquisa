package com.leodelmiro.dspesquisa.repositories;

import com.leodelmiro.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
