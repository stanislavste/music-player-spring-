package ru.bogachev.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
    {
        for (int i = 1; i < 4; i++) {
            songs.add("rock song " + i);
        }
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
