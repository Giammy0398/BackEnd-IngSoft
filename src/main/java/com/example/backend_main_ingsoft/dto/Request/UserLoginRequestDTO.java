package com.example.backend_main_ingsoft.dto.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * DTO for user login request.
 */
@Data
public class UserLoginRequestDTO {
    @NotBlank(message = "Username or e-mail is mandatory")
    private String username;

    @NotBlank(message = "Password is mandatory")
    private String password;
}
