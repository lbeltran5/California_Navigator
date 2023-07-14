package org.labaproject.database.dao;

import org.labaproject.database.mapper.HouseMapper;
import org.labaproject.database.mapper.StopMapper;
import org.labaproject.database.model.Stop;

import java.util.List;

public class StopDaoImpl implements StopDao {
    private final StopMapper stopMapper;

    public StopDaoImpl(StopMapper stopMapper) {
        this.stopMapper = stopMapper;
    }

    @Override
    public Stop getStopById(int stopId) {
        return stopMapper.getStopById(stopId);
    }


    @Override
    public List<Stop> getAllStop() {
      return stopMapper.getAllStop();
    }

    @Override
    public void addStop(Stop stop) {
        stopMapper.addStop(stop);
    }

    @Override
    public void updateStop(Stop stop) {
        stopMapper.updateStop(stop);
    }

    @Override
    public void deleteStop(int stopId) {
        stopMapper.deleteStop(stopId);
    }
}


