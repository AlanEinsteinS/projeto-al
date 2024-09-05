package com.example.application.views.solo;

public class SoloRule {
    private String soloname;
    private String solodescription;
    private int relevance; // Assuming relevance is an integer, adjust type as needed

    // Constructor, getters, and setters...

    public int getRelevance() {
        return relevance;
    }
    public SoloRule(String name, String description) {
        this.soloname = name;
        this.solodescription = description;
    }

    public String getName() {
        return soloname;
    }

    public String getDescription() {
        return solodescription;
    }
}