package br.edu.ifpb.padroes.builders;

import br.edu.ifpb.padroes.cars.Builder;
import br.edu.ifpb.padroes.cars.Car;
import br.edu.ifpb.padroes.cars.CarType;
import br.edu.ifpb.padroes.components.Engine;
import br.edu.ifpb.padroes.components.GPSNavigator;
import br.edu.ifpb.padroes.components.Transmission;
import br.edu.ifpb.padroes.components.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}