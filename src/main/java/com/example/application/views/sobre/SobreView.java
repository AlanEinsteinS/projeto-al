package com.example.application.views.sobre;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.richtexteditor.RichTextEditor;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("Sobre")
@Route(value = "Sobre", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class SobreView extends VerticalLayout {

    public SobreView() {
        setSpacing(false);
        setPadding(false);
        setAlignItems(Alignment.CENTER); // Centraliza todo o conteúdo

        // Container para o logo
        Div logoContainer = new Div();

        // Logo do Projeto AL
        Image img = new Image("images/ProjetoALlogo.png", "Projeto AL logo");
        img.setWidth("600px");
        logoContainer.add(img);
        add(logoContainer);

        // Seção: Quem somos?
        H2 quemSomosHeader = new H2("Quem somos?");
        quemSomosHeader.addClassNames(Margin.Top.SMALL, Margin.Bottom.SMALL);
        add(quemSomosHeader);

        // RichTextEditor de descrição: Quem somos? (somente leitura)
        RichTextEditor quemSomosRichText = new RichTextEditor();
        quemSomosRichText.setWidth("800px");
        quemSomosRichText.setValue("Prazer eu sou o Alan sendo o cara que deu a ideia de inicio do projeto tenho 17 anos e sou um iniciante em progamação procurando evoluir.");
        quemSomosRichText.setReadOnly(true);
        add(quemSomosRichText);

        // Seção: Por que fizemos o Projeto: AL?
        H2 porqueFizemosHeader = new H2("Por que fizemos o Projeto: AL?");
        porqueFizemosHeader.addClassNames(Margin.Top.LARGE, Margin.Bottom.MEDIUM);
        add(porqueFizemosHeader);

        // RichTextEditor de descrição: Por que fizemos o Projeto: AL? (somente leitura)
        RichTextEditor porqueFizemosRichText = new RichTextEditor();
        porqueFizemosRichText.setWidth("800px");
        porqueFizemosRichText.setValue("O Project: AL foi criado com o objetivo de oferecer uma plataforma inovadora e robusta para mestres de RPG e jogadores que buscam levar suas aventuras a um novo patamar. Com ferramentas personalizáveis e recursos avançados, o Project: AL permite a criação de mundos complexos e narrativas envolventes, proporcionando uma experiência imersiva tanto para iniciantes quanto para veteranos no universo dos RPGs. Nosso objetivo é reunir todas as comunidades de RPG em um único local, facilitando a troca de ideias, a colaboração em campanhas e a criação de uma rede forte e unida de jogadores e mestres. Além disso, fornecemos diversos sistemas para que cada grupo possa escolher aquele que melhor se adapta ao seu estilo de jogo, garantindo que todos possam desfrutar de uma experiência rica e personalizada.");
        porqueFizemosRichText.setReadOnly(true);
        add(porqueFizemosRichText);
    }
}
