package com.example.devopdracht;

/**
 * Created by lorenzo on 25-5-13.
 */


public class Datasaver {


    static int clickedFilm;
    static int clickedSerie;

    public Datasaver(){}

    public int getClickedFilm(){
        return clickedFilm;
    }
    public int getClickedSerie(){
        return clickedSerie;
    }

    public void setClickedFilm(int film) {
        clickedFilm = film;
    }
    public void setClickedSerie(int serie) {
        clickedSerie = serie;
    }

}
