package com.example.application.views.sobre;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("Sobre")
@Route(value = "sobre", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class SobreView extends VerticalLayout {

    public SobreView() {
        setSpacing(false);

        Div logoContainer = new Div();

        Image img = new Image("images/ProjetoALlogo.png", "Projeto AL logo");
        
        H2 header = new H2("This place intentionally left empty");
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM);

        setSizeFull();
        setDefaultHorizontalComponentAlignment(Alignment.AUTO);
        getStyle().set("text-align", "center");
        logoContainer.add(img, header);

        add(logoContainer);
    }

}
