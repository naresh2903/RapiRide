package com.narendra.pal.rapiride.repositories;

import com.narendra.pal.rapiride.entities.Payment;
import com.narendra.pal.rapiride.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}
