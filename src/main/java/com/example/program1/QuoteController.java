package com.example.program1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private final List<String> quotes = new ArrayList<>() {{
        add("Життя — це те, що з тобою трапляється, коли ти плануєш інше.");
        add("Життя надто коротке, щоб не робити те, що тебе щасливим робить.");
        add("Коли життя дає тобі лимони, зроби з них лимонад.");
    }};

    @GetMapping("/quote")
    public String getRandomQuote() {
        Random random = new Random();
        int index = random.nextInt(quotes.size());
        return quotes.get(index);
    }
}