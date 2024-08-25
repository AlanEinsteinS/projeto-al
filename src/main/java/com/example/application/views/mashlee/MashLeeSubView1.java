package com.example.application.views.mashlee;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("MashLee Sub-item 1")
@Route(value = "mashlee-sub1", layout = MainLayout.class)
public class MashLeeSubView1 extends Composite<VerticalLayout> {

    public MashLeeSubView1() {
        getContent().add(new Paragraph("Conteúdo do Sub-item 1 de MashLee RPG"));
    }
}
