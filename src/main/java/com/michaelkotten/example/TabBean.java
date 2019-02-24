package com.michaelkotten.example;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@ViewScoped
public class TabBean {
    private List<TabInfo> tabs;

    @PostConstruct
    public void init() {
        tabs = Arrays.asList(new TabInfo("About", "about"),
                new TabInfo("Reviews", "reviews"),
                new TabInfo("Contact Us", "contact-us")
        );
    }

    public List<TabInfo> getTabs() {
        return tabs;
    }

    public String getTimeNow() {
        return LocalTime.now().toString();
    }
}
