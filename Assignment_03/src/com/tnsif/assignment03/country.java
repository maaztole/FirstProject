package com.tnsif.assignment03;


class Country extends continent {
    private String countryName;
    private int numberOfStates;

    public Country(String continentName, int continentPopulation, String countryName, int numberOfStates) {
        super(continentName, continentPopulation);
        this.countryName = countryName;
        this.numberOfStates = numberOfStates;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getNumberOfStates() {
        return numberOfStates;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Country: " + getCountryName());
        System.out.println("Number of States: " + getNumberOfStates());
    }
}
