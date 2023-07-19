package org.labaproject.database.dao;

import org.labaproject.database.mapper.StationDistanceMapper;

import java.util.List;

public class StationDistanceDaoImpl implements StationDistanceDao{
public final StationDistanceMapper stationDistanceMapper;

    public StationDistanceDaoImpl(StationDistanceMapper stationDistanceMapper) {
        this.stationDistanceMapper = stationDistanceMapper;
    }
    @Override
   public List<String> getAllStationDistance() {
        return stationDistanceMapper.getAllStationDistance();
    }
    @Override
    public void calculateDistance(double stationDistance) {
        stationDistanceMapper.calculateDistance(String.valueOf(stationDistance));
    }


}
