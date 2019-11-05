package ru.bogachev.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMuInit() {
        System.out.println("do my init");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("do my destroy");
    }

    private List<String> songs = new ArrayList<>();
    {
        for (int i = 1; i < 4; i++) {
            songs.add("classic song " + i);
        }
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
