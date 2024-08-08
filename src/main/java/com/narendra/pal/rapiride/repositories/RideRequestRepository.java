package com.narendra.pal.rapiride.repositories;

import com.narendra.pal.rapiride.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {

}
