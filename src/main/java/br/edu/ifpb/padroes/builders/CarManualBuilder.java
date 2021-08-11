package br.edu.ifpb.padroes.builders;

import br.edu.ifpb.padroes.cars.Builder;
import br.edu.ifpb.padroes.cars.CarType;
import br.edu.ifpb.padroes.cars.Manual;
import br.edu.ifpb.padroes.components.Engine;
import br.edu.ifpb.padroes.components.GPSNavigator;
import br.edu.ifpb.padroes.components.Transmission;
import br.edu.ifpb.padroes.components.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 *
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class CarManualBuilder implements Builder {
    private CarType type = CarType.CITY_CAR;
    private int seats = 5;
    private Engine engine;
    private Transmission transmission = Transmission.MANUAL;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public CarManualBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public CarManualBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarManualBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarManualBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarManualBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarManualBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}