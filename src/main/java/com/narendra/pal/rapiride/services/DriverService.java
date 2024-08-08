package com.narendra.pal.rapiride.services;

import com.narendra.pal.rapiride.dto.DriverDto;
import com.narendra.pal.rapiride.dto.RideDto;
import com.narendra.pal.rapiride.dto.RiderDto;
import com.narendra.pal.rapiride.entities.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DriverService {

    RideDto acceptRide(Long rideRequestId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId, String otp);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Driver getCurrentDriver();

    Driver updateDriverAvailability(Driver driver, boolean available);
}
