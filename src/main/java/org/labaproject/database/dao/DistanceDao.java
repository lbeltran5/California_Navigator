package org.labaproject.database.dao;

import org.apache.ibatis.annotations.Param;
import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Distance;

import java.util.List;

public interface DistanceDao {

    // These interfaces have methods for CRUD operations
    // (CREATE, READ, UPDATE, DELETE)
    Distance getDistanceById(int distanceId);
    List<Distance> getAllDistance();
    void addDistance(Distance distance);
    void updateDistance(Distance distance);
    void deleteDistance(int distanceId);
}
