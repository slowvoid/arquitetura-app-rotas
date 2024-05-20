package rota;

import java.util.ArrayList;

public class RotaAceitavelStrategy implements IRotaStrategy {
    private static RotaAceitavelStrategy _instance;

    private RotaAceitavelStrategy() {}

    public static RotaAceitavelStrategy getInstance() {
        if(_instance == null) {
            _instance = new RotaAceitavelStrategy();
        }

        return _instance;
    }

    public ArrayList<Coordenada> calculaTrajeto(Coordenada inicio, Coordenada destino) {
        System.out.println("Calculando rota aceitavel");
        return new ArrayList<>();
    }
}
