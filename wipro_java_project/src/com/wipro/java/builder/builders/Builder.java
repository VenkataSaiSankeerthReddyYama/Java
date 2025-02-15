package com.wipro.java.builder.builders;

import com.wipro.java.builder.cars.CarType;
import com.wipro.java.builder.components.Engine;
import com.wipro.java.builder.components.GPSNavigator;
import com.wipro.java.builder.components.Transmission;
import com.wipro.java.builder.components.TripComputer;

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