package com.example.application.views.remier;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph; // Importação adicionada
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Remier RPG")
@Route(value = "remier-rpg", layout = MainLayout.class)
public class RemierRPGView extends VerticalLayout {

    public RemierRPGView() {
        H2 header = new H2("Remier RPG");
        add(header);
        add(new Paragraph("teste"));
    }
}
