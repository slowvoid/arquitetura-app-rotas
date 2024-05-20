package rota;

import java.util.ArrayList;

public class Rota {
    private ArrayList<Coordenada> coordenadas;

    public Rota() {}

    public void calcularRota(Coordenada inicio, Coordenada destino, IRotaStrategy estrategia) {
        // Faz os calculos da rota
        this.coordenadas = estrategia.calculaTrajeto(inicio, destino);
    }
}
