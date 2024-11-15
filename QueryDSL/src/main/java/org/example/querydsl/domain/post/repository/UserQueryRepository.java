package org.example.querydsl.domain.post.repository;

import org.example.querydsl.domain.user.UserEntity;

public interface UserQueryRepository {
    UserEntity findAllLeftFetchJoin(Long id);
}