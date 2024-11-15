package org.example.querydsl.domain.post.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.example.querydsl.domain.user.UserEntity;

@Entity
public class PostEntity {
    @Id
    private Long id;

    private String title;

    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
