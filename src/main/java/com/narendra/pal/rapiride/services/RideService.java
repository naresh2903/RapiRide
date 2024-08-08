package com.narendra.pal.rapiride.services;

import com.narendra.pal.rapiride.entities.Driver;
import com.narendra.pal.rapiride.entities.Ride;
import com.narendra.pal.rapiride.entities.RideRequest;
import com.narendra.pal.rapiride.entities.Rider;
import com.narendra.pal.rapiride.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
