package com.example.application.views.remier;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Livros e Homebrews")
@Route(value = "remier-sub2", layout = MainLayout.class)
public class RemierSubView2 extends Composite<VerticalLayout> {

    private final VerticalLayout buttonLayout = new VerticalLayout();

    public RemierSubView2() {
        VerticalLayout layout = getContent();
        layout.setPadding(true);
        layout.setSpacing(true);
        layout.setAlignItems(FlexComponent.Alignment.CENTER); // Centraliza todos os itens verticalmente

        // Botões originais
        HorizontalLayout originalButtonsLayout = new HorizontalLayout(
            createOriginalButton("Manual do Portilho", "#9c27b0", "https://drive.google.com/file/d/1er3eVIGK2btomMUju1Izif5jvW5arYzn/view?usp=drive_link"),
            createOriginalButton("Ordem Paranormal RPG", "#c62828", "https://www.youtube.com/watch?v=dQw4w9WgXcQ"),
            createOriginalButton("Sobrevivendo ao Horror", "#2196f3", "https://www.youtube.com/watch?v=dQw4w9WgXcQ")
        );
        originalButtonsLayout.setSpacing(true);
        originalButtonsLayout.setAlignItems(FlexComponent.Alignment.CENTER);

        // Criação das abas
        Tabs tabs = new Tabs(
            new Tab("Livros Oficiais e Originais"),
            new Tab("Homebrews")
        );

        // Layout para as abas
        VerticalLayout homebrewTabContent = new VerticalLayout();
        homebrewTabContent.setAlignItems(FlexComponent.Alignment.CENTER);
        homebrewTabContent.setPadding(false);
        homebrewTabContent.setSpacing(true); // Adiciona espaçamento entre os botões
        homebrewTabContent.setWidth("100%"); // Garante que o conteúdo use toda a largura disponível

        // Cores mais escuras para os botões secundários
        String[] buttonColors = {
            "#343a40", "#212529", "#1c1e22", "#2d3033", "#282c30",
            "#202326", "#131517", "#191c1f", "#1b1f22", "#2e3235",
            "#151719", "#1a1c1e", "#0e1012", "#23262a"
        };

        // URLs para redirecionamento
        String[] urls = {
            "https://drive.google.com/file/d/165zHqAoWmsNWFJ_wVJHcPTwSYx4nAWbR/view", "https://drive.google.com/file/d/1lXAbOsIZgtEWTWGTi4hnrKeXIwKfnOoZ/view?usp=drive_link", "https://drive.google.com/file/d/1vijpsrS64oNKc0hwS-jEN3uQhAXM0j_Q/view?usp=drive_link", "https://drive.google.com/file/d/1Dz6Mv5qvt_G9FRRDQCSbyoq2UnA8064K/view?usp=drive_link",
            "https://drive.google.com/file/d/1_N7kD1Yw8k0kReGm6-igKzcUjr2tIH7P/view?usp=drive_link", "https://drive.google.com/file/d/1HETHw_0wg-KwQQNKMlzH-UPqsJo90epb/view?usp=drive_link", "https://drive.google.com/file/d/1IftsSO40ZBS82rd2GBRPo8-uI8B2MBZq/view?usp=drive_link", "https://drive.google.com/file/d/1Mqh0L1AqcEwfN7qCkCUyQLF6i_qdsmCl/view?usp=drive_link",
            "https://drive.google.com/file/d/101-RL2qK-TEbt123gdESb_iKDQqAXHOV/view?usp=drive_link", "https://drive.google.com/file/d/1A5p5-ZHpYbjh8817a904xHWA8lwJIPj6/view?usp=drive_link", "https://drive.google.com/file/d/10N9cWjZfIFEmwiaatE7eol0Y_h5VVnD3/view?usp=drive_link", "https://drive.google.com/file/d/1xJiGuxhsi6C0NdXkzv8AxRgqNWzsFnmm/view?usp=drive_link",
            "https://drive.google.com/file/d/1Ml5M2YK4zmwRQ6jqiq4KiNXUWWLbXrm_/view?usp=drive_link", "https://drive.google.com/file/d/1_xIDhsPZ5iZMY38Q4Wjyfuy-rf6IgniT/view?usp=drive_link", "https://drive.google.com/file/d/1_xIDhsPZ5iZMY38Q4Wjyfuy-rf6IgniT/view?usp=drive_link"
        };

        // Nomes dos botões
        String[] buttonNames = {
            "Agatha v0.4 Homebrew", "Protocolos de Energia v0.1 Homebrew", "Ordo Caos Homebrew", "Misterios do Outro Lado Homebrew", "Kimi's(0.5) Homebrew",
            "Jujutsu Kaisen OP(2.0) Homebrew", "Eduard Homebrew", "REDSKIN HOMEBREW 🦧", "MAINVIC(3.1) HOMEBREW 🎇", "Mega(0.2) Homebrew",
            "Expansão de Medo(2.0) Homebrew", "Elemento Vacuo (0.6) Homebrew", "Edição Expansiva(0.3) Homebrew", "A Contemplação do Outro Lado Homebrew"
        };

        for (int i = 0; i < buttonNames.length; i++) {
            int index = i; // Criar uma cópia final do índice
            Button homebrewButton = new Button(buttonNames[i]);
            homebrewButton.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
            homebrewButton.getStyle().set("background-color", buttonColors[i % buttonColors.length]);
            homebrewButton.getStyle().set("color", "#ffffff");
            homebrewButton.getStyle().set("font-weight", "bold");
            homebrewButton.getStyle().set("border-radius", "8px");
            homebrewButton.getStyle().set("padding", "10px 20px");
            homebrewButton.getStyle().set("box-shadow", "0px 4px 6px rgba(0, 0, 0, 0.3)");
            homebrewButton.addClickListener(event -> UI.getCurrent().getPage().open(urls[index], "_blank"));
            homebrewTabContent.add(homebrewButton);
        }

        // Adiciona conteúdo das abas
        tabs.addSelectedChangeListener(event -> {
            layout.removeAll();
            if (event.getSelectedTab().getLabel().equals("Livros Oficiais e Originais")) {
                layout.add(tabs, originalButtonsLayout);
            } else {
                layout.add(tabs, homebrewTabContent);
            }
        });

        // Adiciona a seção ao layout principal
        layout.add(tabs, originalButtonsLayout);
    }

    private Button createOriginalButton(String text, String textColor, String url) {
        Button button = new Button(text);
        button.addThemeVariants(ButtonVariant.LUMO_CONTRAST);
        button.getStyle().set("background-color", "#343a40"); // Background mais escuro
        button.getStyle().set("color", textColor); // Cor do texto
        button.getStyle().set("font-weight", "bold"); // Texto em negrito
        button.getStyle().set("border-radius", "8px"); // Bordas arredondadas
        button.getStyle().set("padding", "10px 20px"); // Padding para aumentar o tamanho do botão
        button.getStyle().set("box-shadow", "0px 4px 6px rgba(0, 0, 0, 0.3), 0 0 5px " + textColor); // Sombra e efeito neon fraco
        button.addClickListener(event -> UI.getCurrent().getPage().open(url, "_blank"));
        return button;
    }
}
