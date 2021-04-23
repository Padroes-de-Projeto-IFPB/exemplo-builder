package br.edu.ifpb.padroes.cars;

import br.edu.ifpb.padroes.cars.CarType;
import br.edu.ifpb.padroes.components.Engine;
import br.edu.ifpb.padroes.components.GPSNavigator;
import br.edu.ifpb.padroes.components.Transmission;
import br.edu.ifpb.padroes.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}