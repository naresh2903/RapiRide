package com.narendra.pal.rapiride.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src, Point dest);
}
