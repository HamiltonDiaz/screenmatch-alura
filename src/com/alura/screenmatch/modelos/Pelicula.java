package com.alura.screenmatch.modelos;
import com.alura.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

/*    public Pelicula(String nombre) {
        this.setNombre(nombre);
    }*/

    public Pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasficacion() {
        return (int) (calculaMedia()/2);
    }

    @Override
    public String toString() {
        return "Película: " + this.getNombre() + " (" + getFechaDeLanzamiento() +")";
    }
}

