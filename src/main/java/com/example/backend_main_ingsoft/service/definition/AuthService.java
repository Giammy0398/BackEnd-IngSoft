package com.example.backend_main_ingsoft.service.definition;

import com.example.backend_main_ingsoft.dto.Response.UserLoginResponseDTO;
import com.example.backend_main_ingsoft.dto.Request.UserLoginRequestDTO;
import com.example.backend_main_ingsoft.dto.Request.UserRequestDTO;

/**
        * Service definition for authentication and registration.
        */
public interface AuthService <R extends UserRequestDTO> {
    /**
     * Authenticate a user using credentials DTO.
     *
     * @param userLoginRequestDTO login request containing username/email and password
     * @return {@link UserLoginResponseDTO} containing authentication token
     */
    UserLoginResponseDTO login(UserLoginRequestDTO userLoginRequestDTO);

    /**
     * Authenticate a user using username and password.
     *
     * @param username username or email
     * @param password plain text password
     * @return {@link UserLoginResponseDTO} containing authentication token
     */
    UserLoginResponseDTO login(String username, String password);

    /**
     * Register a new user.
     *
     * @param userRequestDTO registration data
     * @return {@link UserLoginResponseDTO} containing authentication token for the newly created user
     */
    UserLoginResponseDTO register(R userRequestDTO);
}
