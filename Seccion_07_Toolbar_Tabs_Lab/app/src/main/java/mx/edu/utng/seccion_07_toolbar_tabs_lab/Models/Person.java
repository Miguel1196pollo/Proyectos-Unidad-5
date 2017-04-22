package mx.edu.utng.seccion_07_toolbar_tabs_lab.Models;

/**
 * Created by Toshiba on 14/04/2017.
 */


public class Person {

    private String name;
    private Country country;

    public Person(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}