package com.example.restoran.model.kitchen;

public abstract class Kitchen {
    private String name;
    private int units;
    private int salt;
    private int sunflowerOil;

    public Kitchen(String name, int units, int salt, int sunflowerOil) {
        this.name = name;
        this.units = units;
        this.salt = salt;
        this.sunflowerOil = sunflowerOil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public int getSunflowerOil() {
        return sunflowerOil;
    }

    public void setSunflowerOil(int sunflowerOil) {
        this.sunflowerOil = sunflowerOil;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "name='" + name + '\'' +
                ", units=" + units +
                ", salt=" + salt +
                ", sunflowerOil=" + sunflowerOil +
                '}';
    }
}
