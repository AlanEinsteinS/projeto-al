package com.example.application.views.remier;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
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
        layout.setPadding(false);
        layout.setMargin(false);

        // Criação das abas
        Tabs tabs = new Tabs();
        Tab tab1 = new Tab("Introdução do Sistema e Como Funciona");
        Tab tab2 = new Tab("Criação de Personagem");
        tabs.add(tab1, tab2);
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
            "O sistema de Ordem Paranormal é a base de tudo que criamos. Ele é focado em histórias investigativas " +
            "com elementos sobrenaturais, onde os jogadores assumem o papel de investigadores enfrentando mistérios " +
            "e perigos ocultos. O sistema é simples de entender e oferece uma experiência rica e imersiva, " +
            "perfeita para quem busca uma aventura cheia de suspense e tensão."
        ));
        startingDetails.setThemeName("filled"); // Aplica o tema "filled"

        Details whenToUseDetails = new Details("Quando Utilizar", new Paragraph(
            "Utilize este sistema sempre que precisar gerenciar campanhas de RPG, criar personagens ou interagir com uma comunidade de jogadores. " +
            "É ideal para mestres e jogadores que buscam uma plataforma organizada e colaborativa."
        ));
        whenToUseDetails.setThemeName("filled"); // Aplica o tema "filled"

        tab1Content.add(startingDetails, whenToUseDetails);

        // Conteúdo da Aba 2: Criação de Personagem
        VerticalLayout tab2Content = new VerticalLayout();
        tab2Content.setSizeFull();
        tab2Content.setPadding(true);
        tab2Content.setMargin(false);

        H3 title2 = new H3("Criação de Personagem");
        Paragraph charCreationContent = new Paragraph(
            "Nesta seção, exploramos o processo de criação de personagens dentro do sistema, incluindo:\n\n"
            + "- **Definição de Atributos**: Configure atributos como força, agilidade e inteligência.\n"
            + "- **Personalização Visual**: Escolha entre diversas opções de aparência e vestuário para seus personagens.\n"
            + "- **História e Background**: Adicione histórias e antecedentes para enriquecer a narrativa dos personagens."
        );
        tab2Content.add(title2, charCreationContent);

        // Inicializa com a primeira aba selecionada
        VerticalLayout contentLayout = new VerticalLayout();
        contentLayout.setSizeFull();
        contentLayout.add(tab1Content); // Inicializa com conteúdo da Aba 1

        tabs.addSelectedChangeListener(event -> {
            contentLayout.removeAll();
            if (event.getSelectedTab() == tab1) {
                contentLayout.add(tab1Content);
            } else {
                contentLayout.add(tab2Content);
            }
        });

        // Adiciona as abas e o conteúdo ao layout principal
        layout.add(tabsLayout, contentLayout);
        getContent().add(layout);
    }
}
