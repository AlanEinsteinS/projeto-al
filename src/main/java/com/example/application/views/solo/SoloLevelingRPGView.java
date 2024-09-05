package com.example.application.views.solo;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Solo Leveling RPG")
@Route(value = "solo-rpg", layout = MainLayout.class)
public class SoloLevelingRPGView extends VerticalLayout {

public SoloLevelingRPGView() {
    // Configurações básicas do layout
    setSpacing(true);
    setPadding(true);
    setSizeFull(); // Define o tamanho total disponível
    getStyle().set("text-align", "center"); // Centraliza o texto no layout

    // Cabeçalho principal
    H2 header = new H2("Solo Leveling RPG");
    header.addClassNames(LumoUtility.FontSize.XXLARGE, LumoUtility.FontWeight.BOLD, LumoUtility.TextColor.PRIMARY);
    add(header);

    // Seção de Data de Criação
    Div creationSection = new Div();
    creationSection.getStyle().set("text-align", "center"); // Centraliza o texto na seção
    H2 creationHeader = new H2("Criado em:");
    creationHeader.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.TextColor.SECONDARY);
    Paragraph creationDate = new Paragraph("22 de Abril 2024, por Misael Müller.");
    creationDate.addClassNames(LumoUtility.FontSize.MEDIUM, LumoUtility.Margin.Bottom.LARGE);
    creationSection.add(creationHeader, creationDate);
    add(creationSection);

    // Seção de Propósito
    Div purposeSection = new Div();
    purposeSection.getStyle().set("text-align", "center"); // Centraliza o texto na seção
    H2 purposeHeader = new H2("Por que foi criado?");
    purposeHeader.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.TextColor.SECONDARY);
    Paragraph purpose = new Paragraph("Eu criei o RPG de Mashle por alguns motivos mas o principal foi porque Mashle é um dos meus animes/mangas favoritos e o outros é pq eu queria criar a minha propria historia de Mashle baseado no Manga.");
    purpose.addClassNames(LumoUtility.FontSize.MEDIUM, LumoUtility.Margin.Bottom.LARGE);
    purposeSection.add(purposeHeader, purpose);
    add(purposeSection);

    Button actionButton = new Button("Participe dessa Comunidade");

    // Estilos principais do botão
    actionButton.getStyle().set("color", "#ffffff");  // Cor da fonte branca
    actionButton.getStyle().set("background-color", "#2c3e50");  // Fundo azul escuro
    actionButton.getStyle().set("border", "2px solid #34495e");  // Borda cinza escuro
    actionButton.getStyle().set("text-shadow", "0 0 2px #34495e");  // Sombra de texto mais sutil
    actionButton.getStyle().set("box-shadow", "0 0 5px #34495e");  // Sombra de caixa mais suave
    actionButton.getStyle().set("padding", "10px 20px");
    actionButton.getStyle().set("font-weight", "bold");
    actionButton.getStyle().set("font-size", "16px");
    actionButton.getStyle().set("border-radius", "5px");
    actionButton.getStyle().set("transition", "background-color 0.3s, box-shadow 0.3s");
        
    
    
    // Funcionalidade de redirecionamento
    actionButton.addClickListener(event -> getUI().ifPresent(ui -> ui.getPage().open("https://discord.gg/WmFZxtUSbj", "_blank")));
    
    // Margem no topo
    actionButton.addClassNames(LumoUtility.Margin.Top.LARGE);
    
    add(actionButton);    
    
    // Define o alinhamento padrão dos componentes
    setHorizontalComponentAlignment(Alignment.CENTER, header, creationSection, purposeSection, actionButton);
}
}
