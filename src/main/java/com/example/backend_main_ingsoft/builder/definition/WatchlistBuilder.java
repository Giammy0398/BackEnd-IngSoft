package com.example.backend_main_ingsoft.builder.definition;

import com.example.backend_main_ingsoft.model.jpa.Content;
import com.example.backend_main_ingsoft.model.jpa.Member;
import com.example.backend_main_ingsoft.model.jpa.Watchlist;

import java.util.List;

/**
 * Builder contract for creating {@link Watchlist} instances.
 */
public interface WatchlistBuilder extends EntityBuilder<Watchlist, WatchlistBuilder> {
    /** Set the watchlist name. */
    WatchlistBuilder name(String name);
    /** Set the contents list. */
    WatchlistBuilder contents(List<Content> contents);
    /** Set whether the watchlist is public. */
    WatchlistBuilder isPublic(Boolean isPublic);
    /** Set the owner member. */
    WatchlistBuilder member(Member member);
}
