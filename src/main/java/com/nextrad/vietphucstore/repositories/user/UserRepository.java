package com.nextrad.vietphucstore.repositories.user;

import com.nextrad.vietphucstore.dtos.responses.user.UserResponse;
import com.nextrad.vietphucstore.entities.user.User;
import com.nextrad.vietphucstore.enums.user.UserRole;
import com.nextrad.vietphucstore.enums.user.UserStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByFullName(String fullName);

    Optional<User> findByEmail(String email);

    boolean existsByEmailAndStatusNotLike(String email, UserStatus status);

    Page<UserResponse> findByRoleNotLikeAndFullNameContainsIgnoreCase(UserRole role, String fullName, Pageable pageable);

    Optional<User> findByIdAndRoleNotLike(UUID id, UserRole role);

    Optional<User> findByEmailAndStatus(String email, UserStatus status);
}