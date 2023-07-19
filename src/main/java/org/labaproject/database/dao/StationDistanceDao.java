package org.labaproject.database.dao;

import java.util.List;

public interface StationDistanceDao {
    List<String> getAllStationDistance();

    void calculateDistance(double stationDistance);

}
