package com.narendra.pal.rapiride.services;

import com.narendra.pal.rapiride.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
