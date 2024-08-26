package com.example.application.views.remier;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Inicio e Sistema")
@Route(value = "remier-sub1", layout = MainLayout.class)
public class RemierSubView1 extends Composite<VerticalLayout> {

    public RemierSubView1() {
        // Layout principal
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setPadding(true);
        layout.setSpacing(true);

        // Criação das abas
        Tabs tabs = new Tabs();
        Tab tab1 = new Tab("Aba 1");
        Tab tab2 = new Tab("Aba 2");
        tabs.add(tab1, tab2);

        // Adiciona estilo às abas
        tabs.getStyle().set("border-bottom", "1px solid #dcdcdc");

        // Conteúdos das abas
        VerticalLayout tab1Content = new VerticalLayout();
        tab1Content.addClassName("tab-content");
        tab1Content.add(new Paragraph("Conteúdo da Aba 1"));

        VerticalLayout tab2Content = new VerticalLayout();
        tab2Content.addClassName("tab-content");
        tab2Content.add(new Paragraph("Conteúdo da Aba 2"));

        // Inicializa com a primeira aba selecionada
        FlexLayout contentLayout = new FlexLayout();
        contentLayout.setSizeFull();
        contentLayout.add(tab1Content); // Inicializa com conteúdo da Aba 1
        contentLayout.setFlexDirection(FlexLayout.FlexDirection.COLUMN);

        tabs.addSelectedChangeListener(event -> {
            contentLayout.removeAll();
            if (event.getSelectedTab() == tab1) {
                contentLayout.add(tab1Content);
            } else {
                contentLayout.add(tab2Content);
            }
        });

        // Adiciona abas e o conteúdo ao layout principal
        layout.add(tabs, contentLayout);
        getContent().add(layout);
    }
}
