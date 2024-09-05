package com.example.application.views.solo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.application.views.MainLayout;
import com.example.application.views.solo.monarcagrids.MonarcaSombrasGrid;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Inicio e Sistema")
@Route(value = "solo-sub1", layout = MainLayout.class)
public class SoloLevelingSubView1 extends Composite<VerticalLayout> {

    private List<SoloRule> listsolorules;

    public SoloLevelingSubView1() {
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setPadding(false);
        layout.setMargin(false);

        Tabs tabs = new Tabs();
        Tab tab1 = new Tab("Introdução do Sistema e Como Funciona");
        Tab tab2 = new Tab("Criação de Personagem");
        Tab tab3 = new Tab("Regras do Sistema");
        tabs.add(tab1, tab2, tab3);
        tabs.setWidthFull();

        HorizontalLayout tabsLayout = new HorizontalLayout(tabs);
        tabsLayout.setWidthFull();
        tabsLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        tabsLayout.setAlignItems(FlexComponent.Alignment.CENTER);

        VerticalLayout tab1Content = new VerticalLayout();
        tab1Content.setSizeFull();
        tab1Content.setPadding(true);
        tab1Content.setMargin(false);

        H3 title1 = new H3("Introdução do Sistema e Como Funciona");
        Div introContent = new Div();
        introContent.getElement().setProperty("innerHTML", "");
        tab1Content.add(title1, introContent);

        Details startingDetails = new Details("Começando", new Div(""));
        startingDetails.setThemeName("filled");

        tab1Content.add(startingDetails);

        VerticalLayout tab2Content = new VerticalLayout();
        tab2Content.setSizeFull();
        tab2Content.setPadding(true);
        tab2Content.setMargin(false);
        Div tab2ContentText = new Div();
        tab2ContentText.getElement().setProperty("innerHTML", "");

        tab2Content.add(new H3("Criação de Personagem"), tab2ContentText);

        // Adiciona o grid do Monarca das Sombras
        MonarcaSombrasGrid monarcaSombrasGrid = new MonarcaSombrasGrid();
        tab2Content.add(monarcaSombrasGrid);

        VerticalLayout tab3Content = new VerticalLayout();
        tab3Content.setSizeFull();
        tab3Content.setPadding(true);
        tab3Content.setMargin(false);

        HorizontalLayout titleLayout = new HorizontalLayout();
        titleLayout.setWidthFull();
        titleLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN);

        H3 title3 = new H3("Regras do Sistema");

        Select<String> select = new Select<>();
        select.setLabel("Ordenar por");
        select.setItems("Ordem Alfabética", "Ordem Padrão");
        select.setValue("Ordem Padrão");
        select.getElement().setProperty("title", "ordene do jeito que preferir");

        titleLayout.add(title3, select);
        titleLayout.setAlignItems(FlexComponent.Alignment.CENTER);

        TextField searchBar = new TextField();
        searchBar.setPlaceholder("Pesquisar regras...");
        searchBar.setWidthFull();

        Grid<SoloRule> ruleGrid = new Grid<>();
        ruleGrid.addColumn(SoloRule::getName).setHeader("Nome da Regra").setAutoWidth(true);

        ruleGrid.setItemDetailsRenderer(new ComponentRenderer<>(solorules -> {
            Div details = new Div();
            details.getElement().setProperty("innerHTML", solorules.getDescription().replace("\n", "<br>"));
            return new Details(solorules.getName(), details);
        }));
        ruleGrid.addThemeVariants(GridVariant.LUMO_NO_BORDER);

        listsolorules = SoloRuleFactory.createRules();
        ruleGrid.setItems(listsolorules);

        select.addValueChangeListener(event -> {
            String sortBy = event.getValue();
            List<SoloRule> sortedRules = listsolorules;
            switch (sortBy) {
                case "Ordem Alfabética":
                    sortedRules = listsolorules.stream()
                            .sorted(Comparator.comparing(SoloRule::getName))
                            .collect(Collectors.toList());
                    break;
                case "Ordem Padrão":
                default:
                    break;
            }
            ruleGrid.setItems(sortedRules);
        });

        searchBar.addValueChangeListener(event -> {
            String filter = event.getValue().toLowerCase();
            List<SoloRule> filteredRules = listsolorules.stream()
                    .filter(rule -> rule.getName().toLowerCase().contains(filter))
                    .collect(Collectors.toList());
            ruleGrid.setItems(filteredRules);
        });

        tab3Content.add(titleLayout, searchBar, ruleGrid);

        VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.setSizeFull();
        contentLayout.add(tab1Content);

        tabs.addSelectedChangeListener(event -> {
            contentLayout.removeAll();
            if (event.getSelectedTab() == tab1) {
                contentLayout.add(tab1Content);
            } else if (event.getSelectedTab() == tab2) {
                contentLayout.add(tab2Content);
            } else if (event.getSelectedTab() == tab3) {
                contentLayout.add(tab3Content);
            }
        });

        layout.add(tabsLayout, contentLayout);
        getContent().add(layout);
    }
}
