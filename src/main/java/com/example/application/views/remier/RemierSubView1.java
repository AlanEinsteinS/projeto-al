package com.example.application.views.remier;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
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
        // Layout principal
        VerticalLayout layout = new VerticalLayout();
        layout.setSizeFull();
        layout.setPadding(false);
        layout.setMargin(false);

        // Criação das abas
        Tabs tabs = new Tabs();
        Tab tab1 = new Tab("Introdução do Sistema e Como Funciona");
        Tab tab2 = new Tab("Criação de Personagem");
        Tab tab3 = new Tab("Regras do Jogo"); // Nova aba
        tabs.add(tab1, tab2, tab3);
        tabs.setWidthFull(); // Define a largura total das abas

        // Estiliza as abas para centralizá-las na parte superior
        HorizontalLayout tabsLayout = new HorizontalLayout(tabs);
        tabsLayout.setWidthFull(); // Define a largura total
        tabsLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER); // Centraliza horizontalmente
        tabsLayout.setAlignItems(FlexComponent.Alignment.CENTER); // Alinha verticalmente

        // Conteúdos das abas
        VerticalLayout tab1Content = new VerticalLayout();
        tab1Content.setSizeFull();
        tab1Content.setPadding(true);
        tab1Content.setMargin(false);

        // Conteúdo da Aba 1: Introdução do Sistema e Como Funciona
        H3 title1 = new H3("Introdução do Sistema e Como Funciona");
        Paragraph introContent = new Paragraph(
                "Esta seção será para explicar o básico do sistema e como você utilizaria ele.\n\n"
                + "Aqui você encontrará informações sobre as funcionalidades principais e como navegar pelo sistema."
        );
        tab1Content.add(title1, introContent);

        // Adiciona os componentes Details na Aba 1
        Details startingDetails = new Details("Começando", new Paragraph(
                "O sistema de Ordem Paranormal é a base de tudo que criamos. Ele é focado em histórias investigativas "
                + "com elementos paranormais, onde os players assumem o papel de investigadores enfrentando mistérios "
                + "e diversas criaturas. O sistema é simples de entender e oferece uma experiência imersiva, "
                + "perfeita para quem busca uma aventura cheia de suspense e tensão."
        ));
        startingDetails.setThemeName("filled"); // Aplica o tema "filled"

        Details whenToUseDetails = new Details("Quando Utilizar", new Paragraph(
                "Utilize este sistema sempre que precisar de campanhas de mistério, porque o Ordem Paranormal em si trabalha muito bem com isso. "
                + "Sendo assim, é ideal para mestres e players que buscam um sistema bom, enquanto pode ser simples e um pouco desafiador."
        ));
        whenToUseDetails.setThemeName("filled"); // Aplica o tema "filled"

        tab1Content.add(startingDetails, whenToUseDetails);

        // Conteúdo da Aba 2: Criação de Personagem
        VerticalLayout tab2Content = new VerticalLayout();
        tab2Content.setSizeFull();
        tab2Content.setPadding(true);
        tab2Content.setMargin(false);
        tab2Content.add(new H3("Criação de Personagem"), new Paragraph(
                "Nesta seção, exploramos o processo de criação de personagens dentro do sistema, incluindo:\n\n"
                + "- **Definição de Atributos**: Configure atributos como força, agilidade e inteligência.\n"
                + "- **Personalização Visual**: Escolha entre diversas opções de aparência e vestuário para seus personagens.\n"
                + "- **História e Background**: Adicione histórias e antecedentes para enriquecer a narrativa dos personagens."
        ));

        // Conteúdo da Aba 3: Regras do Jogo (Nova aba)
        VerticalLayout tab3Content = new VerticalLayout();
        tab3Content.setSizeFull();
        tab3Content.setPadding(true);
        tab3Content.setMargin(false);

        // Título com Select e Tooltip
        HorizontalLayout titleLayout = new HorizontalLayout();
        titleLayout.setWidthFull(); // Define a largura total para o layout do título
        titleLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.BETWEEN); // Alinha o conteúdo nas extremidades opostas

        H3 title3 = new H3("Regras do Jogo");

        // Criando o Select
        Select<String> select = new Select<>();
        select.setLabel("Ordenar por");
        select.setItems("Ordem Alfabética", "Ordem Padrão");
        select.setValue("Ordem Padrão");
        select.getElement().setProperty("title", "Select a sorting option to filter the rules."); // Tooltip

        titleLayout.add(title3, select);
        titleLayout.setAlignItems(FlexComponent.Alignment.CENTER);

        // Barra de pesquisa
        TextField searchBar = new TextField();
        searchBar.setPlaceholder("Pesquisar regras..."); // Placeholder de pesquisa
        searchBar.setWidthFull();

        // Grid para exibir as regras com detalhes expansíveis
        Grid<Rule> ruleGrid = new Grid<>();
        ruleGrid.addColumn(Rule::getName).setHeader("Nome da Regra").setAutoWidth(true);

        // Adicionando os detalhes expansíveis no Grid
        ruleGrid.setItemDetailsRenderer(new ComponentRenderer<>(rule -> {
            Paragraph details = new Paragraph(rule.getDescription());
            return new Details(rule.getName(), details);
        }));
        ruleGrid.addThemeVariants(GridVariant.LUMO_NO_BORDER);

        // Lista de regras
        rules = RuleFactory.createRules();
        ruleGrid.setItems(rules);

        // Função para ordenar as regras
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
                    // Ordena pela ordem padrão ou deixa inalterado
                    break;
            }
            ruleGrid.setItems(sortedRules);
        });

        // Filtro na barra de pesquisa
        searchBar.addValueChangeListener(event -> {
            String filter = event.getValue().toLowerCase();
            List<Rule> filteredRules = rules.stream()
                    .filter(rule -> rule.getName().toLowerCase().contains(filter))
                    .collect(Collectors.toList());
            ruleGrid.setItems(filteredRules);
        });

        tab3Content.add(titleLayout, searchBar, ruleGrid);

        // Inicializa com a primeira aba selecionada
        VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.setSizeFull();
        contentLayout.add(tab1Content); // Inicializa com conteúdo da Aba 1

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

        // Adiciona as abas e o conteúdo ao layout principal
        layout.add(tabsLayout, contentLayout);
        getContent().add(layout);
    }
}
