package org.example.querydsl.domain.post.repository;

import org.example.querydsl.domain.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, UserQueryRepository {

}
