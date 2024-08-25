package com.example.application.views.kimetsu;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Kimetsu 3077 RPG - Sub-item 2")
@Route(value = "kimetsu-sub2", layout = MainLayout.class)
public class KimetsuSubView2 extends Composite<VerticalLayout> {

    public KimetsuSubView2() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
