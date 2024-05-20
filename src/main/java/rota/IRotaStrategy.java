package rota;

import java.util.ArrayList;

public interface IRotaStrategy {
   ArrayList<Coordenada> calculaTrajeto(Coordenada inicio, Coordenada destino);
}
