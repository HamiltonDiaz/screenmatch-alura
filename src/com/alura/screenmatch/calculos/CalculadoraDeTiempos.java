package com.alura.screenmatch.calculos;

import com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempos {
    private int tiempoTotal;

    //Polimorfismo
    public void incluye(Titulo titulo){
        this.tiempoTotal+= titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
