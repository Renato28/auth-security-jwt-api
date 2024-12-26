package io.github.renatonobrega.auth_security_jwt_api.user.dtos;

import io.github.renatonobrega.auth_security_jwt_api.user.model.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterDto(@NotBlank String email, @NotBlank String password, @NotNull UserRole role) {
}
