package com.example.backend_main_ingsoft.dto.Response;

import com.example.backend_main_ingsoft.model.jpa.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class UserResponseDTO extends EntityResponseDTO {
    private String username;
    private String email;
    private Role role;
    private String base64Image;

    public UserResponseDTO(
            Long id,
            String username,
            String email,
            Role role,
            String base64Image
    ) {
        super(id);
        this.username = username;
        this.email = email;
        this.role = role;
        this.base64Image = base64Image;
    }
}
