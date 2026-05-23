package com.example.backend_main_ingsoft.builder.definition;

import com.example.backend_main_ingsoft.model.jpa.Genre;
import com.example.backend_main_ingsoft.model.jpa.Member;

import java.time.LocalDate;
import java.util.List;

/**
 * Builder contract for creating {@link Member} instances.
 */
public interface MemberBuilder extends UserBuilder<Member, MemberBuilder> {
    /** Set first name. */
    MemberBuilder firstName(String name);
    /** Set last name. */
    MemberBuilder lastName(String name);
    /** Set birth date. */
    MemberBuilder birthDate(LocalDate birthDate);
    /** Set favorite genres. */
    MemberBuilder favoriteGenres(List<Genre> favoriteGenres);
}