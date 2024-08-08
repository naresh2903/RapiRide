package com.narendra.pal.rapiride.services;

import com.narendra.pal.rapiride.dto.DriverDto;
import com.narendra.pal.rapiride.dto.RideDto;
import com.narendra.pal.rapiride.dto.RideRequestDto;
import com.narendra.pal.rapiride.dto.RiderDto;
import com.narendra.pal.rapiride.entities.Rider;
import com.narendra.pal.rapiride.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
