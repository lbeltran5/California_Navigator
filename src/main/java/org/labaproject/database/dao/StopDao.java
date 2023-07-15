package org.labaproject.database.dao;

import org.labaproject.database.model.Cities;
import org.labaproject.database.model.Stop;

import java.util.List;

public interface StopDao {

    // These interfaces have methods for CRUD operations
    // (CREATE, READ, UPDATE, DELETE)
    Stop getStopById(int stopId);
    List<Stop> getAllStop();

    void addStop(Stop stop);
    void updateStop(Stop stop);
    void deleteStop(int stopId);
}
