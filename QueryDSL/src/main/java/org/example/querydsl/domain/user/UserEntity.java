package org.example.querydsl.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.querydsl.domain.post.entity.PostEntity;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class UserEntity {
    @Id
    private Long id;
    private String accountId;
    private String password;
    @OneToMany
    private List<PostEntity> posts;
}
