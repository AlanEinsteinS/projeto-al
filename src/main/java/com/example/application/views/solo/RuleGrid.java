package com.example.application.views.solo;

import java.util.List;

import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;

public class RuleGrid extends VerticalLayout {

    public RuleGrid(List<SoloRule> rules) {
        Grid<SoloRule> ruleGrid = new Grid<>();
        ruleGrid.addColumn(SoloRule::getName).setHeader("Nome da Regra").setAutoWidth(true);

        ruleGrid.setItemDetailsRenderer(new ComponentRenderer<>(solorules -> {
            Div details = new Div();
            details.getElement().setProperty("innerHTML", solorules.getDescription().replace("\n", "<br>"));
            return new Details(solorules.getName(), details);
        }));
        
        ruleGrid.setItems(rules);
        add(ruleGrid);
    }
}
