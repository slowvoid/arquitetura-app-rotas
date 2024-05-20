package main;

import rota.*;
import services.GPSService;

public class App {
    public static void main(String args[]) {
        System.out.println("Iniciando app rotas");

        GPSService gps = GPSService.getInstance();
        Rota rotaAtual = new Rota();
        Coordenada posicaoAtual = gps.getCoordenada();
        Coordenada destino = gps.getCoordenadaFromMap();

        // Calcula rota a partir de parametros de segurança
        int x = 2;
        switch (x) {
            case 0:
                rotaAtual.calcularRota(posicaoAtual, destino, RotaAceitavelStrategy.getInstance());
                break;
            case 1:
                rotaAtual.calcularRota(posicaoAtual, destino, RotaAltamenteSeguraStrategy.getInstance());
                break;
            case 2:
                rotaAtual.calcularRota(posicaoAtual, destino, RotaSeguraStrategy.getInstance());
                break;
            default:
                rotaAtual.calcularRota(posicaoAtual, destino, RotaAceitavelStrategy.getInstance());
        }
    }
}
