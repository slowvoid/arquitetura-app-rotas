package rota;

import java.util.ArrayList;

public class RotaSeguraStrategy implements IRotaStrategy{
    private static RotaSeguraStrategy _instance;

    private RotaSeguraStrategy() {}

    public static RotaSeguraStrategy getInstance() {
        if(_instance == null) {
            _instance = new RotaSeguraStrategy();
        }

        return _instance;
    }

    public ArrayList<Coordenada> calculaTrajeto(Coordenada inicio, Coordenada destino) {
        System.out.println("Calculando rota segura");
        return new ArrayList<>();
    }
}
