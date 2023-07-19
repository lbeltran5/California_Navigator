package org.labaproject.database.dao;

import org.labaproject.database.model.Stations;

import java.util.List;

public interface StationsDao {

    List<Stations> getAllStations();

    int getStationID(String stationName);
}
