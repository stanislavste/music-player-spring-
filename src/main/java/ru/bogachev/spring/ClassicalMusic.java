package ru.bogachev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
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
