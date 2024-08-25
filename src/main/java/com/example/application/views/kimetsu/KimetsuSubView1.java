package com.example.application.views.kimetsu;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Kimetsu 3077 RPG - Sub-item 1")
@Route(value = "kimetsu-sub1", layout = MainLayout.class)
public class KimetsuSubView1 extends Composite<VerticalLayout> {

    public KimetsuSubView1() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
