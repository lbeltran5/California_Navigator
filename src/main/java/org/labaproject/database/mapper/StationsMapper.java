package org.labaproject.database.mapper;

import org.labaproject.database.model.Stations;

import java.util.List;

public interface StationsMapper {

    List<Stations> getAllStations();
    int getStationID();
}
