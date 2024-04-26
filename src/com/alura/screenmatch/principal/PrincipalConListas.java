package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(5);
        Pelicula otraPelicula = new Pelicula("Matix",1998);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.evalua(10);
        Serie casaDragon = new Serie("La casa del dragón",2022);

        List<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

//        lista.forEach(nombre -> System.out.println("->" + nombre.getNombre()));

        for (Titulo item: lista){
            System.out.println(item.getNombre());

            if (item instanceof Pelicula pelicula && pelicula.getClasficacion()>2){
                System.out.println(pelicula.getClasficacion());
            }
        }

        ArrayList<String> listaArtistas= new ArrayList<>();
        listaArtistas.add("Penélope Cruz");
        listaArtistas.add("Antonio Banderas");
        listaArtistas.add("Ricardo Darin");
        System.out.println(listaArtistas);

        Collections.sort(listaArtistas);
        System.out.println("Lista de artistas ordenada:" +listaArtistas);

        //Para comparar titulos se debe agregar una interfaz "comparable" en la clase título
        //Y agregar el método "compareTo"
        Collections.sort(lista);
        System.out.println("Lista ordenada de títulos: " + lista);

        //Ordenar por fecha
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada de fecha de lanzamiento: " + lista);

    }
}
