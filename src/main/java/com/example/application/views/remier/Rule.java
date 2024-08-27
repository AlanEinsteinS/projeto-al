package com.example.application.views.remier;

public class Rule {
    private String name;
    private String description;
    private int relevance; // Assuming relevance is an integer, adjust type as needed

    // Constructor, getters, and setters...

    public int getRelevance() {
        return relevance;
    }
    public Rule(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}


