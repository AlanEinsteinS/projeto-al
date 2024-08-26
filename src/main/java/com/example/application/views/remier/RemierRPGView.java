package com.example.application.views.remier;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Remier RPG")
@Route(value = "remier-rpg", layout = MainLayout.class)
public class RemierRPGView extends VerticalLayout {

    public RemierRPGView() {
        // Configurações básicas do layout
        setSpacing(true);
        setPadding(true);
        setSizeFull(); // Define o tamanho total disponível
        getStyle().set("text-align", "center"); // Centraliza o texto no layout

        // Cabeçalho principal
        H2 header = new H2("Remier RPG");
        header.addClassNames(LumoUtility.FontSize.XXLARGE, LumoUtility.FontWeight.BOLD, LumoUtility.TextColor.PRIMARY);
        add(header);

        // Seção de Data de Criação
        Div creationSection = new Div();
        creationSection.getStyle().set("text-align", "center"); // Centraliza o texto na seção
        H2 creationHeader = new H2("Criado em:");
        creationHeader.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.TextColor.SECONDARY);
        Paragraph creationDate = new Paragraph("5 de Setembro de 2022, por Alan Einstein.");
        creationDate.addClassNames(LumoUtility.FontSize.MEDIUM, LumoUtility.Margin.Bottom.LARGE);
        creationSection.add(creationHeader, creationDate);
        add(creationSection);

        // Seção de Propósito
        Div purposeSection = new Div();
        purposeSection.getStyle().set("text-align", "center"); // Centraliza o texto na seção
        H2 purposeHeader = new H2("Por que foi criado?");
        purposeHeader.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.TextColor.SECONDARY);
        Paragraph purpose = new Paragraph("O Remier RPG foi inicialmente uma brincadeira minha que fiz com meus amigos e acabou que ficou pra historia se tornando algo um pouco mais duradouro do que eu imaginava, e foi crescendo e atualizando ate chegar nos dias de hoje onde ainda continua de pe tendo varias atualizações e modificações constantemente.");
        purpose.addClassNames(LumoUtility.FontSize.MEDIUM, LumoUtility.Margin.Bottom.LARGE);
        purposeSection.add(purposeHeader, purpose);
        add(purposeSection);

        // Seção de Informações Adicionais
        Div additionalInfoSection = new Div();
        additionalInfoSection.getStyle().set("text-align", "center"); // Centraliza o texto na seção
        H2 additionalInfoHeader = new H2("Informações Adicionais");
        additionalInfoHeader.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.TextColor.SECONDARY);
        Paragraph additionalInfo = new Paragraph("Este RPG foi desenvolvido para ser acessível a novos players enquanto ainda oferece desafios um pouco mais diversos para veteranos no assunto.");
        additionalInfo.addClassNames(LumoUtility.FontSize.MEDIUM, LumoUtility.Margin.Bottom.LARGE);
        Paragraph communityInfo = new Paragraph("O Remier RPG foi algo inicialmente baseado no sistema do Rafael Lange(Cellbit) e sendo moldada e adaptada a cada dia que se passa.");
        communityInfo.addClassNames(LumoUtility.FontSize.MEDIUM, LumoUtility.Margin.Bottom.LARGE);
        additionalInfoSection.add(additionalInfoHeader, additionalInfo, communityInfo);
        add(additionalInfoSection);

        // Adiciona um botão bonito no final com funcionalidade de redirecionamento
        Button actionButton = new Button("Participe dessa Comunidade");
        actionButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY); // Estilo bonito do botão
        actionButton.addClassNames(LumoUtility.Margin.Top.LARGE);
        actionButton.addClickListener(event -> getUI().ifPresent(ui -> ui.getPage().open("https://discord.gg/r7FafJT8", "_blank")));
        add(actionButton);

        // Define o alinhamento padrão dos componentes
        setHorizontalComponentAlignment(Alignment.CENTER, header, creationSection, purposeSection, additionalInfoSection, actionButton);
    }
}
