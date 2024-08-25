package com.example.application.views.jujutsu;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Jujutsu RPG")
@Route(value = "jujutsu-rpg", layout = MainLayout.class)
public class JujutsuRPGView extends Composite<VerticalLayout> {

    public JujutsuRPGView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
