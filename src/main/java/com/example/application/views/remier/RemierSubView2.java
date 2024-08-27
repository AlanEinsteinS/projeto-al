package com.example.application.views.remier;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Remier Sub-item 2")
@Route(value = "remier-sub2", layout = MainLayout.class)
public class RemierSubView2 extends Composite<VerticalLayout> {

    public RemierSubView2() {
        getContent().add(new Paragraph("Conteúdo do Sub-item 2 de Remier"));
    }
}