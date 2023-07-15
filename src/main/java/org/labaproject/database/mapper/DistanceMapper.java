package org.labaproject.database.mapper;

import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Distance;

import java.util.List;

public interface DistanceMapper {
    Distance getDistanceById(int distanceId);
    List<Distance> getAllDistance();
    void addDistance(Distance distance);
    void updateDistance(Distance distance);
    void deleteDistance(int distanceId);
}
