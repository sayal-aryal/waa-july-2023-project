package com.miu.waa.aluminimanagement.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private Student student;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    private Faculty faculty;
    private boolean isDeleted = false;
}

