package mx.edu.utng.seccion_03_recycler_card_view.models;

/**
 * Created by Toshiba on 10/04/2017.
 */
public class Movie {

    public String name;
    public int poster;

    public Movie() {

    }

    public Movie(String name, int poster) {
        this.name = name;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
