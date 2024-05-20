package rota;

import java.util.ArrayList;

public class RotaAltamenteSeguraStrategy implements  IRotaStrategy {
    private static RotaAltamenteSeguraStrategy _instance;

    private RotaAltamenteSeguraStrategy() {}

    public static RotaAltamenteSeguraStrategy getInstance() {
        if(_instance == null) {
            _instance = new RotaAltamenteSeguraStrategy();
        }

        return _instance;
    }

    public ArrayList<Coordenada> calculaTrajeto(Coordenada inicio, Coordenada destino) {
        System.out.println("Calculando rota altamente segura");
        return new ArrayList<>();
    }
}
