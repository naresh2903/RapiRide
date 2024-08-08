package com.narendra.pal.rapiride.repositories;

import com.narendra.pal.rapiride.entities.Driver;
import com.narendra.pal.rapiride.entities.Ride;
import com.narendra.pal.rapiride.entities.Rider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
    Page<Ride> findByRider(Rider rider, Pageable pageRequest);

    Page<Ride> findByDriver(Driver driver, Pageable pageRequest);
}
