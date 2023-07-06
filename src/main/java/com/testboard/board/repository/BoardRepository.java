package com.testboard.board.repository;

import com.testboard.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> { // entity명 / pk타입
}
