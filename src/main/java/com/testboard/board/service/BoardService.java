package com.testboard.board.service;

import com.testboard.board.dto.BoardDTO;
import com.testboard.board.entity.BoardEntity;
import com.testboard.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// DTO > ENTITY (Entity class)
// ENTITY > DTO (DTO class)
// 변환하는 작업을 주로 service에서 한다

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public String save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity); // insert문이 실행된다
        return "index";
    }

    public List<BoardDTO> findAll() {
        List<BoardEntity> boardEntityList = boardRepository.findAll();
        List<BoardDTO> boardDTOList = new ArrayList<>();
        for (BoardEntity boardEntity : boardEntityList) {
            boardDTOList.add(BoardDTO.toBoardDTO(boardEntity));
        }
        return boardDTOList;
    }
}
