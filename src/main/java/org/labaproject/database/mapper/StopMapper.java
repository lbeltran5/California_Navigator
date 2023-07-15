package org.labaproject.database.mapper;

import org.labaproject.database.model.House;
import org.labaproject.database.model.Stop;

import java.util.List;

public interface StopMapper {
    Stop getStopById(int stopId);
    List<Stop> getAllStop();
    void addStop(Stop stop);
    void updateStop(Stop stop);
    void deleteStop(int stopId);
}
