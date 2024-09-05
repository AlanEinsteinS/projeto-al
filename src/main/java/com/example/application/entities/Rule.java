package com.example.application.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Rule {
    private Long id;
    private String label;
    private String content;
}