package com.tnsif.assignment03;

public class continent {
	    private String name;
	    private int population; 

	    public continent(String name, int population) {
	        this.name = name;
	        this.population = population;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getPopulation() {
	        return population;
	    }

	    public void displayInfo() {
	        System.out.println("Continent: " + getName());
	        System.out.println("Population: " + getPopulation() + " million");
	    }
	}


