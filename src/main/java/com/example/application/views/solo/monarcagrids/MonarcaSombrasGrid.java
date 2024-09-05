package com.example.application.views.solo.monarcagrids;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class MonarcaSombrasGrid extends VerticalLayout {

    public MonarcaSombrasGrid() {
        // Dados do Monarca das Sombras
        String[][] monarcaSombrasData = {
            {"5", "PASSIVA"},
            {"10", "2+ PRE OU 2+ AGI"},
            {"15", "ADAGAS DO REI DEMONIO"},
            {"20", "PRESENTE MISTERIOSO"},
            {"25", "EU ME ESCONDO NAS SOMBRAS"},
            {"30", "25+ SAN 1+ PRE"},
            {"35", "IGRIS"},
            {"40", "FISICO DO ASSASSINO"},
            {"45", "1+ PRE +2 INT"},
            {"50", "? ? ? + BERU"},
            {"55", "COURACA DOS MORTOS"},
            {"60", "LAMINA ANTI VIDA"},
            {"65", "PRESENTE MISTERIOSO"},
            {"70", "1+ PRE OU 1+ INT"},
            {"75", "DOMINIO DAS SOMBRAS"},
            {"80", "VS. ?"},
            {"85", "IDENTIDADE DO MONARCA"},
            {"90", "CRIADOR DE FENDAS"},
            {"95", "3+ PRE"},
            {"99", "ASHBORN EXERCITO"}
        };

        // Cria o grid para o Monarca das Sombras
        Grid<String[]> monarcaSombrasGrid = new Grid<>();
        monarcaSombrasGrid.addColumn(data -> data[0]).setHeader("Porcentagem").setAutoWidth(true);
        monarcaSombrasGrid.addColumn(data -> data[1]).setHeader("Nome do Poder").setAutoWidth(true);

        // Define o nome do monarca
        H3 monarcaSombrasTitle = new H3("Monarca das Sombras");

        // Adiciona os dados ao Grid
        monarcaSombrasGrid.setItems(monarcaSombrasData);

        // Adiciona o título e o Grid ao layout
        add(monarcaSombrasTitle, monarcaSombrasGrid);
    }
}