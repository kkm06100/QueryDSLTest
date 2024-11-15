package org.example.querydsl.domain.post.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.example.querydsl.domain.user.QUserEntity;
import org.example.querydsl.domain.user.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserQueryRepositoryImpl implements UserQueryRepository{
    private final JPAQueryFactory jpaQueryFactory;
    @Override
    public UserEntity findAllLeftFetchJoin(Long id) {
        QUserEntity user = QUserEntity.userEntity;
        return jpaQueryFactory.selectFrom(user)
                .where(user.id.eq(id))
                .leftJoin(user.posts)
                .fetchJoin()
                .fetchOne();
    }
}
