package com.example.application.views.mashlee;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph; // Importação adicionada
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("MashLee RPG")
@Route(value = "mashlee-rpg", layout = MainLayout.class)
public class MashLeeRPGView extends VerticalLayout {

    public MashLeeRPGView() {
        H2 header = new H2("MashLee RPG");
        add(header);
        add(new Paragraph("This is the MashLee RPG view."));
    }
}
