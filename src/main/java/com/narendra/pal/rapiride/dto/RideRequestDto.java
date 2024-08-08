package com.narendra.pal.rapiride.dto;

import com.narendra.pal.rapiride.entities.enums.PaymentMethod;
import com.narendra.pal.rapiride.entities.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;

    private PointDto pickupLocation;
    private PointDto dropOffLocation;
    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private RiderDto rider;
    private Double fare;

    private RideRequestStatus rideRequestStatus;
}
