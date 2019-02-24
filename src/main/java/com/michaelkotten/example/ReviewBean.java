package com.michaelkotten.example;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Collections;
import java.util.List;

@ManagedBean
@ViewScoped
public class ReviewBean {

    @PostConstruct
    public void init() {
        System.out.println("ReviewBean init");
    }

    public String getReview() {
        return "This is a review";
    }

    public List<String> getValues() {
        return Collections.singletonList(getReview());
    }
}
