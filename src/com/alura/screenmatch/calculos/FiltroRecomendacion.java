package com.alura.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasficacion()>=4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasficacion()>=4) {
            System.out.println("Popular en el momento");
        }else {
            System.out.println("Colocalo en tu lista para verlo después");
        }

    }
}
