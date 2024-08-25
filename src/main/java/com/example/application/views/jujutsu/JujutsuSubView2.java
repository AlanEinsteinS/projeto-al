package com.example.application.views.jujutsu;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Jujutsu RPG - Sub-item 2")
@Route(value = "jujutsu-sub2", layout = MainLayout.class)
public class JujutsuSubView2 extends Composite<VerticalLayout> {

    public JujutsuSubView2() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
