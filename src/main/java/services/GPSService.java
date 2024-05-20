package services;

import rota.Coordenada;

public class GPSService {
    private static GPSService _instance;

    private GPSService() {
        System.out.println("Iniciando serviço de GPS");
    }

    public static GPSService getInstance() {
        if(_instance == null) {
            _instance = new GPSService();
        }

        return _instance;
    }

    public Coordenada getCoordenada() {
        return new Coordenada(1, 1);
    }

    public Coordenada getCoordenadaFromMap() {
        return new Coordenada(2, 2);
    }
}
