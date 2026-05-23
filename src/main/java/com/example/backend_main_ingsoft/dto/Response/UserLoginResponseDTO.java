package com.example.backend_main_ingsoft.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * DTO for user login response containing the access token.
 */
@Data
@AllArgsConstructor
public class UserLoginResponseDTO {
    private String accessToken;
}
