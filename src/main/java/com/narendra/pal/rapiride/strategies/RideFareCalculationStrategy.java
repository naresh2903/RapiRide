package com.narendra.pal.rapiride.strategies;

import com.narendra.pal.rapiride.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);

}
