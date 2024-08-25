package com.example.application.views.sobre;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("Sobre")
@Route(value = "SOBRE", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class SobreView extends VerticalLayout {

    public SobreView() {
        setSpacing(false);

        Div logoContainer = new Div();

        Image img = new Image("https://cdn.discordapp.com/attachments/720826976163594280/1277373537128022129/ProjetoALlogo_3.png?ex=66ccee4f&is=66cb9ccf&hm=c74c6f1305e6dce7310536d0325acc3e21906c8943e853369bf5af5b66c4ff89&", "Projeto AL logo");
        
        H2 header = new H2("coisa do arruda q ele mudou");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);

        setSizeFull();
        setDefaultHorizontalComponentAlignment(Alignment.AUTO);
        getStyle().set("text-align", "center");
        logoContainer.add(img, header);

        add(logoContainer);
    }

}
