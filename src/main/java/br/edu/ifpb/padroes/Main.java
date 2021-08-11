package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.builders.CarBuilder;
import br.edu.ifpb.padroes.builders.CarManualBuilder;
import br.edu.ifpb.padroes.cars.Car;
import br.edu.ifpb.padroes.cars.CarType;
import br.edu.ifpb.padroes.cars.Manual;
import br.edu.ifpb.padroes.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();


        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.print());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());


        director.constructFuscaCar(manualBuilder);
        Manual carFusca = manualBuilder.getResult();
        System.out.println("\nCar fusca built:\n" + carFusca.print());

    }

}
