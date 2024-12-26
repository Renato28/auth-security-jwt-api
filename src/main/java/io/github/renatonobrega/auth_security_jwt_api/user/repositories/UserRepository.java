package io.github.renatonobrega.auth_security_jwt_api.user.repositories;

import io.github.renatonobrega.auth_security_jwt_api.user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
    UserDetails findByEmail(String email);
}
