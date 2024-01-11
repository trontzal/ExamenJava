package com.proyectorecetas;

public class Country {
    private final String name;
    private final Integer population;

    public Country(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

}
