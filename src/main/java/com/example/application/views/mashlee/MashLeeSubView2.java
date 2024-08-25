package com.example.application.views.mashlee;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("MashLee RPG - Sub-item 2")
@Route(value = "mashlee-sub2", layout = MainLayout.class)
public class MashLeeSubView2 extends Composite<VerticalLayout> {

    public MashLeeSubView2() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
