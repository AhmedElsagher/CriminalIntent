package com.example.ahmed.criminalintent;

import java.util.UUID;

/**
 * Created by ahmed on 15/06/15.
 */
public class Crime {
    private UUID id;
    private String title;

    public Crime() {
        id = UUID.randomUUID();

    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

