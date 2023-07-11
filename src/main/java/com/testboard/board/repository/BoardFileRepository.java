package com.testboard.board.repository;

import com.testboard.board.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
}
