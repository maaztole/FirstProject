package com.tnsif.assignment03;


class State extends Country {
    private String stateName;
    private int population; // Population in millions

    public State(String continentName, int continentPopulation, String countryName, int numberOfStates,
                 String stateName, int population) {
        super(continentName, continentPopulation, countryName, numberOfStates);
        this.stateName = stateName;
        this.population = population;
    }

    public String getStateName() {
        return stateName;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("State: " + getStateName());
        System.out.println("State Population: " + getPopulation() + " million");
    }
}