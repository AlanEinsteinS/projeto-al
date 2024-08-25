package com.example.application.views.jujutsu;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Jujutsu RPG - Sub-item 1")
@Route(value = "jujutsu-sub1", layout = MainLayout.class)
public class JujutsuSubView1 extends Composite<VerticalLayout> {

    public JujutsuSubView1() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
