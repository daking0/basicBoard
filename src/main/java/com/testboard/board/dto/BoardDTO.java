package com.testboard.board.dto;

import lombok.*;

import java.time.LocalDateTime;

// DTO(Data Transfer Object) 데이터 전달하는 객체
//Lombok을 통해 자동으로 get / set을 사용 가능
@Getter
@Setter
@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long ID;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;
}
