package com.narendra.pal.rapiride.strategies.impl;

import com.narendra.pal.rapiride.entities.Driver;
import com.narendra.pal.rapiride.entities.RideRequest;
import com.narendra.pal.rapiride.repositories.DriverRepository;
import com.narendra.pal.rapiride.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional()
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
