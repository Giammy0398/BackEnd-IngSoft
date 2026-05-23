package com.example.backend_main_ingsoft.builder.definition;

import com.example.backend_main_ingsoft.model.jpa.Role;
import com.example.backend_main_ingsoft.model.jpa.User;
public interface
UserBuilder<U extends User, B extends UserBuilder<U, B>> extends EntityBuilder<U, B> {
    /** Set username. */
    B username(String username);
    /** Set email. */
    B email(String email);
    /** Set password. */
    B password(String password);
    /** Set role. */
    B role(Role role);
    /** Set s3 image key. */
    B s3ImageKey(String s3ImageKey);
    /** Set suspension end time. */
    B suspendedUntil(java.time.LocalDateTime suspendedUntil);
    /** Set suspension reason. */
    B suspendedReason(String suspendedReason);
}
