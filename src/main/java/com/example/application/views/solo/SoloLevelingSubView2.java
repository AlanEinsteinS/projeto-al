package com.example.application.views.solo;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Solo Leveling RPG - Sub-item 2")
@Route(value = "solo-sub2", layout = MainLayout.class)
public class SoloLevelingSubView2 extends Composite<VerticalLayout> {

    public SoloLevelingSubView2() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
