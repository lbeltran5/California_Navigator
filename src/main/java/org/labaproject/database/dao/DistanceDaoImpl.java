package org.labaproject.database.dao;

import org.labaproject.database.mapper.CitiesMapper;
import org.labaproject.database.mapper.DistanceMapper;
import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Distance;

import java.util.List;

public class DistanceDaoImpl implements DistanceDao{
    private final DistanceMapper distanceMapper;

    public DistanceDaoImpl(DistanceMapper distanceMapper) {
        this.distanceMapper = distanceMapper;
    }

    @Override
    public Distance getDistanceById(int distanceId) {
        return distanceMapper.getDistanceById(distanceId);
    }

    @Override
    public List<Distance> getAllDistance() {
        return distanceMapper.getAllDistance();
    }

    @Override
    public void addDistance(Distance distance) {
        distanceMapper.addDistance(distance);
    }

    @Override
    public void updateDistance(Distance distance) {
        distanceMapper.updateDistance(distance);
    }

    @Override
    public void deleteDistance(int distanceId) {
        distanceMapper.deleteDistance(distanceId);
    }

}
