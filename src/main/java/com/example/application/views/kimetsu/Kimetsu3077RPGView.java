package com.example.application.views.kimetsu;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph; // Importação adicionada
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Kimetsu 3077 RPG")
@Route(value = "kimetsu-3077-rpg", layout = MainLayout.class)
public class Kimetsu3077RPGView extends VerticalLayout {

    public Kimetsu3077RPGView() {
        H2 header = new H2("Kimetsu 3077 RPG");
        add(header);
        add(new Paragraph("This is the Kimetsu 3077 RPG view."));
    }
}
