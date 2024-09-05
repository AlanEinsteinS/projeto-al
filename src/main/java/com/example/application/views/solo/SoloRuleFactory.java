package com.example.application.views.solo;

import java.util.ArrayList;
import java.util.List;


public class SoloRuleFactory {

    public static List<SoloRule> createRules() {
        List<SoloRule> solorules = new ArrayList<>();

        solorules.add(new SoloRule("PERICIAS", "<b>Da Pagina 49 ate 57 no livro.<b>"));

        return solorules;
    }}