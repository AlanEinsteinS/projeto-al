package com.example.application.views.remier;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.application.views.MainLayout;
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
@Route(value = "remier-sub1", layout = MainLayout.class)
public class RemierSubView1 extends Composite<VerticalLayout> {

    private List<Rule> rules;

    public RemierSubView1() {
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
        introContent.getElement().setProperty("innerHTML", "Esta seção será para explicar o básico do sistema e como você utilizaria ele.<br><br>Aqui você encontrará informações sobre as funcionalidades principais e como navegar pelo sistema.");
        tab1Content.add(title1, introContent);

        Details startingDetails = new Details("Começando", new Div("O sistema de Ordem Paranormal é a base de tudo que criamos. Ele é focado em histórias investigativas com elementos paranormais, onde os players assumem o papel de investigadores enfrentando mistérios e diversas criaturas. O sistema é simples de entender e oferece uma experiência imersiva, perfeita para quem busca uma aventura cheia de suspense e tensão."));
        startingDetails.setThemeName("filled");

        Details whenToUseDetails = new Details("Quando Utilizar", new Div("Utilize este sistema sempre que precisar de campanhas de mistério, porque o Ordem Paranormal em si trabalha muito bem com isso. Sendo assim, é ideal para mestres e players que buscam um sistema bom, enquanto pode ser simples e um pouco desafiador."));
        whenToUseDetails.setThemeName("filled");

        tab1Content.add(startingDetails, whenToUseDetails);

        VerticalLayout tab2Content = new VerticalLayout();
        tab2Content.setSizeFull();
        tab2Content.setPadding(true);
        tab2Content.setMargin(false);
        Div tab2ContentText = new Div();
        tab2ContentText.getElement().setProperty("innerHTML", "Nesta seção, exploramos o processo de criação de personagens dentro do sistema, incluindo:<br><br>" +
                "- <b>Definição de Atributos:</b> Configure atributos como força, agilidade e inteligência.<br>" +
                "- <b>Personalização Visual:</b> Escolha entre diversas opções de aparência e vestuário para seus personagens.<br>" +
                "- <b>História e Background:</b> Adicione histórias e antecedentes para enriquecer a narrativa dos personagens.");
        tab2Content.add(new H3("Criação de Personagem"), tab2ContentText);

        Details step1Details = new Details("Passo 1: Escolha de Conceito", new Div("O primeiro passo para criar uma ficha em Remier RPG é definir o conceito do seu personagem. Pense em quem ele é, qual é a sua história e quais são suas motivações. Este conceito guiará todas as escolhas subsequentes."));

        Details step2Details = new Details("Passo 2: Distribuição de Atributos", new Div("Distribua pontos entre os seguintes atributos: Força, Agilidade, Intelecto, Vigor, e Presença. Esses atributos determinarão o quão bem seu personagem executa ações relacionadas a cada área."));

        Details step3Details = new Details("Passo 3: Escolha de Habilidades", new Div("Selecione as habilidades que seu personagem possui. Habilidades podem incluir coisas como investigação, luta, ocultismo, etc. Cada habilidade pode ser aprimorada com o tempo, então pense duas vezes antes de escolher."));

        Details step4Details = new Details("Passo 4: Equipamentos e Recursos", new Div("Escolha os equipamentos que seu personagem carregará. Pense em itens que serão úteis para o seu Livro de anotações, armas, ferramentas de investigação, etc."));

        Details step5Details = new Details("Passo 5: Finalizando a Ficha", new Div("Revise todas as informações inseridas na ficha do seu personagem. Certifique-se de que o conceito está bem representado pelos atributos, habilidades e equipamentos escolhidos."));

        tab2Content.add(step1Details, step2Details, step3Details, step4Details, step5Details);

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

        Grid<Rule> ruleGrid = new Grid<>();
        ruleGrid.addColumn(Rule::getName).setHeader("Nome da Regra").setAutoWidth(true);

        ruleGrid.setItemDetailsRenderer(new ComponentRenderer<>(rule -> {
            Div details = new Div();
            details.getElement().setProperty("innerHTML", rule.getDescription().replace("\n", "<br>"));
            return new Details(rule.getName(), details);
        }));
        ruleGrid.addThemeVariants(GridVariant.LUMO_NO_BORDER);

        rules = RuleFactory.createRules();
        ruleGrid.setItems(rules);

        select.addValueChangeListener(event -> {
            String sortBy = event.getValue();
            List<Rule> sortedRules = rules;
            switch (sortBy) {
                case "Ordem Alfabética":
                    sortedRules = rules.stream()
                            .sorted(Comparator.comparing(Rule::getName))
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
            List<Rule> filteredRules = rules.stream()
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
