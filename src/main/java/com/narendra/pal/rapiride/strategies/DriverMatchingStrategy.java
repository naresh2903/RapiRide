package com.narendra.pal.rapiride.strategies;

import com.narendra.pal.rapiride.entities.Driver;
import com.narendra.pal.rapiride.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
