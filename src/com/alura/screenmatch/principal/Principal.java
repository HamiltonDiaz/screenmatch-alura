package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.CalculadoraDeTiempos;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
//        miPelicula.setNombre("Encanto");
//        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos( 120);
        miPelicula.setIncluidoEnElPlan( true);
        miPelicula.muestaFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getSumaDeLasEvaluaciones());
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragón",2022);
//        casaDragon.setNombre("La casa del dragón");
//        casaDragon.setFechaDeLanzamiento (2022);
        casaDragon.setTemporadas (1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada (10);
        casaDragon.muestaFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matix",1998);
//        otraPelicula.setNombre("Matix");
//        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos( 180);

        CalculadoraDeTiempos calculadora= new CalculadoraDeTiempos();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos estas vacaciones " +calculadora.getTiempoTotal()+ " minutos.");

        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La cas Tagaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
//        peliculaDeBruno.setNombre("El señor de los anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);
//        peliculaDeBruno.setFechaDeLanzamiento(2001);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista " +listaDePeliculas.size());
        System.out.println("La primer película es: " + listaDePeliculas.get(0).getNombre() );

        System.out.println(listaDePeliculas.toString());
        System.out.println(listaDePeliculas.get(0).toString());
    }
}
