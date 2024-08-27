package com.example.application.views;

import org.vaadin.lineawesome.LineAwesomeIcon;

import com.example.application.views.jujutsu.JujutsuRPGView;
import com.example.application.views.jujutsu.JujutsuSubView1;
import com.example.application.views.jujutsu.JujutsuSubView2;
import com.example.application.views.kimetsu.Kimetsu3077RPGView;
import com.example.application.views.kimetsu.KimetsuSubView1;
import com.example.application.views.kimetsu.KimetsuSubView2;
import com.example.application.views.mashlee.MashLeeRPGView;
import com.example.application.views.mashlee.MashLeeSubView1;
import com.example.application.views.mashlee.MashLeeSubView2;
import com.example.application.views.remier.RemierRPGView;
import com.example.application.views.remier.RemierSubView1;
import com.example.application.views.remier.RemierSubView2;
import com.example.application.views.sobre.SobreView;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class MainLayout extends AppLayout {

    private H1 viewTitle;

    public MainLayout() {
        setPrimarySection(Section.DRAWER);
        addDrawerContent();
        addHeaderContent();
    }

    private void addHeaderContent() {
        DrawerToggle toggle = new DrawerToggle();
        toggle.setAriaLabel("Menu toggle");

        viewTitle = new H1();
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);

        addToNavbar(true, toggle, viewTitle);
    }

    private void addDrawerContent() {
        // Adicionar a logo do projeto
        Image logo = new Image("images/projetologo.png", "Projeto AL logo");
        logo.setWidth("150px");
        logo.addClassNames("project-logo");

        // Adicionar logo e nome ao header
        Header header = new Header(logo);

        Scroller scroller = new Scroller(createNavigation());

        addToDrawer(header, scroller, createFooter());
    }

    private SideNav createNavigation() {
        SideNav nav = new SideNav();

        // Sobre
        nav.addItem(new SideNavItem("Sobre", SobreView.class, LineAwesomeIcon.CAMPGROUND_SOLID.create()));

        // Remier RPG
        SideNavItem remierRPG = new SideNavItem("Remier RPG", RemierRPGView.class, LineAwesomeIcon.PENCIL_RULER_SOLID.create());
        remierRPG.addItem(new SideNavItem("Inicio e Sistema", RemierSubView1.class));
        remierRPG.addItem(new SideNavItem("Sub-item 2", RemierSubView2.class));
        nav.addItem(remierRPG);

        // Jujutsu RPG
        SideNavItem jujutsuRPG = new SideNavItem("Jujutsu RPG", JujutsuRPGView.class, LineAwesomeIcon.PENCIL_RULER_SOLID.create());
        jujutsuRPG.addItem(new SideNavItem("Sub-item 1", JujutsuSubView1.class));
        jujutsuRPG.addItem(new SideNavItem("Sub-item 2", JujutsuSubView2.class));
        nav.addItem(jujutsuRPG);

        // MashLee RPG
        SideNavItem mashLeeRPG = new SideNavItem("MashLee RPG", MashLeeRPGView.class, LineAwesomeIcon.GAMEPAD_SOLID.create());
        mashLeeRPG.addItem(new SideNavItem("Sub-item 1", MashLeeSubView1.class));
        mashLeeRPG.addItem(new SideNavItem("Sub-item 2", MashLeeSubView2.class));
        nav.addItem(mashLeeRPG);

        // Kimetsu 3077 RPG
        SideNavItem kimetsuRPG = new SideNavItem("Kimetsu 3077 RPG", Kimetsu3077RPGView.class, LineAwesomeIcon.GAMEPAD_SOLID.create());
        kimetsuRPG.addItem(new SideNavItem("Sub-item 1", KimetsuSubView1.class));
        kimetsuRPG.addItem(new SideNavItem("Sub-item 2", KimetsuSubView2.class));
        nav.addItem(kimetsuRPG);

        return nav;
    }

    private Footer createFooter() {
        Footer layout = new Footer();

        return layout;
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        viewTitle.setText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        PageTitle title = getContent().getClass().getAnnotation(PageTitle.class);
        return title == null ? "" : title.value();
    }
}
