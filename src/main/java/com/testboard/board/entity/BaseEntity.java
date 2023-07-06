package com.testboard.board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    // 시간정보를 다루는 entity
    @CreationTimestamp // 생성되었을 때 시간
    @Column(updatable = false) //수정시에는 이 값은 관여 안함
    private LocalDateTime createdTime;

    @UpdateTimestamp // 업데이트 발생 시 시간
    @Column(insertable = false) // 입력시에는 이 값은 관여 안함
    private LocalDateTime updatedTime;
}
