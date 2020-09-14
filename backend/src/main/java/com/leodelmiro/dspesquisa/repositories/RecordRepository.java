package com.leodelmiro.dspesquisa.repositories;

import com.leodelmiro.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
