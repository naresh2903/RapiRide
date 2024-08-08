package com.narendra.pal.rapiride.strategies.impl;

import com.narendra.pal.rapiride.entities.Driver;
import com.narendra.pal.rapiride.entities.RideRequest;
import com.narendra.pal.rapiride.repositories.DriverRepository;
import com.narendra.pal.rapiride.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
