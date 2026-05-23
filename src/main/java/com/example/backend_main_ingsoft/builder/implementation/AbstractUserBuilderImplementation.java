package com.example.backend_main_ingsoft.builder.implementation;


import com.example.backend_main_ingsoft.builder.definition.UserBuilder;
import com.example.backend_main_ingsoft.model.jpa.Role;
import com.example.backend_main_ingsoft.model.jpa.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.time.LocalDateTime;

@SuppressWarnings("unchecked")
@RequiredArgsConstructor
@Getter
public abstract class AbstractUserBuilderImplementation<U extends User, B extends UserBuilder<U, B>> implements UserBuilder<U, B> {
    protected Long id;
    protected String username;
    protected String email;
    protected String password;
    protected Role role;
    protected String s3ImageKey;
    protected LocalDateTime suspendedUntil;
    protected String suspendedReason;

    /** {@inheritDoc} */
    @Override
    public B id(Long id) {
        this.id = id;
        return (B) this;
    }

    /** {@inheritDoc} */
    @Override
    public B username(String username) {
        this.username = username;
        return (B) this;
    }

    /** {@inheritDoc} */
    @Override
    public B email(String email) {
        this.email = email;
        return (B) this;
    }

    /** {@inheritDoc} */
    @Override
    public B password(String password) {
        this.password = password;
        return (B) this;
    }

    /** {@inheritDoc} */
    @Override
    public B role(Role role) {
        this.role = role;
        return (B) this;
    }

    /** {@inheritDoc} */
    @Override
    public B s3ImageKey(String s3ImageKey) {
        this.s3ImageKey = s3ImageKey;
        return (B) this;
    }

    /** {@inheritDoc} */
    @Override
    public B suspendedUntil(java.time.LocalDateTime suspendedUntil) {
        this.suspendedUntil = suspendedUntil;
        return (B) this;
    }

    /** {@inheritDoc} */
    @Override
    public B suspendedReason(String suspendedReason) {
        this.suspendedReason = suspendedReason;
        return (B) this;
    }
}
