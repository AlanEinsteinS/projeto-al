package com.example.application.views.sobre;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
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

        // Container para o logo
        Div logoContainer = new Div();

        // Logo do Projeto AL
        Image img = new Image("https://cdn.discordapp.com/attachments/720826976163594280/1277373537128022129/ProjetoALlogo_3.png?ex=66ccee4f&is=66cb9ccf&hm=c74c6f1305e6dce7310536d0325acc3e21906c8943e853369bf5af5b66c4ff89&", "Projeto AL logo");
        img.setWidth("200px");
        logoContainer.add(img);
        logoContainer.getStyle().set("margin-left", "20px"); // Pequena margem à esquerda
        add(logoContainer);

        // Seção: Quem somos?
        H2 quemSomosHeader = new H2("Quem somos?");
        quemSomosHeader.addClassNames(Margin.Top.LARGE, Margin.Bottom.MEDIUM);
        add(quemSomosHeader);

        // TextArea de descrição: Quem somos? (somente leitura)
        TextArea quemSomosTextArea = new TextArea();
        quemSomosTextArea.setWidth("800px");
        quemSomosTextArea.setLabel("Descrição");
        quemSomosTextArea.setValue("Somos uma equipe dedicada ao desenvolvimento de soluções inovadoras e criativas para o mundo do RPG.");
        quemSomosTextArea.setReadOnly(true); // Somente leitura
        add(quemSomosTextArea);

        // Seção: Por que fizemos o Projeto: AL?
        H2 porqueFizemosHeader = new H2("Por que fizemos o Projeto: AL?");
        porqueFizemosHeader.addClassNames(Margin.Top.LARGE, Margin.Bottom.MEDIUM);
        add(porqueFizemosHeader);

        // TextArea de descrição: Por que fizemos o Projeto: AL? (somente leitura)
        TextArea porqueFizemosTextArea = new TextArea();
        porqueFizemosTextArea.setWidth("800px");
        porqueFizemosTextArea.setLabel("Descrição");
        porqueFizemosTextArea.setValue("O Project: AL foi criado para fornecer uma ferramenta poderosa para mestres de RPG e jogadores que desejam expandir suas aventuras.");
        porqueFizemosTextArea.setReadOnly(true); // Somente leitura
        add(porqueFizemosTextArea);

        // Estilização adicional para alinhar o conteúdo à esquerda
        getStyle().set("margin-left", "20px"); // Pequena margem à esquerda
        setWidthFull(); // Largura total do componente
    }
}
